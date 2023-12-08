
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String firstName;
        String lastName;
        String idNo;
        
        while (true) {
            System.out.print("First name: ");
            firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            idNo = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNo));
            
        }
        System.out.println("");
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
