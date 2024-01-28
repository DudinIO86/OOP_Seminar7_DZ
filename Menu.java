public interface Menu {
    public static int displayMenu(){
        System.out.println("Выберите пункт меню");
        System.out.println("1. Начать считать");
        System.out.println("2. Выход");
        System.out.println();


        int num=UserInput.getUserInputInt("Ваш выбор: ");

        return num;
    }
}
