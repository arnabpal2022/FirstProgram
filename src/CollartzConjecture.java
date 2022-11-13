import java.util.Scanner;

public class CollartzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        System.out.print(n+ " ");

        while (n!=1){
            if(n%2==1){

                n=(n*3)+1;

            }
            else{
                n=n/2;

            }
            System.out.print(n+" ");

        }
    }
}
