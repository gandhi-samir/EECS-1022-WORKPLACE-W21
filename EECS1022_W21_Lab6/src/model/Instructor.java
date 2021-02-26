package model;

public class Instructor{
	private String name="";
	private int phoneExtension=0;
	private String email="";
	
	


	public Instructor(String name, int ext, String email) {
		this.name = name;
		this.phoneExtension=ext;
		this.email=email;
		
	}

	public String getName(){	
		return name;

}
	public int getPhoneExtension() {
		return phoneExtension;
	}

	public String getInformation() {
		String info = "Instructor "+name+" has campus phone extension "+phoneExtension+" and contact email "+email;
		return info;
	}

	public String getEmail() {
		
		return email;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void setPhoneExtension(int phoneExtension) {
		this.phoneExtension = phoneExtension;
		
	}

	public void setEmail(String email) {
		this.email= email;
		
	}
	
	

}