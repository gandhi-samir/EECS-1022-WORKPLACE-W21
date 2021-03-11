
package model;

public class OnlineSchool {

    Participant [] list = new Participant[100];
    int participantCounter = 0;
    

    public Participant[] getParticipants(String classes) {
    	int counter=0;
        int classCounter=0;   
        Participant [] classList;
        Participant [] classNameList;
        int a = 0;
        int b = 0;

        for(int i=0; i < list.length;i++) {
            if(list[i]!=null) {
                counter++;
            }
        }

        classNameList = new Participant[counter];

        for(int j=0; j < list.length;j++) {
            if(list[j]!=null) {
                classNameList[a]=list[j];
                a++;
            }
        }

        for(int k = 0; k < classNameList.length;k++) {
            if(classNameList[k]!=null) {
            for(int l = 0; l <classNameList[k].getRegistrations().length;l++) {

                if(classNameList[k].getRegistrations()[l].getTitle().equals(classes)) {
                    classCounter++;
                }
            }
        }
        }

        classList = new Participant[classCounter];

        for(int m = 0; m < classNameList.length;m++) {
            if(classNameList[m]!=null) {
            for(int n = 0; n <classNameList[m].getRegistrations().length;n++) {

                if(classNameList[m].getRegistrations()[n].getTitle().equals(classes)) {
                    classList[b]=classNameList[m];
                    b++;

                }



            }


        }
        }
    return classList;

    }


    public void addParticipant(Participant name) {
    
        if(participantCounter <100) {

            list[participantCounter] = name;
            participantCounter++;
        }
    }
}