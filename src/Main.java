import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola GitHub esto es una prueba");
        menu();

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1 -> {
                int resultado = suma();
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                int resultado = resta();
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
            }
        }
    }

    public static void menu() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
    }

    public static int suma() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número:"));
        return num1 + num2;
    }

    public static int resta() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número:"));
        return num1 - num2;
    }
}