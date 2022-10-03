package textadventure.main;
import java.util.ArrayList;


public abstract class Notebook {
//	ArrayList<String> notes = new ArrayList<String>();
    
	public static void addNotes(String note, ArrayList<String> notes) {
    	notes.add(note);
    	
    }
    
    public static void viewNotes(ArrayList<String> notes) {
    	System.out.println("Current Notes:");
    	for (int i = 0; i < notes.size(); i++) {
    	      System.out.println(notes.get(i));
    	}
    	
    	
    }

}


