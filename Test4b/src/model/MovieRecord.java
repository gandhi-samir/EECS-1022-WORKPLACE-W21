package model;

public class MovieRecord {
	String name="";
	int numberofDVD=0;
	Zone zone;
	String id="";
	static int counter=1;
	
	public MovieRecord(String name, int numberofDVD, Zone z1) {
		this.name=name;
		this.numberofDVD=numberofDVD;
		this.zone=z1;
		id=zone.getID()+"-"+name+"-"+counter;
		counter++;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfDVDs() {
		return numberofDVD;
	}

	public Zone getZone() {
		
		return zone;
	}

	public String getID() {
		
		return id;
	}
	
	public void addDVD(int number) {
		numberofDVD+=number;
		
		
	}

}
