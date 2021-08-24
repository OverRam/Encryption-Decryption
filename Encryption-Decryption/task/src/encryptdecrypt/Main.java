package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CryptHandler.choseCrypt(sc.nextLine(), sc.nextLine());
    }
}

