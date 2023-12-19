
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        String id;
        String name;
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            
            if(id.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            Archive item = new Archive(id, name);
            if(archives.contains(item)) {
                continue;
            } else {
                archives.add(item);
            }
            
            
        }
        
        System.out.println("==Items==");
        for(Archive archive : archives)  {
            System.out.println(archive);
        }
    }
}
