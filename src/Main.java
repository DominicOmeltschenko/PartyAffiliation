import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    //class partyAsker
    //  main()
    //		String userParty
    //		output “What is your party affiliation, respond with a capital first letter (I.E republican = “R”)”
    //		input userParty
    //      if userParty = “D” then
    //		    output “You get a Democratic Donkey”
    //      else if userParty = “R” then
    //		    output “You get a Republican Elephant”
    //      else if userParty = “I” then
    //		    output “You get an Independent Man”
    //      else
    //		    output “Error, that isn’t one of the party affiliations”
    //      end if
    //  return
    //end class
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your party affiliation: ");

        String userParty = in.nextLine();
        String trash = "";



            if (userParty.equalsIgnoreCase("D"))
            {
                System.out.println("You get a Democratic Donkey");
            } else if (userParty.equalsIgnoreCase("R"))
            {
                System.out.println("You get a Republican Elephant");
            } else if (userParty.equalsIgnoreCase("I"))
            {
                System.out.println("You get an Independent Man");
            } else
            {
                System.out.println("You chose a different affiliation than Democratic, Republican, or Independent, you chose the letter: " + userParty);

            }
    }

}
