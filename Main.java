public class Main {
    public static void main(String[] args) {
        // Ejemplo de invocación de un método static
        System.out.println(Math.addNumbers(1, 2));
        Main.createStudents();
        Example texto = new Example();
        texto.showMessage();

    }

    public static void createStudents() {
        // Ejemplo de invocación de un método non-static
        Student brayan = new Student(18, "Brayan", "60063181"); // new: Create a new object
        brayan.study();
        brayan.showName();
        brayan.showDNI();

        Student sanMaryse = new Student(19, "Maryse", "74781982");
        sanMaryse.study();
        sanMaryse.showName();
        sanMaryse.showDNI();
    }
}
