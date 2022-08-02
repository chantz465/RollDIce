
package rolldice;

import java.util.Scanner;


public class RollDice {

   
    public static void main(String[] args) {
        // dec vars
        Scanner response = new Scanner(System.in);// scanner
        int die1, die2;//two dice
        
        
        
        // greeting
        System.out.println("Can you roll doubles?");
        
        do{// do
            // prompt press enter to simlate the roll of two dice
            System.out.println("Press enter to roll the dice!");
            response.nextLine();
            
            die1 = RollDie();// roll the first die < METHOD> and capture response
            die2 = RollDie();// roll the seond die and capture response

            // print the results
            
            System.out.println(die1 + " " + die2);
            
            DisplayResults(die1,die2);
            
        } while(die1 != die2);// repeat untill they get double- end loop
        
        
        
        
        
        
        
        
        
    } // end main
    
    // roll a single die - use Math.random() to set the value of the die roll 
    public static int RollDie() { 
        /*int roll;
        roll = (int)(Math.random() * 6 +1);// random number between 1 and 6
        
        
        
        
        return roll;*/
        
        
        return(int)(Math.random()*6 + 1);
    } // method
    
    
    // display 
    public static void DisplayResults(int die1,int die2) {
        if(die1 == die2)
            System.out.println("You got doublessss you rolled two:" + die1 + "'s");
        else
            System.out.println("No doubles you rolled a :" + die1 + " " + die2);
    }
            
} // end class
