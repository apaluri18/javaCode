import java.util.Vector;
import java.util.Enumeration;


public class EnumerationCheck {
    
    public static void main(String args[]){
        
        Enumeration skills;
        
        Vector skillNames = new Vector();
        
        skillNames.add("programming");
        skillNames.add("C++");
        
        
        skills = skillNames.elements();
        
        while (skills.hasMoreElements()) {
         System.out.println(skills.nextElement()); 
      }
        
    }
    
}
