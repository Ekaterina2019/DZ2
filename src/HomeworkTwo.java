//Lesson02
public class HomeworkTwo {
    public static void main(String[] args) {

        System.out.println(sumCheck(0,20));

        if (numberCheck(100)) {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }

        System.out.println(reverseNumberCheck(-1));

        outputString("Hello, World!", 6);

        if (checksTheYear(100)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    //Task01

    public static boolean sumCheck(int a, int b){

        return a + b >= 10 && a + b <= 20;

    }
    //Task02

    public static boolean numberCheck(int a){

        return a >= 0;

    }
    //Task03

    public static boolean reverseNumberCheck(int a){

        return !(a >= 0);

    }
    //Task04

    public static void outputString(String lineToOutput, int counter){

        for (int i = 1; i <= counter; i++){
            System.out.println(lineToOutput);
        }

    }
    //Task05
    public static boolean checksTheYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

}













