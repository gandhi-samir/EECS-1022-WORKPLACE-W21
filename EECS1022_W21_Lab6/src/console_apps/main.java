package console_apps;
import model.Instructor;
import model.Registration;
public class main {

	public static void main(String[] args) {
		
		Registration r = new Registration("your mom");
		
		Instructor jackie = new Instructor("Jackie", 70130, "jackie@eecs.yorku.ca");
		r.setInstructor(jackie); 
		

		
		String[] gr = r.getGradeReport();
		System.out.println(gr[1]);
	

	}

}
