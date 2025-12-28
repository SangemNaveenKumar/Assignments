package assignment10;

public class Emp{
	
	public String Name= "";
	private double salary=0.0;
	private float exp=0f;
	private float YER=0.0f;
	//private float HikePercentage=0;

	public Emp(String name,double sal,float exp,float YER){
		this.Name=name;
		this.salary=sal;
		this.exp=exp;
		this.YER=YER;
	};

	double hike(){
		double Hike=0.0;
		if (YER>=4.0) {
			Hike = ( salary * 0.15f ) + 1500 ;
		}
		else if (YER>=3.0 && YER<4.0) {
			Hike = ( salary * 0.10f ) + 1200 ;
		}
		else {
			Hike = ( salary * 0.3f ) + 300 ;
		}
		
		if (exp>=5){
			Hike+=5000;
		}
		
		return (Hike/salary)*100.0f;
	}
	
	
}
