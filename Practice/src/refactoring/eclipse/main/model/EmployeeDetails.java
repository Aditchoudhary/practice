package refactoring.eclipse.main.model;

public class EmployeeDetails {

	public String name;
	public String sal;
	public int id;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeDetails(String name, String sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
}
