package console_apps;
import model.Instructor;
import model.Participant;
import model.Registration;
public class main {


	public static void main(String[] args) {
		Instructor alan = new Instructor("A. Wassyng", 70130, "jackie@eecs.yorku.ca");
		Instructor mark = new Instructor("M. Lawford", 70139, "jonathan@yorku.ca");
		 
		Participant suyeon = new Participant("S. Y. Lee"); 
		Registration[] suyeonRegistrations = suyeon.getRegistrations();
		String report = suyeon.getGPAReport();
		Registration r1 = new Registration("Intro. to OOP", alan);
		suyeon.addRegistration(r1);
		suyeon.addRegistration("Heavy Metal Music");
		
		
		suyeon.updateMarks("Intro. to OOP", 61);
		System.out.println(suyeon.getRegistrations()[0].getMarks());
		System.out.println(suyeon.getRegistrations()[1].getMarks());
		System.out.println(suyeon.marksOf("Intro. to OOP"));
		System.out.println(suyeon.marksOf("Heavy Metal Music"));
		//System.out.println(suyeon.marksOf(suyeon.getRegistrations()[0].getTitle()));
		System.out.println(suyeon.getGPAReport());
				
	

	}

}
