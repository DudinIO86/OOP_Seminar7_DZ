public class Main {
    public static void main(String[] args) {
        CalulateModel model = new CalulateModel();
        CalculateView view = new CalculateView();
        CalculateController controller = new CalculateController(model, view);

        controller.run();
    }
}
