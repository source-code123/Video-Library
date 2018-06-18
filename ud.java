//package moviedetails;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class ud{
public static ArrayList<mvreg> readDataFromFile()
{
ArrayList<mvreg> list4;
	try{
		FileInputStream fin=new FileInputStream("Regi.dat");
		ObjectInputStream oin=new ObjectInputStream(fin);
		list4=(ArrayList<mvreg>)oin.readObject();
		
		oin.close();
		fin.close();
	}catch(Exception e)
	{
		list4=new ArrayList<mvreg>();
	}
	return list4;
}
public static void writeDatatoFile(ArrayList<mvreg>wlist)
{
	try{
		FileOutputStream fout=new FileOutputStream("Regi.dat");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(wlist);
		oout.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}