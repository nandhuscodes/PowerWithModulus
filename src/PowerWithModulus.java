import java.util.Scanner;

public class PowerWithModulus {
    static int findPowerWithModulus(int A, int B, int C){
        A = A % C;
        int result = 1;
        for(int i = 1; i <= B; i++){
            result = (result * A) % C;
        }
        return result % C;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(findPowerWithModulus(A, B, C));
    }
}
