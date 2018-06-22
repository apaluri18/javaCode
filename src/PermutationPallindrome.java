class PermutationPalindrome {
    static final int MAX_CHAR = 256;
 
    static void noOfCharacters(String str)
    {
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
        int noofOccurrences[] = new int[100];
        int oddCount = 0;
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
                                 
            count[str.charAt(i)]++; //charAt return the index of a character at specified index
            
            
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i); //Create an array of each character
         // System.out.println(ch[i]);   
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j]) 
                    find++;                
            }
 
            if (find == 1) {
         
                noofOccurrences[i]= count[str.charAt(i)];
                System.out.println("Number of Occurrence of " +
                 str.charAt(i) + " is:" + noofOccurrences[i]);  
                
            }
                
                 
        }
        
        //Now in the array of occurrences check if there is more than one odd number
        
          for (int k = 0; k < noofOccurrences.length; k++) {
              if (noofOccurrences[k] % 2 != 0)
              (oddCount)++;
          }
          
          if (oddCount > 1)
          System.out.println("This String is a not Palindrome ");
          else
          System.out.println("Congratulations Palindrome String ");

        
    }
    public static void main(String[] args)
    {
            String str = args[0];
        noOfCharacters(str);
    }
}
