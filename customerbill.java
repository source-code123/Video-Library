//package bill;


import java.io.Serializable;
public class customerbill implements Serializable
{
	private String name;
	private String qty;
	private String rate;
	private String total;
	private String paid;
	private String due;
	
/*	private String emailid;
	private String mobno;
	private String address;
	private String city;
	private String gender;
	private String dob;
	private String interests;*/
	//private String date;
	public customerbill(String name,String qty,String rate,String total, String paid, String due)
	{
		super();
		this.name=name;
		this.qty=qty;
		this.rate=rate;
		this.total=total;
		this.paid=paid;
		this.due=due;
		/*this.mobno=mobno;
		this.address=address;
		this.city=city;
		this.gender=gender;
		this.dob=dob;
		this.interests=interests;
		this.date=date;
		this.time=time;*/
	}
	public customerbill()
	{
	}
	public String getname()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getQty()
	{
		return qty;
	}
	public void setQty(String qty)
	{
		this.qty=qty;
	}
	public String getRate()
	{
		return rate;
	}
	public void setRate(String rate)
	{
		this.rate=rate;
	}
		public String getTotal()
		{
			return total;
		}
		public void setTotal(String total)
		{
			this.total=total;
		}
		public String getPaid()
		{
			return paid;
		}
		public void setPaid(String paid)
		{
			this.paid=paid;
		}
		public String getDue()
		{
			return due;
		}
		public void setDue(String due)
		{
			this.due=due;
		}
	/*	public String getMobno()
		{
		return mobno;
		}
		public void setMobno(String mobno)
		{
			this.mobno=mobno;
		}
		public String getAddress()
		{
		return address;
		}
		public void setAddress(String address)
		{
			this.address=address;
		}

		public String getCity()
		{
			return city;
		}
		public void setCity(String city)
		{
			this.city=city;
		}
		public String getGender()
		{
			return gender;
		}
		public void setGender(String gender)
		{
			this.gender=gender;
		}
		public String getDob()
		{
			return dob;
		}
		public void setDob(String dob)
		{
			this.dob=dob;
		}
		public String getInterests()
		{
			return interests;
		}
		public void setInterests(String interests)
		{
			this.interests=interests;
		}
		public String getDate()
		{
			return date;
		}
		public void setDate(String date)
		{
			this.date=date;
		}
		public String getTime()
		{
			return time;
		}
		public void setTime(String time)
		{
			this.time=time;
		}*/
}
