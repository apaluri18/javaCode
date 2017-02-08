

public class StackCall {
    
    public static void main(String[] args) {
        
//stackMethods newStack = new stackMethods(5);
stackMethods newStack = new stackMethods(5);
        newStack.push(10);
        newStack.push(1);
        newStack.push(50);
        newStack.push(20);
        newStack.push(90);

        newStack.display();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.display();
    }
}
