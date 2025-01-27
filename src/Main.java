import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Calcul de bases
        System.out.println("Calcul de base");
        System.out.println("10 + 20 = " + calculator.addition(10,20));
        System.out.println("50 - 10 = " +  calculator.soustrac(50, 10));
        System.out.println("8 * 2   = " + calculator.multi(8,2));
        System.out.println("4 / 2   = " + calculator.divise(4,2));
        System.out.println("5 % 2   = " + calculator.modulo(5,2));

        //essais avec plusieurs calculs
        System.out.println("\nCalcul complexe");
        System.out.println(calculator.soustrac(5, 2) + " " + calculator.isEqual("+") + " " + calculator.addition(30, 4444));
        System.out.println(calculator.divise(5, 2) + calculator.isEqual("-") + calculator.multi(1, 1));
        System.out.println(calculator.isEqual("-"));

        //test de division par zero
        System.out.println("\nDivision par zéro");
        System.out.println("0 / 0 = " + calculator.divise(0,0));
        System.out.println("0 % 0 = " + calculator.modulo(0,0));
    }
}