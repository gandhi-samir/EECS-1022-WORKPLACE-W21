package model;

public class Participant {
	int classCounter = 0;
	Registration [] registration = new Registration[5];
	Registration [] classRegistartion;
	
	Registration registrationAdd;
	String name ="";
	String report="";
	String classTaken ="";
	int marks=0;
	boolean didRegisterClass = true;
	int counter = 0;
	String marksOutput="";
	String mark = "F";
	String grade = "Failing";
	int gradePoint = 0;
	

	public Participant(String name) {
		this.name=name;
		
	}

	public Registration[] getRegistrations() {
		if(registration == null) {
			 registration = new Registration[0];
		}
		if(registration != null) {
			for(int i = 0; i < registration.length;i++) {
				if(registration[i]!= null) {
					counter++;
				}	
			}	
		}
		Registration [] classRegistration = new Registration[counter];
		
		for(int j = (registration.length-1);j>=0;j--) {
			if(registration[j]!=null) {
				classRegistration[counter-1]= registration[j];
				counter--;
			}
		}

		
		return classRegistration;
	}

	public String getGPAReport() {
		if (getRegistrations().length == 0) {
			report = "No GPA available yet for "+name;
		}
		else {
			
			//"S. Y. Lee's GPA of {0 (F), 0 (F)}: 0.0"
			report = name+"'s GPA of {";
			for(int i = 0; i<getRegistrations().length;i++) {
				if(marksOf(getRegistrations()[i].getTitle()) < 49) {
					mark = "F";
					grade = "Failing";
					gradePoint = 0;
					}
					if(marksOf(getRegistrations()[i].getTitle()) <=59&& marksOf(getRegistrations()[i].getTitle()) >=50) {
						mark = "D";
						grade = "Passing";
						gradePoint = 5;

						}
					if(marksOf(getRegistrations()[i].getTitle()) <=69&& marksOf(getRegistrations()[i].getTitle()) >=60) {
						mark = "C";
						grade = "Competent";
						gradePoint = 6;
						}
					if(marksOf(getRegistrations()[i].getTitle()) <=79&& marksOf(getRegistrations()[i].getTitle()) >=70) {
						mark = "B";
						grade = "Good";
						gradePoint = 7;
						}
					if(marksOf(getRegistrations()[i].getTitle()) <=89&& marksOf(getRegistrations()[i].getTitle()) >=80) {
						mark = "A";
						grade = "Excellent";
						gradePoint = 8;
						}
					if(marksOf(getRegistrations()[i].getTitle()) >89) {
						mark = "A+";
						grade = "Exceptional";
						gradePoint = 9;
						}
					if(i>0) {
						marksOutput+=",";
					}
				marksOutput+= gradePoint+" ("+mark+")";
				
			}
		}
		return report;
	}

	public int marksOf(String classTaken) {
		this.classTaken = classTaken;
		int result = -1;
		if (getRegistrations().length==0) {
			result=-1;	
		}
		
		else if (getRegistrations().length >0) {
		for (int i =0; i < getRegistrations().length;i++) {
			if (getRegistrations()[i].getTitle()!= classTaken) {
				result = -1;
			}
			
			
				else if (getRegistrations()[i].getTitle()== classTaken) {
					result = marks;
				i = getRegistrations().length;
			}
		}
			
			
		}
		
		return result;
	}
	

	public void addRegistration(Registration r1) {
		
		if(classCounter <5) {
		this.registrationAdd=r1;
		registration[classCounter]=registrationAdd;
		classCounter++;

		
		}
	}

	public void addRegistration(String string) {
		Registration newRegistration = new Registration(string);
	
		if(classCounter <5) {
		this.registrationAdd=newRegistration;
		registration[classCounter]=registrationAdd;
		classCounter++;

		}
	}

	public void updateMarks(String className, int mark) {
		for (int i =0; i < getRegistrations().length;i++) {
		if (getRegistrations()[i].getTitle()== className) {
			this.marks=mark;
			marksOf(className);
			
			
		}
		
		}
		
		
	}

	public void clearRegistrations() {
		// TODO Auto-generated method stub
		
	}
	
}