import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        while ((i = s.nextInt()) != 0) {
            System.out.println(i % 2 == 0 ? "even" : "odd");
        }
    }
}
