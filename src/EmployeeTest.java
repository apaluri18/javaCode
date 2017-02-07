public class EmployeeTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("James Smith");
      Employee empTwo = new Employee("Mary Anne");
      int a, b;
      a = 10;
      
      //String name ="Anirudh";
      boolean result = empOne instanceof Employee;
      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();
      
      b = ( a == 1) ? 20: 30;
      
      System.out.println( "Value of b is : " +  b  + result);
      
   }
}
