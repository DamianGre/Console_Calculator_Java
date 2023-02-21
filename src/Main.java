import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Console calculator
        double firstNumber=0, secondNumber=0, result=0;
        char operation;
        Boolean doAgain = true;
        String anotherOperation;

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        try {
            do
            {
                firstNumber = 0;
                secondNumber = 0;
                result = 0;
                doAgain = true;

                System.out.print("Enter first number: ");
                firstNumber = scanner1.nextDouble();

                System.out.println("For addition enter: \"+\"" +
                        "\nFor subtraction enter: \"-\"" +
                        "\nFor multiplication enter: \"*\"" +
                        "\nFor division enter:  \"/\"" +
                        "\nFor the root enter: \";\"" +
                        "\nFor calculate the power enter: \"^\"");
                operation = scanner2.next().charAt(0);
                if (operation != '+' && operation != '-' && operation != '*' && operation != '/' &&
                        operation != ';' && operation != '^')
                {
                    throw new Exception("Wrong data!");
                }

                if (operation != ';')
                {
                    System.out.print("Enter second number: ");
                    secondNumber = scanner3.nextDouble();;
                }

                switch (operation)
                {
                    case '+': result = firstNumber + secondNumber; break;
                    case '-': result = firstNumber - secondNumber; break;
                    case '*': result = firstNumber * secondNumber; break;
                    case '/':
                    {
                        if (secondNumber == 0)
                        {
                            throw new Exception("YOU CAN'T DIVIDE BY 0!");
                        }
                        result = firstNumber / secondNumber;
                    }
                    break;
                    case ';': result = Math.sqrt(firstNumber); break;
                    case '^': result = Math.pow(firstNumber, secondNumber); break;
                }
                if (operation == ';') {
                    System.out.println("Square root of: " + firstNumber + " = " + result);
                }
                else if (operation == '^') {
                    System.out.println("Power of: " + firstNumber +  operation + secondNumber + " = " + result);
                }
                else{
                    System.out.println("Result of: " + firstNumber + " " + operation + " " + secondNumber + " " + " = " + result);
                }
                System.out.println("Do you want to do another math operation (Y/N)");
                anotherOperation = scanner4.nextLine();
                anotherOperation = anotherOperation.toUpperCase();

                if (anotherOperation.equals("Y")){
                    doAgain = true;
                }
                else if(anotherOperation.equals("N")){
                    doAgain = false;
                }
                else{
                    throw new Exception("Entered data is wrong!");
                }
            } while (doAgain == true);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}