

//package project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class dpp extends JFrame 
{
	public dpp()
	{
		super("Display All");
		String heading[]={"username","password"};
		String data[][];
		ArrayList<reg> list;
		try
		{
				list=udd.readDataFromFile();
				data=new String[list.size()][13];
				int r=0;
				for(reg re:list)
				{
					//data[r][0]=re.getfname();
					data[r][0]=re.getusername();
					data[r][1]=re.getpassword();
					r++;
				}
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data,heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
				con.add(new JLabel("VIDEO LIBRARY"),BorderLayout.NORTH);
				con.add(jsp,BorderLayout.CENTER);
				setSize(1366,850);
				setLocation(200,200);
				setVisible(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
