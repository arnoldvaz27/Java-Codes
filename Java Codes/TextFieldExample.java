import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample  implements ActionListener
{
	JLabel lb;
	JButton jb1,jb2,jb3,jb4,jb5;
	JTextField tf1,tf2;
	
	TextFieldExample()
	{
		JFrame frame = new JFrame("MY CALCULATOR");		
		lb = new JLabel();
		lb.setBounds(50,50,200,20);
		tf1 = new JTextField();
		tf1.setBounds(50,100,200,20);
		tf2 = new JTextField();
		tf2.setBounds(50,150,200,20);
		jb1 = new JButton("+");
		jb1.setBounds(50,200,50,50);
		jb2 = new JButton("-");
		jb2.setBounds(100,200,50,50);
		jb3 = new JButton("/");
		jb3.setBounds(150,200,50,50);
		jb4 = new JButton("*");
		jb4.setBounds(200,200,50,50);
		jb5 = new JButton("%");
		jb5.setBounds(50,250,50,50);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		frame.add(lb);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(jb1);
		frame.add(jb2);
		frame.add(jb3);
		frame.add(jb4);
		frame.add(jb5);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		double a = Double.parseDouble(s1);
		double b = Double.parseDouble(s2);
		double c = 0;
		if (e.getSource() == jb1)
		{	
			c=a+b;
		}
		if(e.getSource() == jb2 )
		{
			c=a-b;
		}
		if(e.getSource() == jb3)
		{	
			c=a/b;
		}			
		if(e.getSource() == jb4)
		{
			c = a*b;
		}
		if(e.getSource() == jb5)
		{
			c =a %b ;
		}
		String result = String.valueOf(c);
			lb.setText(result);		
			
	}
	public static void  main(String[] args)
	{
		new TextFieldExample();
	}
}