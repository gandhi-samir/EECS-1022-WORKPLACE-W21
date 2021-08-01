package model;



public class Store {
	Zone[] zone = new Zone[0];
	int[] stats = new int[2];
	Zone [] stats2 = new Zone[0];

	public void addZones(Zone[] input1) {
		Zone[] temp;
		temp=zone;
		
		
		zone= new Zone[zone.length+input1.length];
		for(int i =0; i <temp.length;i++) {
			zone[i]=temp[i];
		}
		
		for(int j =0; j <input1.length;j++) {
			zone[zone.length-1-j]=input1[input1.length-1-j];
		}
	}
		
		

	public Zone[] getZones() {
	
		return zone;
	}



	public int[] getStats(String string) {
		int number =0;
		int number2=0;
		for(int i =0; i <zone.length;i++) {
			for(int j =0; j <zone[i].record.length;j++)
			if(zone[i].record[j].getName().equals(string)) {
				number2+=zone[i].record[j].getNumberOfDVDs();
				number++;
				
			}
			
		}
		stats[0]=number;
		stats[1]=number2;
		
		return stats;
	}



	public Zone[] getZones(int remaining) {
		Zone[]temp;
		int number=0;
		for (int i =0; i < zone.length;i++){
			for(int j =0; j <zone[i].record.length;j++) {
				number=zone[i].max-zone[i].getNumberOfMovieDVDs();
				if(remaining == number) {
					temp=stats2;
					stats2=new Zone[stats2.length+1];
					for(int k=0; k <temp.length;k++) {
						stats2[k]=temp[k];
					}
					stats2[stats2.length-1]=zone[i];
					
				}
					
			
			}

	}
		return stats2;
}
}
