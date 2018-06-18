


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


public class adminreg extends JFrame 
{
	private static final Color Color = null;
	private static final String BLUE = null;
	private static final String RED = null;
	private JLabel l1,l2,l3;
	private JTextField tusername;
	private JPasswordField tpass;

	private JButton bsubmit,bnext;
	
	ArrayList<reg> userlist;
	reg r;
	public adminreg(String title)
	{
		super(title);
		Container c=getContentPane();
		c.setLayout(new GridLayout(18,2));
		tusername=new JTextField(20);
		tpass =new JPasswordField(20);
	

		bsubmit =new JButton("SUBMIT");
		bsubmit.addActionListener((e)->
		{
			addInformation();
		});
		 
		bnext=new JButton("NEXT");
		bnext.addActionListener((e)->
		{
			new mvframe("BACK");
		});
		Font f=new Font("Chiller",Font.BOLD,40);
		l1=new JLabel("ADMIN LOGIN");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("ENTER USERNAME");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		l3=new JLabel("ENTER PASSWORD");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
	
		
	
		
		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tusername);
		c.add(l3);c.add(tpass);
		
		
		JPanel j=new JPanel();
		c.add(bsubmit);
		c.add(bnext);
		c.add(j);
		
		
		setSize(450,650);
		setLocation(200,200);
		setResizable(false);
		setVisible(true);
	}
	
	public void createRegObj()
	{
		String username,pass;
		
		username=tusername.getText().trim();
		pass=tpass.getText().trim();
	
	
		
		r=new reg(username,pass);
		
		
	}
	public void addInformation()
	{
		createRegObj();
		userlist=udd.readDataFromFile();
		userlist.add(r);
		udd.writeDatatoFile(userlist);
		JOptionPane.showMessageDialog(this, "Registration successful...");
		resetFrame();
		
	}
	public void resetFrame()
	{
		this.dispose();
		new adminreg("STUDENT REGISTRATION...");
	}
	public static void main(String args[])
	{
		new adminreg("STUDENT REGISTRATION...");
	}
			
}