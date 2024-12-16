package gr.aueb.cf.calc;

public class Main {
    public static void main(String[] args) {


        int num = 10;
        int num2 = 20;
        int result = 0;

        result = add(num, num2);

        System.out.println("Sum: " + result);
    }

    public static int add(int a, int b) {
        return a + b;

    }
    public static int sub(int a, int b) {
        return a - b;

    }

}