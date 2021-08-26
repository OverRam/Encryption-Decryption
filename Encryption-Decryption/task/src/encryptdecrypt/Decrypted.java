package encryptdecrypt;

public class Decrypted {

    static String shiftLetterByValue(String text, int key) {
        key = key % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            sb.append((char) (text.charAt(i) - key));
        }
        return sb.toString();
    }
}
