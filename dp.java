//package moviedetails;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
public class dp extends JFrame{
//private static final long serialVersionUID=1L;
		public dp()
		{
			super("display all");
			String heading[]=
				{"MOVIE","TYPES","IDNO","ACTOR","ACTRESS","PRODUCER","DIRECTOR"};
			String data[][];
			ArrayList<mvreg> list;
			try
			{
				//Object userDataReadWriteFromFile;
				list=ud.readDataFromFile();
				data=new String[list.size()][12];
				int r=0;
				for(mvreg re : list)
					{
					data[r][0]=re.getmovie();
					data[r][1]=re.gettypes();
					data[r][2]=re.getactor();
					data[r][3]=re.getactress();
					data[r][4]=re.getproducer();
					data[r][5]=re.getdirector();
				//	data[r][6]=re.getCity();
				//	data[r][7]=re.getGender();
				//	data[r][8]=re.getDob();
				//	data[r][9]=re.getInterests();
				//	data[r][10]=re.getDate();
				//	data[r][11]=re.getTime();
					r++;
					}
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("all registration details"),BorderLayout.NORTH);
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