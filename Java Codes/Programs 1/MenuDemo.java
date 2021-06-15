import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class MenuDemo extends JFrame
{
	JMenu indianMenu, southindianMenu, chineseMenu;
	

	JMenuBar menuBar;

	
	public MenuDemo()
	{
		menuBar = new JMenuBar();	
	

		indianMenu = new JMenu("INDIAN");
		southindianMenu = new JMenu("SOUTH INDIAN");
		chineseMenu = new JMenu("CHINESE");
	
		menuBar.add(indianMenu);
				
		menuBar.add(southindianMenu);
		
	
		menuBar.add(chineseMenu);
		
		setJMenuBar(menuBar);
		setTitle("JMenu Demo");
		setSize(300, 300);
		setVisible(true);

		
			
	}
	public static void main(String [] args)
	{
		MenuDemo mobj = new MenuDemo();
		
	}
}