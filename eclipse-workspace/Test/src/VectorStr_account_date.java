import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Date;
//import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VectorStr_account_date {

	public static void main(String[] args) throws ParseException
	{
		
		Vector<String> myVector=new Vector<String>(); //declare vector
  /*      String sample="tester";       //test string declared
        String holder;                         //Will hold the value of an element in the array
        
        myVector.add(sample);            //adds sample's value to the vector
		myVector.add("  fuck up");
		
        holder=myVector.elementAt(0)+myVector.elementAt(1);
        
  */    
		
		int nm = 19;
		SimpleDateFormat[] sdf = new SimpleDateFormat[nm];
		
		int n = myVector.size();
  		System.out.println("size:"+n);
  

		
        System.out.println("Value is :");        //Displays the value
        
        for(int i=0; i<nm; i++)
        {	
        	sdf[i] = new SimpleDateFormat("yyyy�� mm�� dd��");
        	String[] ss = new String[nm];
       
        	ss[i] = "20171113";
        	sdf[i].format(ss[i]);
        
        	myVector.add(i, ss[i]);
    		System.out.println(myVector.get(i));
        }

        n = myVector.size();
        System.out.println("size:"+n);
		 

		
		
		
		
		
		
//		Scanner sn12 = new Scanner(System.in);
		// TODO Auto-generated method stub
//		int size = 2;
	//	String[] str = new String[2];
	//	Vector <String> account_date2 = new Vector<String>(50,50);
/*		Vector <String> account_item = new Vector<String>();
		Vector <Integer> account_price = new Vector<Integer>();
	*/	
		Date dTest;
/*		
		JFrame jf = new JFrame("date");
		JPanel jp = new JPanel();
		JLabel[] lb = new JLabel[size];
		DateFormat format2 = new SimpleDateFormat("2013-10-11");
		JFormattedTextField d_txtfield = new JFormattedTextField();
		
		jf.setLayout(new FlowLayout());
		jf.setBounds(120,120,500,300);
		
		
//		System.out.println("date:");
		String a_dateString = "20111013";
		SimpleDateFormat a_format = new SimpleDateFormat("yyyy-MM-dd");
	//	Date a_date2 = a_format.parse(a_dateString);
	//	System.out.println("date:");
	//	System.out.println(a_date);
		

		account_date2.add("20141414");
	
		dTest = format2.parse(account_date2.remove(0));
		
		
		d_txtfield.setPreferredSize(new Dimension(400,24));
		d_txtfield = new JFormattedTextField(dTest);
		
		
	/*	
		for(int i=0; i<2; i++)
		{

			if(i==0)
			{
				str[i] = "date";
				account_date2.add(str[i]);
				lb[i] = new JLabel(str[i]);
				jp.add(lb[i]);
			}
			else
			{
				d_txtfield[(i-1)].setPreferredSize( new Dimension( 400, 24 ) );
				
				account_date2.add("20111113");
				dTest = format2.parse(account_date2.get(i-1));
				d_txtfield[i] = new JFormattedTextField(dTest);
				jf.add(d_txtfield[(i-1)]);
			}


		}
*/	
//	jf.add(d_txtfield);

	//jf.setVisible(true);
		

		
		
	}

}
