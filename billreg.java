//package bill;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class billreg  extends JFrame 
{
	private static final Color Color = null;
	private static final String BLUE = null;
	private static final String RED = null;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JTextField tname,tqty,trate,ttotal,tpaid,tdue;
/*	private JPasswordField tpass;
	private JTextArea tadd;
	private JComboBox city,day,month,year;
	private JCheckBox cmo,cmu,cco;
	private JRadioButton rmale,rfemale;*/
	private JButton bbook,bcancel,btotal_bill,bback;
//	private String sysdate;
	//private final JMenuBar jmenubar;
	//private final JMenu jmenu;
	//private final JMenuItem jmenuregister,jmenushowall;
	ArrayList<customerbill> userlist;
	customerbill r;
	public billreg(String title)
	{
		super(title);
		Container c=getContentPane();
		c.setLayout(new GridLayout(16,2));
		tname=new JTextField(20);
		tqty=new JTextField(20);
		trate=new JTextField(20);
		ttotal=new JTextField(20);
		tpaid =new JTextField(20);
		tdue =new JTextField(20);
		/*temailid =new JTextField(20);
		tmobno=new JTextField(20);
		tadd=new JTextArea(5,20);
		JScrollPane tapan=new JScrollPane(tadd);
		String ctvalue[]={"KOLKATA","DELHI","MUMBAI","CHENNAI","HYDRABAD","PUNE","BANGALORE"};
		city=new JComboBox(ctvalue);
		rmale=new JRadioButton("MALE");
		rfemale=new JRadioButton("FEMALE");
		ButtonGroup rgroup=new ButtonGroup();
		rgroup.add(rmale);
		rgroup.add(rfemale);
		JPanel gpanel=new JPanel();
		gpanel.add(rmale);
		gpanel.add(rfemale);
		String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		day=new JComboBox(dvalue);
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		month=new JComboBox(mvalue);
		String yvalue[]=new String[21];
		int cnt=0;
		for(int i=2000;i<=2016;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;
		}
		year=new JComboBox(yvalue);
		JPanel cpanel=new JPanel();
		cpanel.add(day);
		cpanel.add(month);
		cpanel.add(year);
		
		cmo=new JCheckBox("MOVIE");
		cmu=new JCheckBox("MUSIC");	
		cco=new JCheckBox("COMPUTER");
		
		JPanel ipanel= new JPanel();
		ipanel.add(cmo);
		ipanel.add(cmu);
		ipanel.add(cco);*/

		bbook =new JButton("BOOK");
		bbook.addActionListener((e)->
		{
			addInformation();
		});
		bcancel=new JButton("cancel");
		bcancel.addActionListener((e)->
		{
			new display();
		});
		btotal_bill=new JButton("total_bill");
		btotal_bill.addActionListener((e)->
		{
			new display();
		});
		bback=new JButton("BACK");
		bback.addActionListener((e)->
		{
			new customerreg("CUSTOMER DETAILS");
		});
	/*	bclearall=new JButton("RESET all");
		bclearall.addActionListener((e)->
		{
			resetFrame();
		});*/
		Font f=new Font("Chiller",Font.BOLD,40);
		l1=new JLabel("BILL");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("NAME");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		l3=new JLabel("QTY");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
		l4=new JLabel("RATE");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		
		
		l5=new JLabel("TOTAL");
		l5.setFont(f1);
		l5.setForeground(Color.RED);
		
		l6=new JLabel("PAID");
		l6.setFont(f1);
		l6.setForeground(Color.RED);
		
		l7=new JLabel("DUE");
		l7.setFont(f1);
		l7.setForeground(Color.RED);
		
		/*l14=new JLabel("DATE");
		l14.setFont(f1);
		l14.setForeground(Color.RED);
		
		l15=new JLabel("ENTER MOBNO");
		l15.setFont(f1);
		l15.setForeground(Color.RED);
		
		l4=new JLabel("ENTER ADDRESS");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		
		l5=new JLabel("SELECT CITY");
		l5.setFont(f1);
		l5.setForeground(Color.RED);
		
		l6=new JLabel("SELECT GENDER");
		l6.setFont(f1);
		l6.setForeground(Color.RED);
		
		l7=new JLabel("SELECT DOB");
		l7.setFont(f1);
		l7.setForeground(Color.RED);
		
		l8=new JLabel("SELECT INTERESTS");
		l8.setFont(f1);
		l8.setForeground(Color.RED);
		
		l9=new JLabel("CURRENT DATE");
		l9.setFont(f1);
		l9.setForeground(Color.RED);*/
		
		/*LocalDate today=LocalDate.now();
		int day=today.getDayOfMonth();
		int month=today.getMonthValue();
		int year=today.getYear();
		
		sysdate=day+"/"+month+"/"+year;
		l11=new JLabel(sysdate);
		
		/*LocalTime time=LocalTime.now();
		int hr=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		
		systime=hr+"/"+min+"/"+sec;
		l12=new JLabel(systime);
		
		l10=new JLabel("Current Time");
		l10.setFont(f1);
		l10.setForeground(Color.RED);*/
		
		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tname);
		c.add(l3);c.add(tqty);
		c.add(l4);c.add(trate);
		c.add(l5);c.add(ttotal);
		c.add(l6);c.add(tpaid);
		c.add(l7);c.add(tdue);
		/*c.add(l14);c.add(temailid);
		c.add(l15);c.add(tmobno);
		c.add(l4);c.add(tapan);
		c.add(l5);c.add(city);
		c.add(l6);c.add(gpanel);
		c.add(l7);c.add(cpanel);
		c.add(l8);c.add(ipanel);
		c.add(l9);c.add(l11);
		c.add(l10);c.add(l12);*/
		c.add(bbook);c.add(bcancel);
		c.add(btotal_bill);c.add(bback);
		
		setSize(450,600);
		setLocation(200,200);
		setResizable(false);
		setVisible(true);
	}
	
	public void createRegObj()
	{
		String name,qty,rate,total,paid,due;
		
		name=tname.getText().trim();
		qty=tqty.getText().trim();
		rate=trate.getText().trim();
		total=ttotal.getText().trim();
		paid=tpaid.getText().trim();
		due=tdue.getText().trim();
		/*emailid=temailid.getText().trim();
		mobno=tmobno.getText().trim();
		add=tadd.getText().trim();
		ct=(String)city.getSelectedItem();*/
		
	/*	gn="";
		if(rmale.isSelected())
		{
			gn="MALE";
		}
		else if(rfemale.isSelected())
		{
			gn="FEMALE";
		}
		String d=(String)day.getSelectedItem();
		String m=(String)month.getSelectedItem();
		String y=(String)year.getSelectedItem();
		dob=d+"."+m+"."+y;
		
		ins="";
		if(cmo.isSelected())
		{
			ins="MOVIE";
		}
		if(cmu.isSelected())
		{
			ins=ins+"MUSIC";
		}
		if(cco.isSelected())
		{
			ins=ins+"COMPUTER";
		}*/
		r=new customerbill(name,qty,rate,total,paid,due);
		
		
	}
	public void addInformation()
	{
		createRegObj();
		userlist=userdata.readDataFromFile();
		userlist.add(r);
		userdata.writeDatatoFile(userlist);
		JOptionPane.showMessageDialog(this, "booking successful...");
		resetFrame();
		
	}
	public void resetFrame()
	{
		this.dispose();
		new billreg("FINAL BILL");
	}
	public static void main(String args[])
	{
		new billreg("FINAL BILL");
	}
}
