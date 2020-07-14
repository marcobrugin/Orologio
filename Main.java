package orologio;
import java.awt.*;
import javax.swing.*;
/**
  *  Grafica 
 * @author Marco Brugin
 * Orologio Analogico.
 * Classe 4^AI
 */
public class Main extends JFrame  {

	public Main() {
		super();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setMaximumSize(new Dimension(500,500));
		Container c=this.getContentPane();
		Orologio d=new Orologio();
		c.add(d);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		String t="La lancetta dei secondi è quella rossa ";
		JOptionPane.showMessageDialog(null,t);
		t="La lancetta dei minuti è quella gialla ";
		JOptionPane.showMessageDialog(null,t);
		 t="La lancetta delle ore  è quella nera ";
		JOptionPane.showMessageDialog(null,t);
		new Main();

	}

}
