import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Math.sumPrimerosNumeros(number));
        System.out.println(Math.saberSuma(5050));
        System.out.println(Math.isOdd(0));
        Math.kindOfNum(25);
        System.out.println(Math.numHigher(75, 75));
        Integer day = scanner.nextInt();
        scanner.close();
        System.out.println(Math.getDate(day));
    }
}