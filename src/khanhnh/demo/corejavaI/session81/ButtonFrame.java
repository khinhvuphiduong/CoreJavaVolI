package khanhnh.demo.corejavaI.session81;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToolBar;

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
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//fix last button always fills layout
		contentPane.setLayout(new FlowLayout());
		
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
}


