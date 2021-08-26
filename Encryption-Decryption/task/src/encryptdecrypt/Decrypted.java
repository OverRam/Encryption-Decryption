package encryptdecrypt;

public class Decrypted {
    String textToDecrypted;

    Decrypted(String textToDecrypted) {
        this.textToDecrypted = textToDecrypted;
    }

    String shiftLetterByValue(int key) {
        key = key % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < textToDecrypted.length(); i++) {
            sb.append((char) (textToDecrypted.charAt(i) - key));
        }
        return sb.toString();
    }
}
