public class Test {
    public static void main(String[] args) {
        myMethod();
        // greeting("Jorge");
        System.out.println(rectangleArea(5, 2));
        showAreaAndPerimeter(5, 2);
        System.out.println(areEqual(1, 1, 1, 1));

    }

    public static void myMethod(){
        System.out.println("Hello, ISIL");
    }
    public static void greeting(String name) {
        System.out.println("Hi " + name);
    }
    public static float rectangleArea(float large, float height) {
        return large * height;
    }
    public static float rectanglePerimeter(float large, float height) {
        return (large + height) * 2;
    }
    public static void showAreaAndPerimeter(int large, int height) {
        System.out.println("The rectangle's area is: " + rectangleArea(large, height));
        System.out.println("The rectangle's perimeter is: " + rectanglePerimeter(large, height));
    }
    public static boolean areEqual(int a, int b, int c, int d) {
        return a == b && b == c && c == d && d == a;
    }
}
