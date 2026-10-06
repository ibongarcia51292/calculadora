import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
    }
    public static void menu(){
        System.out.println("Selecciona una opción:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
    }
}