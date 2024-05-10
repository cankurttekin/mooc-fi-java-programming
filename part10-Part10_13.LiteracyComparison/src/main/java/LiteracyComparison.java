
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> literacy = new ArrayList<>();
        try {
            // reading the "literacy.csv" file line by line
            Files.lines(Paths.get("literacy.csv"))
                // splitting the row into parts on the "," character
                .map(row -> row.split(","))
                .map(l -> new Literacy(l[2].replace("(%)", "").trim(), l[3], Integer.valueOf(l[4]), Double.parseDouble(l[5])))
                .forEach(t -> literacy.add(t));
                //.forEach(lit -> literacy.add(new Literacy(lit[0], lit[2].substring(0,lit[2].length()-3).trim(), lit[3], Integer.valueOf(lit[4]), Double.parseDouble(lit[5]))));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //literacy.stream().sorted().forEach(l -> System.out.println(l));
        
        literacy.stream().sorted((t1, t2) -> {
            if (t1.getLiteracy() > t2.getLiteracy()) {
                return 1;
            }
            if (t1.getLiteracy() < t2.getLiteracy()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
