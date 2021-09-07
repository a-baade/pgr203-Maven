import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number you wished converted to a Roman Numeral: ");
            int no = scanner.nextInt();
            intToRoman in = new intToRoman();
            String sr = in.toRoman(no);
            System.out.println(no + " = " + sr);
        }
    }

