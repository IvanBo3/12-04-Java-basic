package bo.ivan;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));

        char aChar = 'C';
        boolean result = false;

        byte aByte, bByte;
        System.out.println("Enter 'aByte' value (-128..127): ");
        aByte = (byte) Integer.parseInt(input.readLine());
        System.out.println("Enter 'bByte' value: ");
        bByte = (byte) Integer.parseInt(input.readLine());
        byte sumByte = (byte) (aByte + bByte);
        System.out.println("Byte sum 'aByte' + 'bByte' = " + sumByte);

        System.out.println("-----");

        short aShort;
        System.out.println("Enter 'aShort' value (-32768..32767): ");
        aShort = (short) Integer.parseInt(input.readLine());

        int aInt;
        System.out.println("Enter 'aInt' value: ");
        aInt = Integer.parseInt(input.readLine());

        int divRes = aInt / aShort;
        int remDiv = aInt % aShort;
        System.out.println("Результат деления aInt/aShort: " + divRes);
        System.out.println("Остаток от деления aInt%aShort: " + remDiv);

        if ((divRes * aShort + remDiv) == aInt) {
            result = true;
            System.out.println("Result is: " + result);
            System.out.println("aInt = " + aInt);
            System.out.println("divRes * aShort + remDiv = " + (divRes * aShort + remDiv));
        }

        System.out.println("-----");

        System.out.println("Enter 'a' value: ");
        int a = Integer.parseInt(input.readLine());
        System.out.println("Enter 'b' value: ");
        int b = Integer.parseInt(input.readLine());

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("-----");

        if (a < 0 && b < 0) {
            System.out.println("Оба числа < 0");
        } else if (a > 10 && b > 10) {
            System.out.println("Оба числа > 10");
        }
    }
}
