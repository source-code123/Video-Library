


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class udd
{
	public static ArrayList<reg>readDataFromFile()
	{
		ArrayList<reg> list4;
		try
		{
			FileInputStream fi=new FileInputStream("Regi.dat");
			ObjectInputStream oin=new ObjectInputStream(fi);
			list4=(ArrayList<reg>)oin.readObject();
			
			oin.close();
			fi.close();
		}
		catch(Exception e)
		{
			list4=new ArrayList<reg>();
		}
		return list4;
	}
	public static void writeDatatoFile(ArrayList<reg>wlist)
	{
		try
		{
			FileOutputStream fo=new FileOutputStream("Regi.dat");
			ObjectOutputStream oout=new ObjectOutputStream(fo);
			oout.writeObject(wlist);
			
			oout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
