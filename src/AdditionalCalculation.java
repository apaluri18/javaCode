
public class AdditionalCalculation extends calculation {
    
    public void multiplication (int x , int y){
        
        int z = x * y;
        
        System.out.println("Product of the numbers is "+z);
        
    }
    
    
    public static void main(String args[]){
        
         int a = Integer.parseInt(args[0]), b =  Integer.parseInt(args[1]);
      AdditionalCalculation demo = new AdditionalCalculation();
      demo.addition(a, b);
      demo.substraction(a, b);
      demo.multiplication(a, b);
        
    }
    
}
