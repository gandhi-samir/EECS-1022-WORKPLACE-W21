package model;

public class OnlineSchool {

 Participant[] participants = new Participant[0];

    public Participant[] getParticipants(String name) {
        Participant[] registrations = new Participant[0];
        for (int i = 0; i <participants.length;i++) {
            for (int k=0;k <  participants[i].getRegistrations().length;k++) {
                if(participants[i].getRegistrations()[k].getTitle() == name) {
                    Participant[] temp = registrations;
                    registrations = new Participant[registrations.length + 1];
                    for (int j = 0; j < temp.length; j++) {
                        registrations[j] = temp[j];
                    }
                    registrations[registrations.length - 1] = participants[i];
                   
                }
            }
        }
        return registrations;
    }

    public void addParticipant(Participant name) {
        Boolean isEntered = false;
        for (int x =0; x<participants.length;x++) {
            if (participants[x] == name) {
                isEntered = true;
                break;
            }
        }
        if (isEntered == false) { 
        	if (participants.length < 100) {
            Participant[] tempAdd = participants;
            participants = new Participant[participants.length + 1];
            for (int i = 0; i < tempAdd.length; i++) {
                participants[i] = tempAdd[i];
            }
            participants[participants.length - 1] = name;
        }
        }
    }
}