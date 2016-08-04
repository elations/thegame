import java.util.Scanner;

public class game
{
    public static void main(String[] args) throws Exception
    { 
        String words1 = "Hello.  you are in my house.  I found you on the ground.";
        for(int i = 0; i < words1.length(); i++){
            System.out.print(words1.charAt(i));
            Thread.sleep(100);
        }
        
        System.out.println("");
        System.out.println("");
        
        String words2 = "who are you you say";
        for(int i = 0; i < words2.length(); i++){
            System.out.print(words2.charAt(i));
            Thread.sleep(100);
        }
        
        System.out.println("");
        System.out.println("");
        
        String words3 = "I am jim who are you?";
        for(int i = 0; i < words3.length(); i++){
            System.out.print(words3.charAt(i));
            Thread.sleep(100);
        }
        
        System.out.println("");
        System.out.println("");
        
        Scanner scannergame1 = new Scanner(System.in);
        String game = scannergame1. nextLine();
        //DO if statement here later)\
        System.out.println("");
        String words4 = "nice name"  +game;
        for(int i = 0; i < words4.length(); i++){
            System.out.print(words4.charAt(i));
            Thread.sleep(100);
        }
    }
}