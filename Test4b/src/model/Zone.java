package model;

public class Zone {
	int max=0;
	static int counter=23;
	String id="";
	MovieRecord [] record = new MovieRecord[0];
	String status="";


	public Zone(int max) {
		this.max=max;
		id="Zone-"+counter;
		counter+=11;
	}

	public String getID() {
		
		return id;
	}

	public int getNumberOfMovieRecords() {
		
		return record.length;
	}

	public int getNumberOfMovieDVDs() {
		int numberOfMovieDVDs=0;
		for(int i =0; i <record.length;i++) {
			if(record[i]!=null) {
				numberOfMovieDVDs+=record[i].getNumberOfDVDs();
			}
		}
		return numberOfMovieDVDs;
	}

	public String getStatus() {
	
		//"2 records and 5 DVDs: {Toy Story (1), La La Land (4)}"
		if(record.length==0) {
			status="0 records and 0 DVDs: {}";
		}
		return status;
	}

	public void addMovieRecord(MovieRecord r1) {
		boolean isMovie=false;
		
	
		for(int k =0; k <record.length;k++) {
			if(record[k].getName().equals(r1.getName())) {
				int number= r1.getNumberOfDVDs();
				record[k].addDVD(number);
				isMovie = true;
			
				break;
				
	
				
			}
			if(isMovie==true) {
			int moviesRecords = getNumberOfMovieRecords();
			int dvd = getNumberOfMovieDVDs();
			status=moviesRecords+" records and "+dvd+" DVDs: {";
			for(int l =0; l <record.length;l++) {
				status+=record[l].getName();
				status+=" ("+record[l].numberofDVD+")";
				if(record.length >1&& l!=record.length-1) {
					status+=", ";
				}
			}
		
			status+="}";
		
			}
		}
		

		
	
		
		
	int moviecount=getNumberOfMovieDVDs();
		
		
	 if( r1.getNumberOfDVDs()+moviecount >max &&isMovie==false ) {
			status= "Error: insufficient space left in the zone ("+(r1.getNumberOfDVDs()-(max-moviecount))+ " DVDs short)";
		}
		else if(moviecount<max &&isMovie==false ) {
		MovieRecord [] temp;
		temp = record;
		record = new MovieRecord[record.length+1];
		for(int i =0; i <temp.length; i++){
			record[i]=temp[i];
		}
		record[record.length-1]=r1;
		int moviesRecords = getNumberOfMovieRecords();
		int dvd = getNumberOfMovieDVDs();
		status=moviesRecords+" records and "+dvd+" DVDs: {";
		for(int j =0; j <record.length;j++) {
			status+=record[j].getName();
			status+=" ("+record[j].numberofDVD+")";
			if(record.length >1&& j!=record.length-1) {
				status+=", ";
			}
		}
	
		status+="}";
	
		}
if(moviecount==max) {
			
			
			
			status="Error: maximum number of movie DVDs ("+max+") reached";
		}
		
		
			
				
	
		
		

	}
	
	
	

}
