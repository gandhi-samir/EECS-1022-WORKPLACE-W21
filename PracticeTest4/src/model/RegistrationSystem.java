package model;

public class RegistrationSystem {
	Transcript[] transcripts = new Transcript[0];
	 int counter=0;

	public Transcript[] getReport() {
		
		return transcripts;
	}

	public void addTranscript(Transcript name) {
		if(counter <500) {
		counter++;
		Transcript [] temp;
		temp=transcripts;
		transcripts= new Transcript[transcripts.length+1];
		for(int i =0; i <temp.length;i++) {
			transcripts[i]=temp[i];
		}
		transcripts[transcripts.length-1]=name;
	
		
	}
	}

	public int getMarks(String studentID, String className) {
		int mark=-1;
		for(int i =0; i <transcripts.length;i++) {
			if(transcripts[i]!=null&&transcripts[i].getStudentID().equals(studentID)) {
				 mark =transcripts[i].getMarks(className);
			}
		}
		

		return mark;
	}

}
