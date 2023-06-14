import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Based {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456

        float e = 2.7f; // don't forget to set 'f' in the end of float num
        double pi = 3.1415;

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

//        arrays
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] {1, 2, 4};
        System.out.println(arr.length); // 3

//        get data from terminal: (1)
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        iScanner.close();

//        work with files
//        read/toWrite (2, 3)
        try(FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
