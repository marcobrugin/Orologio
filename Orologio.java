package orologio;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Orologio  extends JPanel implements ActionListener {
	Timer t,t1,t2;
	int x;
	int y;
	double ora;
	double minuti=0;
	int x2,y2,x3,y3;
	double alfa=0;
	double alfa1,alfa2;
	int x1,y1;
	public Orologio() {
		super();
		Calendar calendar=new GregorianCalendar();
		int s=calendar.get(Calendar.SECOND);
		int f=calendar.get(Calendar.MINUTE);
		int c=calendar.get(Calendar.HOUR);
		alfa=6*s;
		alfa1=6*f+s*6/60;
		alfa2=c*30+f*30/60;	
		x=225;
		y=225;
		repaint();
		t=new Timer(500,this);		//secondi;	//minuti 
		x1=0;
		y1=0;	
		t.start();
	}
	public void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		Graphics2D g=(Graphics2D) g1;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); 
		
		BasicStroke b=new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g.setStroke(b);
		g.drawOval(150, 150, 150, 150);
		x1=(int) (x+(Math.sin(Math.toRadians(alfa))*75));
		y1=(int)(y-Math.cos(Math.toRadians(alfa))*75);
		g.setColor(Color.red);
		g.drawLine(x, y, x1, y1);
		g.setColor(Color.ORANGE);
		x2=(int) (x+(Math.sin(Math.toRadians(alfa1))*60));
		y2=(int)(y-Math.cos(Math.toRadians(alfa1))*60);
		g.drawLine(x, y, x2, y2);
		g.setColor(Color.BLACK);
		x3=(int) (x+(Math.sin(Math.toRadians(alfa2))*50));
		y3=(int)(y-Math.cos(Math.toRadians(alfa2))*50);
		g.drawLine(x, y, x3, y3);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==t) {
			Calendar calendar=new GregorianCalendar();
			int s=calendar.get(Calendar.SECOND);
			int f=calendar.get(Calendar.MINUTE);
			int c=calendar.get(Calendar.HOUR);
			alfa=6*s;
			alfa1=6*f+s*6/60;
			alfa2=c*30+f*30/60;	
			repaint();
		}	
	}

}
