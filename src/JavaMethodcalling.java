
public class JavaMethodcalling {
    
    public static int minFunction(int n1 , int n2){
        int min;
        
        if( n1 > n2)
        min=n2;
        else
        min =n1;
        
        return min;
        
    }
    
    
    public static void main(String[] args) {
        int min = minFunction(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println("Min value = " + min);
    }
    
    
}
