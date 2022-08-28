import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Calculator.calc(str);
    }
}


