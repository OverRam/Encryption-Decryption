package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        Encrypted encrypted = new Encrypted("we found a treasure!");
        System.out.println(encrypted.reversedEncrypt());
    }
}
