import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String email;
        String password;
        do {
            System.out.println("Introduce tu nombre de usuario");
            name = input.nextLine();
        } while (!name.matches("[a-zA-Z]{5,}"));
        do {
            System.out.println("Introduce tu email");
            email = input.nextLine();
        } while (!email.matches("[a-zA-Z0-9]{2,}@gmail.com"));
        do {
            System.out.println("Introduce tu contraseña");
            password = input.nextLine();
        } while (!password.matches("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8})"));
        System.out.println("Bienvenido a la aplicación 'Tu App'. Tus datos son: \nnombre: " + name + " \nemail: " + email + " \ncontraseña: " + password);
    }
}