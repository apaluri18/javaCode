
public class testArray {
    
    public static void main (String args[]){
        int [] myList = {5,7,10,12,15};
        
        int max = myList[0];
        
        for (int i =0; i < myList.length; i++ ){
            
            if(myList[i] > max)
            max = myList[i];
            
        }
        
        System.out.println("Max is " +max);
    }
    
}
