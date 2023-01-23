import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Реализовать простой калькулятор
     */
    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();
        int result = calc(num1, num2, operation);
        System.out.println(result);
    }

    public static int getInt() {
        System.out.print("Enter number: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.print("You are an idiot, please enter the wrong number: ");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Enter operation: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("You are an idiot, please enter the wrong operation: ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.print("Operation default. Plz repeat the action ");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

}


