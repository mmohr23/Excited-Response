import java.util.Scanner;
//adds the scanner input to be allowed. 

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());
        
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a text message
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        
        // Call teenTalk method to translate the message to teen talk
        System.out.println(myFriend.teenTalk(text));
    }
}