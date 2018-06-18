


import java.io.Serializable;
public class reg implements Serializable
{
	private String username;
	private String password;
	
	public reg(String username,String password)
	{
		super();
		this.username=username;
		this.password=password;
	
	}
	public reg()
	{
		
	}
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	
}