package clasroom;

import javax.swing.*;
import java.util.Arrays;

public class VariablesDataType {
    public static void main(String[] args) {
        //byte data type
        byte myCurrentAge = 28;
        System.out.println(myCurrentAge);

        // short data type
        short sallaryPerMonth = 1000;
        System.out.println(sallaryPerMonth);

        char firstNameLetter = 120;//x
        System.out.println(firstNameLetter);


        int LastName = 2020202;
        System.out.println(LastName);

        long populaitonOfLatvija = 2000000;
        System.out.println(populaitonOfLatvija);

        float lapTime = 31_30;
        System.out.println(lapTime);

        double lapTime2 = 31_32F;
        System.out.println(lapTime2);


        boolean isWinter = false;
        boolean isSpring = true;
        boolean isSummer = false;

        String name = "Erix";
        String  surnName = "Milka";

        //concatettation
        String fullName = name + " " + surnName;
        System.out.println(fullName);

        String fullNameWithMyCurrentName = myCurrentAge +" " + name + " " + surnName;
        System.out.println(fullNameWithMyCurrentName);

      System.out.printf("My current age is: %d. My name %s.%n  " ,myCurrentAge ,surnName );
      System.out.printf("My current age is: %d. My name %s.%n " ,myCurrentAge ,surnName );


      // d = NUMBER
        // s = String = Text
        //% newLine


        int a = 200;
                int b = 2;
                        int c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        double result = (double) a / b;
        System.out.println(c);

        int number = 10 % 9;
        System.out.println(number);

        int [] numbers = {1, 2, 3 , 4, 5 ,6 , 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        














    }
}
