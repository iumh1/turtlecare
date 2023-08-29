/**
 * 
 */
package ui;

import java.awt.*;
import javax.swing.*;

/**
 * 
 */
public class MainWindow extends JFrame {
	
	public MainWindow() {
		super("Turtlecare - Main Window");
		
		GraphicsDevice monres = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		
		JPanel state = new JPanel();    
	    JPanel set = new JPanel();  
	    JPanel setting = new JPanel();
		
	    JTabbedPane tp = new JTabbedPane();
	    
	    Dimension tabbedbtsize = new Dimension(150, 100);
	    
	    JLabel jl_state = new JLabel("state");
	    JLabel jl_set = new JLabel("set");
	    JLabel jl_setting = new JLabel("setting");
	    
	    jl_state.setPreferredSize(tabbedbtsize);
	    jl_set.setPreferredSize(tabbedbtsize);
	    jl_setting.setPreferredSize(tabbedbtsize);
	    
	    
	    tp.add("state", state);  
	    tp.add("set", set);  
	    tp.add("setting", setting); 

	    tp.setTabComponentAt(0, jl_state);
	    tp.setTabComponentAt(1, jl_set);
	    tp.setTabComponentAt(2, jl_setting);
	    
	    tp.setBounds(0, 0, monres.getDisplayMode().getWidth(), monres.getDisplayMode().getHeight());	    
	    add(tp, BorderLayout.CENTER);
		
		setLayout(new BorderLayout());
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		pack();
		setVisible(true);
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new MainWindow();
		
	}

}
