
public class vehicleCar implements vehicleInterface {
    
    public void type(){
    
    System.out.println("The type of vehicle is car");
}



    public void speed(){
    
    System.out.println("The speed of car is 50 miles");
}


    public static void main(String args[] ){
    
    vehicleCar obj = new vehicleCar ();
    obj.type();
    obj.speed();
}

    
}
