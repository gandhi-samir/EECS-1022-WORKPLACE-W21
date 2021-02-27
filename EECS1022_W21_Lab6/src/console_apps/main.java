package console_apps;
import model.Instructor;
import model.Participant;
import model.Registration;
public class main {


	public static void main(String[] args) {
		Instructor alan = new Instructor("A. Wassyng", 70130, "jackie@eecs.yorku.ca");
		Registration r1 = new Registration("Intro. to OOP", alan);
		Registration r2 = new Registration("no", alan);
		Registration r3 = new Registration("yes", alan);
	
		Participant suyeon = new Participant("S. Y. Lee"); 
		suyeon.addRegistration(r1);
		suyeon.addRegistration(r2);
		suyeon.addRegistration(r3);
		suyeon.addRegistration("hi");
		


		System.out.println(suyeon.marksOf("yes"));
				
	

	}

}
