package defau;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;
public class Every_5thn_vector
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Vector <String> account_date = new Vector<String>();
		Vector <String> account_item = new Vector<String>();
		Vector <Integer> account_price = new Vector<Integer>();
//		Vector <JButton> account_modify_btn = new Vector<JButton>();
//		Vector <JButton> account_delete_btn = new Vector<JButton>();
		
		int max_account_item_string_length=0;
		
		int account_table_column = 6+1;	//이건 나중에 set 호출한 횟수 혹은 추가 버튼 누른 횟수로 받아온다.
		int account_table_row = 5;
		int account_main_frame_width;
		int account_main_frame_height;
		
		JFrame account_main_frame = new JFrame("Account Book");
		JLabel account_title_label = new JLabel("Account Book");
	//	JButton refresh_button = new JButton("Refresh");
		ImageIcon refresh_image = new ImageIcon("C:\\Users\\ASUS\\refresh_btn_img2.png");
		 	Image img = refresh_image.getImage() ;  
		   Image newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
		  ImageIcon icon = new ImageIcon( newimg );
		JButton refresh_button = new JButton(icon);
		JButton add_deal_button = new JButton("Add transaction history");
		JPanel account_table_pannel = new JPanel();
		
		JButton[] account_modify_button;
		JButton[] account_delete_button;
		account_modify_button = new JButton[account_table_column];
		account_delete_button = new JButton[account_table_column];
		
		
		JLabel[][] account_table_label;	// = new JLabel[3];
	//	JLabel[] account_table_label_item;
		
		account_main_frame.setLayout(null);
	//	account_main_frame.setLayout(new FlowLayout());
	
		account_main_frame.getContentPane().setBackground(Color.WHITE);;
		
		account_table_pannel.setLayout(null);

		account_table_pannel.setLayout(new GridLayout(account_table_column,account_table_row));
		account_table_pannel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		account_table_pannel.setBackground(Color.WHITE);
	//	account_table_pannel.setBounds(100, 50, 10, (30*account_table_column));
	

//		account_table_column = account_date.size();
		
		account_table_label = new JLabel[account_table_column][account_table_row];
	//	account_table_label_item = new JLabel[account_table_column];
		
		
		//while

			account_date.add("date");
			account_item.add("item");
			account_price.add(null);
			
			account_table_label[0][0] = new JLabel(account_date.get(0));
			account_table_label[0][1] = new JLabel(account_item.get(0));
			account_table_label[0][2] = new JLabel("price");
			account_table_label[0][3]= new JLabel("Modify");
			account_table_label[0][4]= new JLabel("Delete");
		
		for(int i=0; i<5; i++)
		{
			account_table_label[0][i].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
			account_table_pannel.add(account_table_label[0][i]);

			account_table_label[0][i].setVerticalAlignment(SwingConstants.CENTER);
			account_table_label[0][i].setHorizontalAlignment(SwingConstants.CENTER);
			account_table_label[0][i].setFont(new Font("Courier New", Font.PLAIN, 15));

		}
		

		
		for (int i=1; i<account_table_column; i++)
		{
			
	//		account_date.add(getAccountDate(i));//	get으로 Date 받아온다.
			account_date.add(i+"th day");			//나중에 date함수로 받아오기
			account_table_label[i][0] = new JLabel(account_date.get(i));
			account_table_label[i][0].setSize(80, 35);

			
	//		account_item.add(getAccountItem(i));
			account_item.add(i*1000000+"stuff");	//나중에 받아와
	//		account_table_label_item[i] = new JLabel(account_item.get(i));
			account_table_label[i][1] = new JLabel(account_item.get(i));
			if(max_account_item_string_length<account_item.get(i).length())
			{
				max_account_item_string_length = account_item.get(i).length();	//나중에 재정의
			}
			account_table_label[i][1].setSize(max_account_item_string_length+10, 35);
			
			
			account_price.add(i*1500);
			account_table_label[i][2] = new JLabel(account_price.get(i)+"won");
			account_table_label[i][2].setSize(80, 35);
			
	//		account_table_label[i][4].getBorder();
		//	account_table_label[i][4].setLayout(new BorderLayout());
	//		account_table_label[i][4].setPreferredSize(new Dimension(200,100));
			account_table_label[i][3] = new JLabel();
			account_table_label[i][3].setSize(80, 35);
			
	//		account_modify_button.setVisible(true);
//			account_table_label[i][4].setText("Modify");
//			account_table_label[i][4].setSize(100, 30);
			account_modify_button[i] = new JButton("Click");
//			account_modify_button[i].setSize(70, 25);
	//		account_modify_button[i].setBackground(null);
			account_modify_button[i].setBackground(Color.lightGray);
			account_modify_button[i].setBorder(null);
			account_modify_button[i].setBounds((max_account_item_string_length*6+64)/2-35, 5, 70, 25);
			account_table_label[i][3].add(account_modify_button[i]);
			
			
			account_table_label[i][4] = new JLabel();
			account_table_label[i][4].setSize(80, 35);
			account_delete_button[i] = new JButton("Click");
			account_delete_button[i].setBackground(Color.lightGray);
		//	account_delete_button[i].setBackground(null);
//			account_delete_button[i].setSize(75, 30);
		//	account_delete_button[i].setBounds(5, 5, 70, 25);
			account_delete_button[i].setBounds((max_account_item_string_length*6+64)/2-35, 5, 70, 25);
			account_delete_button[i].setBorder(null);
			account_table_label[i][4].add(account_delete_button[i]);

			
			
			
			
			
			
			for(int j=0; j<account_table_row; j++)
			{
				account_table_label[i][j].setFont(new Font("Courier New", Font.PLAIN, 15));

				account_table_label[i][j].setVerticalAlignment(SwingConstants.CENTER);
				account_table_label[i][j].setHorizontalAlignment(SwingConstants.CENTER);
	//			account_table_label[i][j].getBounds();
				account_table_label[i][j].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
				account_table_pannel.add(account_table_label[i][j]);
			}
		}
		
		account_table_column = account_date.size();
		
		account_main_frame_width = 100+((account_table_row-1)*80+max_account_item_string_length*30);
		account_main_frame_height = ((account_table_column*35)+250);
		account_main_frame.setBounds(120,120,account_main_frame_width,account_main_frame_height);
		
		account_table_pannel.setBounds(50, 100, ((account_table_row-1)*80+max_account_item_string_length*30), (account_table_column*35));
		
		
		
	//	account_title_label.setLayout(null);
		account_title_label.setBounds((account_main_frame_width/2)-130,20,250, 50);
	//	account_title_label.setSize(200, 50);
		account_title_label.setVerticalAlignment(SwingConstants.CENTER);
		account_title_label.setHorizontalAlignment(SwingConstants.CENTER);
	//	account_title_label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		account_title_label.setFont(new Font("Courier New", Font.BOLD, 30));
		account_main_frame.add(account_title_label);
		
	

		refresh_button.setBorder(null);
		refresh_button.setMargin(new Insets(30, 30, 30, 30));
		refresh_button.setBounds((account_main_frame_width-50),10,30, 30);
	//	refresh_button.setVerticalAlignment(SwingConstants.TOP);
	//	refresh_button.setHorizontalAlignment(SwingConstants.RIGHT);
		refresh_button.setFont(new Font("Courier New",Font.BOLD, 12)	);
	//	refresh_button.setBackground(Color.LIGHT_GRAY);
		refresh_button.setBackground(null);
		account_main_frame.add(refresh_button );
		refresh_button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        Component component = (Component) e.getSource();
		        JFrame frame = (JFrame) SwingUtilities.getRoot(component);
		        frame.revalidate();
		        System.out.println("refresh OK");
		        
		      }
		    });

		add_deal_button.setBorder(null);
		add_deal_button.setBounds(account_main_frame_width-230,account_main_frame_height-80, 200, 30);
	//	add_deal_button.setBackground(Color.LIGHT_GRAY);
	//	add_deal_button.setBackground(Color.black);
		add_deal_button.setFont(new Font("Courier New",Font.BOLD, 12));
		account_main_frame.add(add_deal_button);
		
//		account_table_pannel.setBounds(50,(10*account_table_column),10,50);
//		account_table_pannel.setAlignmentX(200); //.setVerticalAlignment(SwingConstants.CENTER);
//		account_table_pannel.setAlignmentY(500);
//		account_table_pannel.bounds();
//		account_table_pannel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		account_main_frame.add(account_table_pannel);

		
		account_main_frame.setVisible(true);

		
		
	
	
	}
	
	
	 
	static String getAccountDate(int edit_index)
	{
		String account_date_string = null;

		return account_date_string;
	}
	public void setAccountDate(int edit_index, String edit_date)
	{
	//	Vector <String> account_date;
	//	SimpleDateFormat account_date_sdf = new SimpleDateFormat("yyyy/MM/dd");
	 //   Date account_date_date=null;
  //    sdf.applyPattern("yyyy/MM/dd");
	 //    edit_date = account_date_sdf.format(account_date_date);
	//	DateFormat account_date_dateformat = new SimpleDateFormat("dd/MM/yyyy");
	//	String account_date_string = account_date_dateformat.format(new Date(20100000+edit_index*1000));
	//	account_date_string="init_date"+edit_index+"th";
		
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		JFormattedTextField txtDate = new JFormattedTextField(df);
		txtDate .addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		      char c = e.getKeyChar();
		      if (!((c >= '0') && (c <= '9') ||
		         (c == KeyEvent.VK_BACK_SPACE) ||
		         (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH)))        
		      {
		        JOptionPane.showMessageDialog(null, "Please Enter Valid");
		        e.consume();
		      }
		    }
		  });
		
	}
	public static String getAccountItem(int edit_index)
	{
		String account_item_string="init_item";
		return account_item_string;
	}
/*	public void setAccountItem(int edit_index, String edit_item)
	{
		
	}
	public int getAccountPrice(int edit_index)
	{
		
	}
	public int setAccountPrice(int edit_index, int edit_price)
	{
		
	}
	
*/	
	
	public static JButton createButton()
	{
		JButton button =new JButton();
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setFocusable(false);
		button.setMargin(new Insets(0,0,0,0));
		button.setContentAreaFilled(false);
//		button.setIcon(null);
		button.setText("MM");
		return button;
	}

	

	
}


class MouseEventHandler implements MouseListener
{
//	public void mouseClicked(MouseEvent e)
//	{		
//		e.removeremoveAll();
//	}
	@SuppressWarnings("deprecation")
	public void mouseClicked(MouseEvent e)
	{
//		JFrame fr = (JFrame)e.getComponent();
		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
	//	System.out.println("Clicked Button"+e.getButton());
	//	System.out.println("Clicked mouse and then released");
		
		
//		fr.removeAll();
//		fr.repaint();
//		fr.resize(600,600);
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("커서 버튼 위 진입");			
	}
	public void mouseExited(MouseEvent e) 
	{
		System.out.println("커서 버튼 위 탈출");
	}
	public void mousePressed(MouseEvent e) 
	{
		System.out.println("마우스 버튼 눌림");
	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("마우스 버튼 풀림");
	}
}
