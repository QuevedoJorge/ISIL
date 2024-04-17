public class Student {
    // Attributes
    int age;
    String name;
    String dni;

    public Student(int age, String name, String dni) {
        this.age = age;
        this.name = name;
        this.dni = dni;
    }

    // Creating Methods
    public void study() {
        System.out.println("The student " + name + " is studying");
    }

    public void showName() {
        System.out.println(name);
    }

    public void showDNI() {
        System.out.println(dni);
    }
}