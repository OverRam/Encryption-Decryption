package encryptdecrypt;

public class Decrypted {
    String textToDecrypted;

    public Decrypted(String textToDecrypted) {
        this.textToDecrypted = textToDecrypted;
    }

    public String shiftLetterByValue(int key) {
        key = key % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < textToDecrypted.length(); i++) {
            sb.append((char) (textToDecrypted.charAt(i) - key));
        }
        return sb.toString();
    }
}
