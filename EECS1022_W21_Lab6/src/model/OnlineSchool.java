package model;

public class OnlineSchool {
	
	Participant [] list = new Participant[100];
	int participantCounter = 0;
	int counter=0;
	int classCounter=0;
	Participant  [] emptyClassList = new Participant [0];
	Participant [] classList;
	Participant [] classNameList;

	public Participant[] getParticipants(String classes) {
			
			
				
				
			
	return list;
			
	}
	

	public void addParticipant(Participant name) {
		if(participantCounter <100) {
			
			list[participantCounter] = name;
			participantCounter++;
		
			
			
		}
		
		
		
	}
	
	

	

		
	

}
