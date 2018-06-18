//package moviedetails;
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


	public class mvframe extends JFrame 
	{
		private static final Color Color = null;
		private static final String BLUE = null;
		private static final String RED = null;
		private JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		private JTextField tmovie,tid,ttypes,tactor,tactress,tproducer,tdirector;
		//private JPasswordField tpass;
	//	private JTextArea tadd;
	//	private JComboBox city,day,month,year;
	//	private JCheckBox cmo,cmu,cco;
		//private JRadioButton rmale,rfemale;
		private JButton bregister,bshowall,bclearall,bsearch,bcdavailability,bcustomerreg,bback;
		//private String sysdate,systime;
		//private final JMenuBar jmenubar;
		//private final JMenu jmenu;
		//private final JMenuItem jmenuregister,jmenushowall;
		ArrayList<mvreg> userlist;
		mvreg r;
		public mvframe(String title)
		{
			super(title);
			Container c=getContentPane();
			c.setLayout(new GridLayout(16,2));
			tmovie=new JTextField(20);
			tid=new JTextField(20);
			ttypes =new JTextField(20);
			tactor =new JTextField(20);
			tactress =new JTextField(20);
			tproducer=new JTextField(20);
			tdirector=new JTextField(20);
		/*	tproducer=new JTextField(20);
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

			bregister =new JButton("Register");
			bregister.addActionListener((e)->
			{
				addInformation();
			});
			bshowall=new JButton("Showall");
			bshowall.addActionListener((e)->
			{
				new dp();
			});
			bclearall=new JButton("RESET all");
			bclearall.addActionListener((e)->
			{
				resetFrame();
			});
			
			bsearch=new JButton("SEARCH");
			bsearch.addActionListener((e)->
			{

				String movie=JOptionPane.showInputDialog("Enter the movie");
				int k=sr(movie);
			});
			bcdavailability =new JButton("AVAILABILITY");
			bcdavailability.addActionListener((e)->
			{
				addInformation();
			});
			bcustomerreg =new JButton("CUSTOMER REG");
			bcustomerreg.addActionListener((e)->
			{
				new customerreg("add infrmtn");
				//addInformation();
			});
			bback =new JButton("BACK");
			bback.addActionListener((e)->
			{
				new adminreg("ADMIN LOGIN");
				//addInformation();
			});
			
			Font f=new Font("Chiller",Font.BOLD,20);
			l1=new JLabel("MOVIE DETAILS");
			l1.setFont(f);
			l1.setForeground(Color.BLUE);
			
			Font f1=new Font("comic sans ms",Font.BOLD,12);
			l2=new JLabel("ENTER MOVIE NAME");
			l2.setFont(f1);
			l2.setForeground(Color.BLUE);
			
			l3=new JLabel("ENTER MOVIE ID ");
			l3.setFont(f1);
			l3.setForeground(Color.BLUE);
			
			l4=new JLabel("ENTER TYPES");
			l4.setFont(f1);
			l4.setForeground(Color.BLUE);
			
			l5=new JLabel("ENTER ACTOR");
			l5.setFont(f1);
			l5.setForeground(Color.BLUE);
			
			l6=new JLabel("ENTER ACTRESS");
			l6.setFont(f1);
			l6.setForeground(Color.BLUE);
			
			l7=new JLabel("ENTER PRODUCER");
			l7.setFont(f1);
			l7.setForeground(Color.BLUE);
			
			l8=new JLabel("ENTER DIRECTOR");
			l8.setFont(f1);
			l8.setForeground(Color.BLUE);
			
			/*l5=new JLabel("SELECT CITY");
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
			l9.setForeground(Color.RED);
			
			LocalDate today=LocalDate.now();
			int day=today.getDayOfMonth();
			int month=today.getMonthValue();
			int year=today.getYear();
			
			sysdate=day+"/"+month+"/"+year;
			l11=new JLabel(sysdate);
			
			LocalTime time=LocalTime.now();
			int hr=time.getHour();
			int min=time.getMinute();
			int sec=time.getSecond();
			
			systime=hr+"/"+min+"/"+sec;
			l12=new JLabel(systime);
			
			l10=new JLabel("Current Time");
			l10.setFont(f1);
			l10.setForeground(Color.RED);*/
			
			c.add(l1);c.add(new JLabel(""));
			c.add(l2);c.add(tmovie);
			c.add(l3);c.add(tid);
			c.add(l4);c.add(ttypes);
			c.add(l5);c.add(tactor);
			c.add(l6);c.add(tactress);
			c.add(l7);c.add(tproducer);
			c.add(l8);c.add(tdirector);
			//c.add(l5);c.add(city);
		//	c.add(l6);c.add(gpanel);
		//	c.add(l7);c.add(cpanel);
		//	c.add(l8);c.add(ipanel);
		//	c.add(l9);c.add(l11);
		//	c.add(l10);c.add(l12);
			c.add(bregister);c.add(bshowall);
			c.add(bclearall);c.add(bsearch);
			c.add(bcdavailability);c.add(bcustomerreg);
			c.add(bback);
			
			setSize(450,600);
			setLocation(200,200);
			setResizable(false);
			setVisible(true);
		}
		
		public void createRegObj()
		{
			String movie,id,types,actor,actress,producer,director;
			
			movie=tmovie.getText().trim();
			id=tid.getText().trim();
			types=ttypes.getText().trim();
			actor=tactor.getText().trim();
			actress=tactress.getText().trim();
			producer=tproducer.getText().trim();
			director=tdirector.getText().trim();
		/*	ct=(String)city.getSelectedItem();
			
			gn="";
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
			r=new mvreg(movie,id,types,actor,actress,producer);
			
			
		}
		public void addInformation()
		{
			createRegObj();
			userlist=ud.readDataFromFile();
			userlist.add(r);
			ud.writeDatatoFile(userlist);
			JOptionPane.showMessageDialog(this, "Registration successful...");
			resetFrame();
			
		}
		public void customerreg()
		{
			createRegObj();
			userlist=ud.readDataFromFile();
			ud.writeDatatoFile(userlist);
			//customerreg();	
		}
		
		public void resetFrame()
		{
			this.dispose();
			new mvframe("MOVIE DETAILS");
		}
		public static void main(String args[])
		{
			new mvframe("MOVIE DETAILS");
		}
		public static int sr(String movie)
		{
			try{
			int f=-1;
			ArrayList<mvreg> list1;
			list1=ud.readDataFromFile();
			for(int i=0;i<list1.size();i++)
			{	
				if(movie.equalsIgnoreCase(list1.get(i).getmovie()))
				{
					JOptionPane.showMessageDialog(null,"id Found");
					f=i;
					break;
				}
				else{
					JOptionPane.showMessageDialog(null, "Not Found");
						break;
				}
			}
				return f;
			}
			catch(Exception e)
			{
				System.out.println(e);
				return -2;
			}
	}
	}