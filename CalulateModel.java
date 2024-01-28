public class CalulateModel {
    private double number1;
    private double number2;
    private char operation;
    private double result;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    throw new ArithmeticException("Деление на ноль!");
                }
                break;
            default:
                throw new IllegalArgumentException("Недопустимая операция");
        }
    }
}
