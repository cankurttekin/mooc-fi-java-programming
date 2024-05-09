
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(-323);
        nums.add(-5454);
        nums.add(9494);
        nums.add(-9);
        nums.add(-84);
        positive(nums);

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(value -> value >= 0).collect(Collectors.toCollection(ArrayList::new));
    }

}
