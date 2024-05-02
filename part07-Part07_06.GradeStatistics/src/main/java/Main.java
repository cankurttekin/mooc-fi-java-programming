
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops:");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        
        while (true) {
            num = scanner.nextInt();
            
            if (num == -1) {
                break;
            }
            
            if (num > 100 || num < 0) {
                continue;
            }
            
            nums.add(num);
        }
        
        int total = 0;
        for(int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
        }
        
        System.out.println("Point average (all): " + 1.0*total/nums.size());
        
        int pass = 0;
        int count = 0;
        for(int i = 0; i<nums.size(); i++) {
            if(nums.get(i) >= 50) {
                pass += nums.get(i);
                count++;
            }
        }
        if(count > 0) {
            System.out.println("Point average (passing): " + 1.0*pass/count);
        } else {
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + 100.0 * count/nums.size());
        
        
        // grade distribution table
        int[] gradeTable = {0, 0, 0, 0, 0, 0}; // index:grade 0:0(failed < 50), 1:1(< 60), 2:2(< 70), 3:3(< 80), 4:4(< 90), 5:5(>= 90)
        
        for(int i = 0; i < nums.size(); i++) {
            
            if(nums.get(i) < 50) {
                gradeTable[0]++;
            }else if(nums.get(i) < 60) {
                gradeTable[1]++;
            }else if(nums.get(i) < 70) {
                gradeTable[2]++;
            }else if(nums.get(i) < 80) {
                gradeTable[3]++;
            }else if(nums.get(i) < 90) {
                gradeTable[4]++;
            }else if(nums.get(i) >= 90) {
                gradeTable[5]++;
            }
        }
        
        System.out.println("Grade distribution:");
        for(int i = gradeTable.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for(int j = 0; j < gradeTable[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
