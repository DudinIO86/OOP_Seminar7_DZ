import java.util.Scanner;

class CalculateView implements Menu {
    public int MenuPrint(){
        return Menu.displayMenu();
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
        System.out.println();
    }

}
