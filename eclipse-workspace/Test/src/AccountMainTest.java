import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class AccountMainTest
{


	public static void main(String[] args) 
	{
/*		Vector <String> account_date = new Vector<String>();
		Vector <String> account_item = new Vector<String>();
		Vector <Integer> account_price = new Vector<Integer>();
	*/	
/*		JFrame account_main_frame = new JFrame("Account Book");
		JLabel account_title_label = new JLabel("Account Book");
		JButton refresh_button = new JButton("Refresh");
		MouseListener listener = new MouseEventHandler();
*/		
		account_main_frame.setBounds(500,300,400,400);
//		account_main_frame.setSize(400,400);
		account_main_frame.setLayout(new FlowLayout());
		
		account_title_label.setVerticalAlignment(SwingConstants.TOP);
		account_title_label.setHorizontalAlignment(SwingConstants.CENTER);
		
//		refresh_button.setSize(10, 10);
		refresh_button.setLocation(400, 0);
//		refresh_button.setVerticalAlignment(SwingConstants.TOP);
//		refresh_button.setHorizontalAlignment(SwingConstants.RIGHT);
		refresh_button.addMouseListener(listener);
		
		account_main_frame.add(account_title_label);
		account_main_frame.add(refresh_button);
		
		account_main_frame.setVisible(true);
	}

}
/*

class MouseEventHandler implements MouseListener
{
	public void mouseClicked(MouseEvent e)
	{
/*		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("Clicked mouse and then released");
*/	}
/*
	public void mouseEntered(MouseEvent e)
	{
//		System.out.println("커서 버튼 위 진입");			
	}
	public void mouseExited(MouseEvent e) 
	{
//		System.out.println("커서 버튼 위 탈출");
	}
	public void mousePressed(MouseEvent e) 
	{
		
		JFrame fr = new JFrame();
		fr.removeAll();
//		System.out.println("마우스 버튼 눌림");
	}
	public void mouseReleased(MouseEvent e)
	{
//		System.out.println("마우스 버튼 풀림");
		JFrame fr = new JFrame();
		fr.invalidate();
		fr.validate();
		fr.repaint();
	}

}
*/
