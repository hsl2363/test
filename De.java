import java.util.Scanner;

public class De {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = a + b;
        System.out.println(c);
        Input.close();
    }
}
