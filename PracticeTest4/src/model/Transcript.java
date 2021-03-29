package model;

public class Transcript {
	String name="";
	static int counter=0;
	int id=0;
	String nameId="";
	Registration [] report = new Registration[0];

	public Transcript(String name) {
		counter++;
	this.name=name;
	this.id=counter*3;
	}

	public String getStudentID() {
		nameId=name+id;
		
		
		return nameId;
	}

	public Registration[] getReport() {

		return report;
	}

	public void addRegistration(Registration r1) {
		Registration [] temp;
		temp=report;
		report = new Registration[report.length+1];
		
		for(int i =0; i <temp.length;i++) {
			report[i]=temp[i];
			
		}
		
		report[report.length-1]=r1;
		
	}

	public void addRegistration(String name, int credits) {
		Registration r1 = new Registration(name, credits);
		addRegistration(r1);
		
	}

	public void addRegistrations(Registration[] registrations) {
		Registration [] temp;
		temp=report;
		int a=0;
		report= new Registration[report.length+registrations.length];
		if(temp.length >0) {

		
		for(int i =0; i < temp.length;i++) {
			report[i]=temp[i];
			
		}
		
		for(int j =report.length-registrations.length; j < report.length;j++) {
			report[j]=registrations[a];
			a++;
		}
		
	}
		else {
			
			report=registrations;
		}
	}

	public int getMarks(String name) {
		int marks=-1;
		for(int i =0; i < report.length;i++) {
			if(report[i]!=null&&report[i].getCourseName().equals(name)) {
				marks=report[i].getMarks();
				
			}
			
		}

		return marks;
	}

	public void setMarks(String name, int mark) {
		for(int i =0; i < report.length;i++) {
			if(report[i]!=null&&report[i].getCourseName().equals(name)) {
				report[i].setMarks(mark);
			}
		}
		
	}

	public double getWeightedGPA() {
		double weightedGPA=0;
		double totalMarks=0;
		
		if(report.length>0) {
		for(int i =0; i < report.length;i++) {
			totalMarks+=report[i].getWeightedGradePoint();
		}
		weightedGPA=totalMarks/report.length;
		}
		
		return weightedGPA;
	}
	

}
