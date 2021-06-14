import java.awt.*;
import java.awt.event.*;

public class FactorialGui extends Frame implements ActionListener {
    TextField tf1,tf2;
    public FactorialGui()
    {
        setLayout(new FlowLayout());
        Label lb1=new Label("Enter  number:");
        Label lb2=new Label("Factorial is:");

        tf1=new TextField(15);
        tf2=new TextField(15);
        Button btn1=new Button("Calculate");
        add(lb1); add(tf1);
        add(lb2); add(tf2);
        add(btn1);
        btn1.addActionListener(this);
    }
    public static void main(String ar[])
    {
        FactorialGui fr=new FactorialGui();
        fr.setSize(300,300);
        fr.setTitle("Calculating Factorial");
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n,f=1,i;
        n=Integer.parseInt(tf1.getText());
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        tf2.setText(""+f);
    }
}
