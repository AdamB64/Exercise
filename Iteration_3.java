
/**
 * Write a description of class Iteration_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Iteration_3
{
    public static void main(String[] args){
       Scanner input =new Scanner(System.in);
       System.out.print("Enter some text ");
       String text = input.nextLine();
       int count=0;
       for(int index=0;index<text.length();index++){
           char result = text.charAt(index);
           if(result=='a'){
               count=count +1;
           }    
       }    
       System.out.print("The text " + text + " contains " + count +" a`s");
    }    
}
