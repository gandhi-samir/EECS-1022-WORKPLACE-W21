package model;

public class Participant {
	int classCounter = 0;
	Registration [] registration = new Registration[classCounter];
	Registration registrationAdd;
	String name ="";
	
	String report="";
	String classTaken ="";
	int marks;
	boolean didRegisterClass = true;
	

	public Participant(String name) {
		this.name=name;
		
	}

	public Registration[] getRegistrations() {
		if(registration == null) {
			 registration = new Registration[0];
		}
		
		
		return registration;
	}

	public String getGPAReport() {
		if(registration.length == 0) {
			report = "No GPA available yet for "+name;
		}
		return report;
	}

	public int marksOf(String classTaken) {
		this.classTaken = classTaken;
		for (int i =0; i < registration.length;i++) {
			if (registration[i].getTitle()!= classTaken) {
				didRegisterClass = false;	
			}
			if (registration[i].getTitle()== classTaken) {
				didRegisterClass = true;	
				i = registration.length;
			}
			
			if(didRegisterClass != true) {
				marks=-1;
			}
			
			if(didRegisterClass == true) {
				marks =1;
			}
			
		}
		return marks;
	}

	public void addRegistration(Registration r1) {
		
		if(registration.length <=5) {
			classCounter++;
			this.registrationAdd=r1;
		Registration [] registration = new Registration[classCounter];
		registration[classCounter-1]=r1;
		this.registration=registration;
		
		}
	}

	public void addRegistration(String string) {
		
		
		
		
	}

	public void updateMarks(String string, int i) {
		// TODO Auto-generated method stub
		
	}

	public void clearRegistrations() {
		// TODO Auto-generated method stub
		
	}
	
}