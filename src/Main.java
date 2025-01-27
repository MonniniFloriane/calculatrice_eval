public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(10, 20));
        System.out.println(calculator.soustrac(50, 10));
        System.out.println(calculator.multi(8, 2));
        System.out.println(calculator.divise(4, 2));
        System.out.println(calculator.modulo(5, 2));
    }
}