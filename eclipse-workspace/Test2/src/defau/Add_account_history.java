package defau;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Add_account_history 	//Class AccountWrite
{

	public static void main(String[] args) 	//public AccountWrite()	//생성자
	{
		DateFormat accounte_dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	
		
		JFrame account_add_frame = new JFrame("Add Transaction History");
		JLabel acoount_add_main_label = new JLabel("Add Transaction History");
		JLabel account_add_date_label = new JLabel("Enter the date(year, Month, Day)");
		JLabel account_add_item_label = new JLabel("Enter the item name");
		JLabel account_add_price_label = new JLabel("Enter the price");
		JFormattedTextField account_date_textfield = new JFormattedTextField(accounte_dateFormat);
		JButton account_add_yes_btn = new JButton("Save");

		//setAccountDate(int, string)
		//마우스 버튼 클릭 -> 이벤트 클릭:set호출(입력된 값이 벡터로 들어가)
		
		account_date_textfield.addKeyListener(new KeyAdapter()
		{
		    public void keyTyped(KeyEvent e)
		    {
		      char c = e.getKeyChar();
		      //String getAccountDate(int edit_index)	//edit_index: 지금까지 호출된 횟수+1	//String: date를 돌려준다
		      if (!((c >= '0') && (c <= '9') ||
		         (c == KeyEvent.VK_BACK_SPACE) ||
		         (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH)))        
		      {
		        JOptionPane.showMessageDialog(null, "Please Enter Valid");
		        e.consume();
		      }
		    }
		  });
		
		
		
		
		account_add_frame.setLayout(null);
		account_add_frame.setBounds(500,100,400,600);
		
		
		acoount_add_main_label.setBounds(50, 10, 300, 50);
		account_add_date_label.setBounds(10, 80, 300, 35);
		account_add_item_label.setBounds(10, 150, 300, 35);
		account_add_price_label.setBounds(10, 250, 300, 35);
	
		account_date_textfield.setBounds(10, 100, 300, 35);
		
		account_add_yes_btn.setBounds(50, 450, 100, 30);

		
		account_add_frame.add(acoount_add_main_label);
		account_add_frame.add(account_add_date_label);
		account_add_frame.add(account_date_textfield);
		account_add_frame.add(account_add_item_label);
		account_add_frame.add(account_add_price_label);
		account_add_frame.add(account_add_yes_btn);

		
		account_add_frame.setVisible(true);

	}

}
