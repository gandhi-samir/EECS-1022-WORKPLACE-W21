package model;

public class OnlineSchool {
	
	Participant [] list;
	int participantCounter = 0;
	
	Participant particiapant;

	public Participant[] getParticipants(String classes) {
	
		return list;
	}

	public void addParticipant(Participant name) {
		if(participantCounter <101) {
			this.particiapant = name;
			list[participantCounter]= particiapant;
			participantCounter++;
		
			
			
		}
		
	}

	

		
	

}
