// Import Java Scanner class to facilitate Scanner object
// creation to capture user input.
import java.util.Scanner;

// Import Java ArrayList class to facilitate ArrayList
// creation to house animal objects for iteration
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        // Class variables
        
        // Scanner object to capture user input
        
        Scanner scnr = new Scanner(System.in);
        
        /* Application options menu.  This is stored in a single
         * variable that can be passed into each print command at
         * various application points to prevent code redundancy
         * and consolidate future option updates to a single
         * location in the code.  
         */
        
        String optionsMenu =    "Please select an option.\n"
                              + "R - Process request for new service animal\n"
                              + "U - Update existing animal records\n"
                              + "P - Print animals by training phase\n"
                              + "A - Add new animal\n"
                              + "T - Transfer animal/place in service\n"
                              + "E - Process end of service (retirement/death)\n"
                              + "Q - Quit application\n";
                
        /* Capture and store the user's selection from the option menu
         * Initialize it to an empty char so the application loop
         * is entered.
         */
        
        char userSelection = ' ';

        /* Arrays representing eligible dog breeds and monkey species
         * per the specification.  These arrays will enforce appropriate
         * breed/species assignment when setting the breed/species 
         * value on a particular object.  
         */
        
        String[] dogBreeds = {"American pit bull terrier", "Beagle", "Belgian Malinois",
                              "Border collie", "Bloodhound", "Coonhound", "English springer spaniel",
                              "German shepherd", "German shorthaired pointer", "Golden retriever",
                              "Labrador retriever", "Nova Scotia duck tolling retriever",
                              "Rough collie", "Smooth collie"};
        
        String[] monkeySpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey",
                                  "Tamarin"};
        
        // TODO: create ArrayList

        // TODO: Create New Dog
        // TODO: Create New Monkey
        // TODO: Add new objects to ArrayList
        
        System.out.println("Welcome to Grazioso Salvare.");
        
        /* Application start.
         * Present user with option menu for functionality selection
         * and ensure valid input.
         */
        
        while (userSelection != 'Q') {
            System.out.println(optionsMenu);
            
            /* Capture the user's input, convert it to upper case,
             * and grab only the first element to ensure 
             * method input consistency
             */
            
            userSelection = scnr.nextLine().toUpperCase().charAt(0);
            
            /* Loop to ensure the user enters a valid selection.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop. 
             */
            
            //TODO: can we use an Enum here?
            while (userSelection != 'R' && userSelection != 'U' && userSelection != 'P' && userSelection != 'A' &&
                    userSelection != 'T' && userSelection != 'E' && userSelection != 'Q') {
                 System.out.println("Invalid selection");
                 System.out.println(optionsMenu);
                 userSelection = scnr.nextLine().toUpperCase().charAt(0);
             }
            
            /* Execute functionality selected.
             * This is nested in a while loop to continue to present
             * the option menu after each function execution
             * until user quits the application.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop.
             */
            
            if(userSelection == 'R') {
                System.out.println("FIXME Process request for a rescue animal");
            }
            
            if(userSelection == 'U') {
                System.out.println("FIXME: Update information on existing animals");
            }
            
            if(userSelection == 'P') {
                System.out.println("FIXME: Print animals by training phase");
            }
            
            if(userSelection == 'A') {
                System.out.println("FIXME: Add new animal");
            }
            
            if(userSelection == 'T') {
                System.out.println("FIXME: Transfer animal/place in service");
            }
            
            if(userSelection == 'E') {
                System.out.println("FIXME: Process end of service (retirement/death)");
            }
            
        }
        
        System.out.println("Goodbye.  Grazio Salvare, Jeff Perkinson \u00A92019");

    }
    

   // Method to process request for a rescue animal



    // Method(s) to update information on existing animals



    // Method to display matrix of animals based on location and status/training phase



    // Method to add animals



    // Method to out process animals for the farm or in-service placement



    // Method to display in-service animals



    // Process reports from in-service agencies reporting death/retirement




}
