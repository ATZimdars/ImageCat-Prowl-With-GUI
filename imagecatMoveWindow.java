import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class imagecatMoveWindow
{
	public static int after1 = 0;
	public static String jsonLoc = ("");
	public static String indexLoc = ("");
	public static boolean done = false;
	public static boolean run = false;
	//Json File Location

	
	public static File jsonIn = new File(jsonLoc);
	
//Index File Location
	
	public static File indexIn = new File(indexLoc);
	
	public static void main(String[]args) throws IOException
	{	
		JFrame base = new JFrame("Imagecat Prowl");
		base.setPreferredSize(new Dimension (400,100));
		base.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				done = true;
			}
		});
		
		JLabel one = new JLabel("  JSON: ");
		JLabel two = new JLabel("  INDEX: ");
		JTextField three = new JTextField("Location");
		JTextField four = new JTextField("Location");
		JButton done = new JButton("Start");
		JLabel after = new JLabel("----");
		
		base.setLayout(new GridLayout(3,2));
		base.getContentPane().add(one);
		base.getContentPane().add(three);
		base.getContentPane().add(two);
		base.getContentPane().add(four);
		base.getContentPane().add(done);
		base.getContentPane().add(after);
		base.pack();
		base.setVisible(true);

		if(run == true)
		{
			imagecatProwl.runner();
			run = false;
		}
		done.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				jsonLoc= three.getText();
				indexLoc = four.getText();
				run = true;
				if(after1 == 1)
				{
					after.setText("Done");
					base.repaint();
				}
				if(after1 == 2)
				{
					after.setText("Error");
					base.repaint();
					
				}
				
			}
		});
	}

}
