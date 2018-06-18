//package moviedetails;
	import java.io.Serializable;
	public class mvreg implements Serializable
	{
		private String movie;
		private String types;
		private String actor;
		private String actress;
		private String producer;
		private String director;
	/*	private String city;
		private String gender;
		private String dob;
		private String interests;
		private String date;
		private String time;*/
		public mvreg(String movie, String types, String actor, String actress, String producer, String director)
		{
			super();
			this.movie=movie;
			this.types=types;
			this.actor=actor;
			this.actress=actress;
			this.producer=producer;
			this.director=director;
			//this.city=city;
		//	this.gender=gender;
		//	this.dob=dob;
		//	this.interests=interests;
		//	this.date=date;
		//	this.time=time;
		}
		public mvreg()
		{
		}
			public String getmovie()
			{
				return movie;
			}
			public void setmovie(String movie)
			{
				this.movie=movie;
			}
			public String gettypes()
			{
				return types;
			}
			public void settypes(String types)
			{
				this.types=types;
			}
			public String getactor()
			{
				return actor;
			}
			public void setactor(String actor)
			{
				this.actor=actor;
			}
			public String getactress()
			{
				return actress;
				}
			public void setactress(String actress)
			{
				this.actress=actress;
			}
			public String getproducer()
			{
			return producer;
			}
			public void setproducer(String producer)
			{
				this.producer=producer;
			}
			public String getdirector()
			{
			return director;
			}
			public void setdirector(String director)
			{
				this.director=director;
			}
			/*public String getAddress()
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

