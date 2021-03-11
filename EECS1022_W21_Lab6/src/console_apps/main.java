package console_apps;





import model.Instructor;
import model.OnlineSchool;
import model.Participant;
import model.Registration;

public class main {


	public static void main(String[] args) {
		
		
		
		
		OnlineSchool school = new OnlineSchool();
	
		Instructor jackie = new Instructor("Jackie", 9 , "jackie@gmail.com");
		Registration r1 = new Registration("Intro. to OOP", jackie);
		Participant mark = new Participant("M. Lawford");
		mark.addRegistration("Intro. to OOP");
		mark.updateMarks("intro.to OOP", 50);
		int x = r1.getMarks();
		
		
		
		
		
		
		System.out.println(x);
		
	}
}
