package practice;

import java.util.Date;
/**
 * @refernce https://javaranch.com/journal/2003/04/immutable.htm
 * @author aditm
 *
 */
public class Immutable {

	public static void main(String[] args) {
		
		Date AdjustAge = new Date();
		Company c = new Company("Adobe", 1980);
		User user = new User(20, "Adit", AdjustAge,c);
		
		int i = user.getAge();
		System.out.println(user.getAge()+1);
		
		int age = user.getAge();
		age++;
		System.out.println(user.getAge());
		
		AdjustAge.setYear(new Date().getYear()+2);
			
		
		
		Date forMonthInDate = user.getDob();
		forMonthInDate.setMonth(forMonthInDate.getMonth()+1);
		
		System.out.println(user.getDob());
		
		c.setName("Adobe USA");
		System.out.println(user.getCompany().getName());
		
		
		Company cnew = user.getCompany();
		cnew.setEstYear(2018);
		
		System.out.println(user.getCompany().getEstYear());
	}
}


final class User{
	
	final private int age;
	final private String name;
	final private Date dob;
	final private Company company;
	public User(int age, String name, Date dob, Company company) {
		super();
		this.age = age;
		this.name = name;
		this.dob = new Date(dob.getTime());
		//this.dob = dob;
		//this.company = company;
		this.company = new Company(company.getName(), company.getEstYear());
		
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		//return dob;
		//return new Date(dob.getTime());
		return (Date)dob.clone();
	}

	public Company getCompany() {
		//return company;
		return (Company)company.clone();
	}
		
}


class Company implements Cloneable{
	private String name;
	private int estYear;
	
	public Company(String name, int estYear) {
		this.name = name;
		this.estYear = estYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEstYear() {
		return estYear;
	}
	public void setEstYear(int estYear) {
		this.estYear = estYear;
	}
	
	public Object clone() 
	{
		try {
		return super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
}