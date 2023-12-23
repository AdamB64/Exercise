
/**
 * Write a description of class Iteration_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Iteration_5
{
    public static void main(String[] args){
        System.out.println("try to guess the random number between 1 and 100");
        int number = 0;
        int random = new Random().nextInt(100) + 1;
        while(number != random){
            Scanner input =new Scanner(System.in);
            System.out.print("Enter a guess ");
            number = Integer.parseInt(input.nextLine());
            int num = number-random;
            if(num>0){
                System.out.println(number + " is too high");
            } else if(num<0){
                 System.out.println(number + " is too low");
            }    
        }     
        System.out.print("you guessed right!!!");
    }    
}
