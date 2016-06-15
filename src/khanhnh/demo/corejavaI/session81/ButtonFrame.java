package khanhnh.demo.corejavaI.session81;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class ButtonFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonFrame frame = new ButtonFrame();
					//Show frame center of screen
					frame.setLocationRelativeTo(null);
					
										frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		
		JButton btnYellow=new JButton("Yellow");
		btnYellow.setBounds(30,20,100,50);
		
		JButton btnRed=new JButton("Red");
		btnRed.setBounds(135, 20, 100, 50);
		
		JButton btnBlue=new JButton("Blue");
		btnBlue.setBounds(240, 20, 100, 50);
		
		ColorAction blueaction=new ColorAction("Blue", new ImageIcon("index.jpg"), Color.BLUE);
		btnBlue.setAction(blueaction);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//fix last button always fills layout
		contentPane.setLayout(new FlowLayout());
		
		ColorAction yellowAction=new ColorAction("Yellow Action", new ImageIcon("index.jpg"), Color.YELLOW);
		InputMap imap=contentPane.getInputMap(JComponent.WHEN_FOCUSED);
		imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
		ActionMap amap=contentPane.getActionMap();
		amap.put("panel.yellow", yellowAction);
		
		contentPane.add(btnYellow);
		contentPane.add(btnRed);
		contentPane.add(btnBlue);
		
		
		//ColorAction yellowaction = new ColorAction(Color.yellow, btnYellow);
		//btnYellow.addActionListener(yellowaction);
		
		setContentPane(contentPane);
		//Button not fills panel
		//getContentPane().setLayout(null);
	}
	
//	class ColorAction implements ActionListener{
//
//		private Color bgc;
//		private JButton btn;
//		
//		public ColorAction(Color c, JButton btn){
//			bgc=c;
//			this.btn=btn;
//		}
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			btn.setBackground(bgc);
//		}
//		
//	}
	
	class Terminator implements WindowListener{


		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class ColorAction extends AbstractAction{
		
		public ColorAction(String name, Icon icon, Color c){
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue("color", c);
			putValue(Action.SHORT_DESCRIPTION, "Set Panel color to"+name.toLowerCase());
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("color");
			
			JPanel  panel=(JPanel )e.getSource();
			//JPanel frame=(JPanel)btn.getParent();
			panel.setBackground(c);
			
			//JOptionPane.showMessageDialog(null, btn.getpa);
		}
	}
}



