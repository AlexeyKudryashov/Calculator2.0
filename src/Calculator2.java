import java.io.IOException;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws IOException {
        Scanner schet = new Scanner(System.in);
        String stroka = schet.nextLine();
        String[] strok = stroka.split(" ");
        if (strok.length != 3) {
            throw new ArrayIndexOutOfBoundsException("некорректное выражение");
        }
        int vivod;
        vivod = mathArg(strok);

        System.out.print(vivod);
    }


    public static int mathArg(String[] strokArgum) throws IOException {
        int numOne;
        int numTwo;
        int resOr;
        numOne = Integer.parseInt(String.valueOf(strokArgum[0]));
        if (numOne > 10) {
            throw new IOException("введено число больше 10");
        }
          if (numOne < 1) {
            throw new IOException("Введено число меньше 1");
        }
        numTwo = Integer.parseInt(String.valueOf(strokArgum[2]));
        if (numTwo > 10) {
            throw new IOException("введено число больше 10");
        }
         if (numTwo < 1) {
            throw new IOException("Введено число меньше 1");
        }
        String character = String.valueOf(strokArgum[1]);
        switch (character) {
            case "+":
                resOr = numOne + numTwo;
                return resOr;
            case "-":
                resOr = numOne - numTwo;
                return resOr;
            case "/":
                resOr = numOne / numTwo;
                return resOr;
            case "*":
                resOr = numOne * numTwo;
                return resOr;
            default:
                throw new ArrayIndexOutOfBoundsException("введена не математическая операция");
        }
    }
}
