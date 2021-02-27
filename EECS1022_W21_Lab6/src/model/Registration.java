package model;

public class Registration {
	String title = "";
	String grade ="Failing";
	String mark = "F";
	String[] gr = {mark, grade};
	int gradePoint = 0;
	String gradeReport = "";
	String info="";
	Instructor instructor;
	int gradePercent=0;
	
    
	

	public Registration(String title) {
		this.title = title;
	}


	public Registration(String title, Instructor instructor) {
		this.title=title;
		this.instructor = instructor;
	}


	public String getTitle() {
		
		return title;
	}

	public int getMarks() {
		
		 
		return gradePercent;
	}

	public Instructor getInstructor() {
	
		return instructor;
	}

	public String[] getGradeReport() {
		
		return gr;
	}

	public String getInformation() {

	
		if (instructor==null) {
			
			info = title+" has not yet been assigned an instructor";
		}
		
		else {
			
		info =title+", taught by "+instructor.getName()+", is completed with raw marks "+gradePercent+" ("+mark+" ; "+grade+")";
		
		}
		
		return info;
	}

	public void setInstructor(Instructor instructor) {
	this.instructor=instructor;
		
	}

	public void setMarks(int gradePercent) {
	
		this.gradePercent=gradePercent;
		String[] gr = new String[2];
		if(gradePoint < 49) {
		mark = "F";
		grade = "Failing";
		gradePoint = 0;
		}
		if(gradePercent <=59&& gradePercent >=50) {
			mark = "D";
			grade = "Passing";
			gradePoint = 5;

			}
		if(gradePercent <=69&& gradePercent >=60) {
			mark = "C";
			grade = "Competent";
			gradePoint = 6;
			}
		if(gradePercent <=79&& gradePercent >=70) {
			mark = "B";
			grade = "Good";
			gradePoint = 7;
			}
		if(gradePercent <=89&& gradePercent >=80) {
			mark = "A";
			grade = "Excellent";
			gradePoint = 8;
			}
		if(gradePercent >89) {
			mark = "A+";
			grade = "Exceptional";
			gradePoint = 9;
			}
		gr[0]=mark;
		gr[1]=grade;
		this.gr[0]=gr[0];
		this.gr[1]=gr[1];
		
	}

	
}
