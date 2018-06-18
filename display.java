//package bill;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import java.awt.BorderLayout;
	import java.awt.Container;
	import java.util.ArrayList;
	public class display extends JFrame{
	//private static final long serialVersionUID=1L;
			public display()
			{
				super("display all");
				String heading[]=
					{"Name","Qty","Rate","Total","Paid","Due"};
				String data[][];
				ArrayList<customerbill> list;
				try
				{
					//Object userDataReadWriteFromFile;
					list=userdata.readDataFromFile();
					data=new String[list.size()][12];
					int r=0;
					for(customerbill re : list)
						{
						data[r][0]=re.getname();
						data[r][1]=re.getQty();
						data[r][2]=re.getRate();
						data[r][3]=re.getTotal();
						data[r][4]=re.getPaid();
						data[r][5]=re.getDue();
						/*data[r][3]=re.getEmailid();
						data[r][4]=re.getMobno();
						data[r][5]=re.getAddress();
						data[r][6]=re.getCity();
						data[r][7]=re.getGender();
						data[r][8]=re.getDob();
						data[r][9]=re.getInterests();*/
					//	data[r][10]=re.getDate();
						//data[r][11]=re.getTime();
						r++;
						}
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data, heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
				con.add(new JLabel("BILL DETAILS"),BorderLayout.NORTH);
				con.add(jsp,BorderLayout.CENTER);
				setSize(850, 300);
				setLocation(200, 200);
				setVisible(true);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	}

