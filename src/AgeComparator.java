import java.util.Scanner;

public class AgeComparator {



    public static void main(String[] args) {

        System.out.println("How old of Vasya: ");
        Scanner privet88 = new Scanner(System.in); // конструкция для создания вывода данных из консоли.

        // простой пример работы с if else

        int vasyaAge = privet88.nextInt();
        String value = "";
         int katyaAge = 28;
         int mishaAge = 28;
        int min = -1; // минимальный возраст
        int middle = -1; // средний
        int max = -1; // макс.
        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge){
            min = vasyaAge;
            if (katyaAge > mishaAge) {
                middle = mishaAge;
                max = katyaAge;
            } else {
                middle = katyaAge;
                max = mishaAge;
            }
        }
        if (katyaAge <= vasyaAge && katyaAge <= mishaAge){
            min = katyaAge;
            if (vasyaAge > mishaAge){
                middle = mishaAge;
                max = vasyaAge;

            } else {
                middle = vasyaAge;
                max = mishaAge;
            }
        }
        if (mishaAge <= vasyaAge && mishaAge<= katyaAge){
            min = mishaAge;
            if (katyaAge > vasyaAge){
                middle = vasyaAge;
                max = katyaAge;
            }else {
                middle = katyaAge;
                max = vasyaAge;
            }
        }
        System.out.println("minimal age: " + min);
        System.out.println("middle age : " + middle );
        System.out.println("maximal age : " + max);

    }

}
