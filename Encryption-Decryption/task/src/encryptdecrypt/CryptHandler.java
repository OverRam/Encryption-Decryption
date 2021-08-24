package encryptdecrypt;

import java.util.Scanner;

public class CryptHandler {

    static void choseCrypt(String chose, String message) {
        Scanner sc = new Scanner(System.in);
        switch (chose) {
            case "enc":
                Encrypted ec = new Encrypted(message);
                System.out.println(ec.shiftLetterByValue(sc.nextInt()));
                break;
            case "dec":
                Decrypted dec = new Decrypted(message);
                System.out.println(dec.shiftLetterByValue(sc.nextInt()));
        }
    }
}
