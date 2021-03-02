package console_apps;




import model.Instructor;
import model.OnlineSchool;
import model.Participant;
import model.Registration;

public class main {


	public static void main(String[] args) {
		OnlineSchool school = new OnlineSchool();
		Participant alan = new Participant("A. Wassyng");
		Participant mark = new Participant("M. Lawford");
		Participant tom = new Participant("T. Maibaum"); 
		school.addParticipant(alan);
		school.addParticipant(mark);
		school.addParticipant(tom);
		
		Participant x= school.getParticipants(null)[0];
	
		System.out.println(x);
	}
}
