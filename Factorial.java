import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int fact = Scan.nextInt();
    
        int temp = 1;
    
        for (int i = 1; i <= fact; i++){
            temp = temp * i;
        }
        System.out.println(temp);
        Scan.close();
    }

}
