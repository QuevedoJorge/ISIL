public class Math {
    // Método: Suma de los primeros números naturales
    public static int sumPrimerosNumeros(int n) {
        return (n * (n + 1)) / 2;
    }

    // Saber si un numero es la suma de x numeros naturales
    public static String saberSuma(int n) {
        for (int i = 0; i <= n; i++) {
            int sum = (i * (i + 1)) / 2;
            if (sum == n) {
                return "Es la suma de los primeros " + i + " números naturales";
            }
        }
        return "No es la suma de ningún numero";
    }

    public static boolean isOdd(int n) {
        if (n == 0) {
            System.out.println("Indefinido");
            return false;
        } else if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int n) {
        if (n == 0) {
            System.out.println("Indefinido");
            return false;
        } else if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void kindOfNum(int n) {
        if (n == 0) {
            System.out.println("Indefinido");
        } else if (isOdd(n)) {
            System.out.println("Is an odd number");
        } else if (isEven(n)) {
            System.out.println("Is an even number");
        }
    }

    public static float numHigher(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String getDate(int n) {
        switch (n) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";

            default:
                return "Digite un número menor o igual a 7.";
        }
    }

    public static void oddNumBetween(int a, int b) {
        for (int i = a; i < b; i++) {
            if (isOdd(i)) {
                System.out.println(i);
            }
        }
    }
    public static void evenNumBetween(int a, int b) {
        for (int i = a; i < b; i++) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }
    }
    public static void evenNumBetween_(int a, int b) {
        for (int i = b; i > a; i--) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }
    }
}