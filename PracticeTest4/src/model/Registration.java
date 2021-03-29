package model;

public class Registration {
	String name = "";
	int credits = 0;
	int mark = 0;
	String letterMark = "";
	int gradePoint=0;

	public Registration(String name, int credits, int mark) {
		this.name = name;
		this.mark = mark;
		this.credits = credits;
	}

	public Registration(String name, int credits) {
		this.name = name;
		this.credits = credits;
	}

	public String getCourseName() {
		return name;
	}

	public double getNumberOfCredits() {
		return credits;
	}

	public int getMarks() {
		return mark;
	}

	public void setMarks(int mark) {
		this.mark = mark;

	}

	public String getLetterGrade() {
	

		if (mark >= 90) {
			letterMark = "A+";
		}

		else if (mark >= 80 && mark < 90) {
			letterMark = "A";
		} else if (mark >= 70 && mark < 80) {
			letterMark = "B";
		} else if (mark >= 60 && mark < 70) {
			letterMark = "C";
		} else if (mark >= 50 && mark < 60) {
			letterMark = "D";
		} else if (mark < 50) {
			letterMark = "F";
		}

		return letterMark;
	}

	public int getWeightedGradePoint() {
		/*
		 * Weighted Grade Point: grade point * number of credits.
		 * Here is the map from string letter grades to numerical grade points:
		 * "A+"	: 9
		 * "A"	: 8
		 * "B"	: 7
		 * "C" 	: 6
		 * "D"	: 5
		 * "F"	: 0
		 * For example, for r1 with letter grade B (and hence grade point 7) and 3 credits, 
		 * its weighted grade point is 7 * 3. 
		 */
		String gradeMark = getLetterGrade();
		if(gradeMark.equals("A+")) {
			gradePoint=9*credits;
			
		}
		if(gradeMark.equals("A")) {
			gradePoint=8*credits;
			
		}
		if(gradeMark.equals("B")) {
			gradePoint=7*credits;
			
		}
		if(gradeMark.equals("C")) {
			gradePoint=6*credits;
			
		}
		if(gradeMark.equals("D")) {
			gradePoint=5*credits;
			
		}
		if(gradeMark.equals("F")) {
			gradePoint=0*credits;
			
		}
		
		return gradePoint;
	}

}
