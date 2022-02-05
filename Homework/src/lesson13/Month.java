package lesson13;

public class Month {

    public static void showCountDayInMonth(int numberMonth){
        //2022
        switch (numberMonth){
            case 1://январь
            case 3://март
            case 5://май
            case 7://июль
            case 8://август
            case 10://октябрь
            case 12://декабрь
                System.out.println("31 day");
                break;
            case 2://февраль
                System.out.println("28 day");
                break;
            case 4://апрель
            case 6://июнь
            case 9://сентябрь
            case 11://ноябрь
                System.out.println("30 day");
                break;
            default:
                System.out.println("You write not exist month");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            showCountDayInMonth(i);
            System.out.println("------");
        }
    }
}

