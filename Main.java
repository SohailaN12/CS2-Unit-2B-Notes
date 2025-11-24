public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      // WHILE loops repeat instructions in the loop body 
      // as long as a certain CONDITION is TRUE 

      // COUNTER-CONTROLLED while loop
      // STEP #1: Initialize control variable 
      int count = 2;
      // STEP #2: Test a condition
      while ( count <= 10 ) {
         // Loop body executes while (count <= 5) is TRUE
         System.out.println( count );

         // STEP #3: Change the variable 
         // (do this after the statements you want to repeat)
         count++;
      }

      // FOR LOOPA: when you know HOW MANY TIMES to ilerate
      // for (initialize; test condition; change)
      for ( int i = 5; i <= 27; i++) {
         System.out.println(i);
      }
      // Modify the CHANGE step to skip certain numbers
      for (int i = 0; i <= 10; i+=2 ) {
         System.out.println(i);
      }
      // Watch your INITIAL values and your OPERATOR
      for (int i = 0; i < 12; i+=2) {
         System.out.println(i);
      }
      // this loop did the SAME THING as the loop above it!

      // DECREMENTING for loops are like counting backwards
      for ( int i = 10; i > 0; i--) {
         System.out.println(i);
         // Print a special meddage when i is 1 
         if ( i == 1) {
            System.out.println("Blast off!");
         }
      }

      // LOOPS AND STRINGS 
      // Use a loop to iterate through each character 
      // in a String object (TRAVERSAL)

      // Use a FOR loop to "visit every character"
      String name = "sohaila";
      int finalIndex = name.length() -1;
      System.out.println("Final Index: " + finalIndex);

      // Build a reversed String using loop 
      String reversed = "";
      for (int i = finalIndex; i >= 0; i -- ) {
         System.out.println("Current Index: " + i);
         String currentLetter = name.substring(i, i+1); // character at index i 
         System.out.println("Current Index: " + currentLetter );
         reversed += currentLetter; // add char to reversed name 
      }
      System.out.println("Your name backwards: " + reversed);

      // WHILE loops can handle tasks other than when you know 
      // how many times to iterate. 
      // EX) Find and replace characters until all are replaced 










   } // END MAIN MATHOD
} // END CLASS 
