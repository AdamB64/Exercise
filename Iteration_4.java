
/**
 * Write a description of class Iteration_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Iteration_4
{
    public static void main(String[] args){
        int[] count = {0,0};
        int number=0;
        try{
            while(number>=0){
                Scanner input =new Scanner(System.in);
                System.out.println("Enter a number (or stop to exit): ");
                number = Integer.parseInt(input.nextLine());
                int number2 =number%2;
                if(number2==0){
                    System.out.println(number+ " is even");
                    count[0]++;
                } else {
                    System.out.println(number+ " is odd");
                    count[1]++;
                } 
            }  
        }catch(Exception e){
            System.out.print("There were " +count[0]+" even and " + count[1]+ " odd");
        }    
    }    
}
