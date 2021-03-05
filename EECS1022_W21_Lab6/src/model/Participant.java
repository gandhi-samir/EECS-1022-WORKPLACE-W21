package model;

public class Participant {
	int classCounter = 0;
	Registration[] registration = new Registration[5];
	Registration[] classRegistartion;
	Object[] numberMarks = new Object[5];
	Registration registrationAdd;
	String name = "";
	String report = "";
	String classTaken = "";
	int marks = 0;
	boolean didRegisterClass = true;
	int counter = 0;

	String mark = "F";
	String grade = "Failing";
	int gradePoint = 0;

	int markcount = -1;

	public Participant(String name) {
		this.name = name;

	}

	public Registration[] getRegistrations() {
		// if(registration == null) {
		// registration = new Registration[0];
		// }
		if (registration != null) {
			for (int i = 0; i < registration.length; i++) {
				if (registration[i] != null) {
					counter++;
				}
			}
		}
		Registration[] classRegistration = new Registration[counter];

		for (int j = (registration.length - 1); j >= 0; j--) {
			if (registration[j] != null) {
				classRegistration[counter - 1] = registration[j];
				counter--;
			}
		}

		return classRegistration;
	}

	public String getGPAReport() {
		String marksOutput = "";
		double average = 0.0;
		Object[] gpa = new Object[5];
		String[] letterMark = new String[5];
		if (getRegistrations().length == 0) {

			report = "No GPA available yet for " + name;
		}

		else if (getRegistrations().length != 0) {

			// "S. Y. Lee's GPA of {0 (F), 0 (F)}: 0.0"

			for (int i = 0; i < getRegistrations().length; i++) {
				if (numberMarks[i] == null) {

					gpa[i] = 0;
					letterMark[i] = "F";

				}

				if (numberMarks[i] != null) {

					if ((int) numberMarks[i] <= 49 && (int) numberMarks[i] >= 0) {
						letterMark[i] = "F";
						gpa[i] = 0;
					}
					if ((int) numberMarks[i] <= 59 && (int) numberMarks[i] >= 50) {
						letterMark[i] = "D";
						gpa[i] = 5;

					}
					if ((int) numberMarks[i] <= 69 && (int) numberMarks[i] >= 60) {
						letterMark[i] = "C";
						gpa[i] = 6;
					}
					if ((int) numberMarks[i] <= 79 && (int) numberMarks[i] >= 70) {
						letterMark[i] = "B";
						gpa[i] = 7;
					}
					if ((int) numberMarks[i] <= 89 && (int) numberMarks[i] >= 80) {
						letterMark[i] = "A";
						gpa[i] = 8;
					}
					if ((int) numberMarks[i] > 89) {
						letterMark[i] = "A+";
						gpa[i] = 9;
					}

				}

				if (i > 0) {
					marksOutput += ", ";
				}

				marksOutput += (int) gpa[i] + " (" + letterMark[i] + ")";

				average += (int) gpa[i];

			}

			average = average / getRegistrations().length;
			report = name + "'s GPA of {" + marksOutput + "}: " + String.format("%.1f", average);
		}

		return report;
	}

	public int marksOf(String classTaken) {
		this.classTaken = classTaken;
		int result = -1;

		for (int i = 0; i < getRegistrations().length; i++) {

			if (getRegistrations()[i].getTitle() == classTaken) {
				if (numberMarks[i] == null) {
					result = 0;
				} else {
					result = (int) numberMarks[i];
				}
			}

		}

		return result;
	}

	public void addRegistration(Registration r1) {
		boolean isEntered = false;

		this.registrationAdd = r1;

		for (int i = 0; i < registration.length; i++) {
			if (registration[i] != null) {

				if (registration[i].getTitle().equals(registrationAdd.getTitle())) {
					isEntered = true;
					break;
				}
			}
		}

		if (isEntered == false && classCounter < 5) {
			registration[classCounter] = registrationAdd;
			classCounter++;
		}

	}

	public void addRegistration(String string) {
		Registration newRegistration = new Registration(string);
		addRegistration(newRegistration);
	}

	public void updateMarks(String className, int mark) {
		for (int i = 0; i < getRegistrations().length; i++) {
			if (getRegistrations()[i].getTitle() == className) {
				numberMarks[i] = mark;

				getRegistrations()[i].setMarks(mark);
			}

		}

	}

	public void clearRegistrations() {
		for (int i = 0; i < 5; i++) {
			this.registration[i] = null;

		}
	}
	
	public  String getName() {
		return name;
		
	}

}
