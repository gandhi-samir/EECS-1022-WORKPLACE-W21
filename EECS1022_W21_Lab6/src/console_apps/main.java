package console_apps;





import model.Instructor;
import model.OnlineSchool;
import model.Participant;
import model.Registration;

public class main {


	public static void main(String[] args) {
		
		
		
		
		OnlineSchool school = new OnlineSchool();
		/* courses not existing (yet) */
		Participant[] list1 = school.getParticipants("Intro. to OOP");
		Participant[] list2 = school.getParticipants("Heavy Metal Music");
		Participant[] list3 = school.getParticipants("Chamber Music");

		

		Participant alan = new Participant("A. Wassyng");
		Participant mark = new Participant("M. Lawford");
		Participant tom = new Participant("T. Maibaum");
		school.addParticipant(alan);
		school.addParticipant(mark);
		school.addParticipant(tom);
		tom.addRegistration("Heavy Metal Music");
		tom.addRegistration("Chamber Music");
		tom.addRegistration("Intro. to OOP");
		alan.addRegistration("Intro. to OOP");
		mark.addRegistration("Heavy Metal Music");
		mark.addRegistration("Intro. to OOP");
		list1 = school.getParticipants("Intro. to OOP");
		list2 = school.getParticipants("Heavy Metal Music");
		list3 = school.getParticipants("Chamber Music");
		
		
		int x = list1.length;
		int y = list2.length;
		int z = list3.length;
		String a = list1[3].getName();
		
		System.out.println(list1.length);
		
	}
}
