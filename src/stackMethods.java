


public class stackMethods {
    
    int [] stack;
    int top;
    int size;
    
    public  stackMethods(int arraySize){
        size=arraySize;
        stack= new int[size];
        top=-1;
    }
    
    public void push(int value){
        
        if(top==size-1)
            System.out.print("Stack is full");
            else{
                top = top + 1;
                
                stack[top] = value;
            }
    }
    
    
    public void pop(){
        
        if(top==-1)
            System.out.print("Stack is empty");
            else{
                
                System.out.print("Element being popped is " + stack[top]);
                
                top = top - 1;
                
                
            }
    }
    
    
      public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }

    
}
