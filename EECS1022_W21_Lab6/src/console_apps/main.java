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
		tom.addRegistration("Intro. to OOP");
		tom.getRegistrations()
	

	}

}
