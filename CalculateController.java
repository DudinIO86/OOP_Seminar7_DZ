import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class CalculateController implements UserInput {
    private CalulateModel model;
    private CalculateView view;
    private static File log;

    private static FileWriter fileWriter;


    public CalculateController(CalulateModel model, CalculateView view) {
        this.model = model;
        this.view = view;
    }
    public void run() {


        boolean flag=true;

        while (flag==true){
            int enter=view.MenuPrint();

            switch (enter){
                case 1:
                    runCalculator();
                    break;
                case 2:
                    flag=false;
                    break;
                default:
                    throw new IllegalArgumentException("Недопустимая операция");
            }


        }


    }

    public void runCalculator() {

        double num1=UserInput.getUserInput("Введите первое число: ");
        char operation=UserInput.getUserOperation();
        double num2 = UserInput.getUserInput("Введите второе число: ");

        model.setNumber1(num1);
        model.setOperation(operation);
        model.setNumber2(num2);

        try {
            log=new File("log.txt");
            fileWriter=new FileWriter(log,true);

            model.calculate();
            double result = model.getResult();
            view.displayResult(result);

            fileWriter.write(now()+"\n");
            fileWriter.write("Вычисляемая операция: "+num1+operation+num2+"\n");
            fileWriter.write("Результат: "+result+"\n"+"\n");
            fileWriter.flush();
            fileWriter.close();

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    private static String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}
