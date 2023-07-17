import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        int j =1;
        if(a<1){
            System.out.print("Input 'a' cannot be negative integer");
        }
        else{
        if (a%2 == 0){
             for (int i = 1; i <= a-1; i += 1) {
                    System.out.print(j + " ");
                    j=j+2;
        }
        }
        else{
            for (int i = 1; i <= a; i += 1) {
                    System.out.print(j + " ");
                    j=j+2;
        }
        }
        }
        System.out.println();
        scanner.close();
    }
}

