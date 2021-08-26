package encryptdecrypt;

public class Encrypted {

    static String shiftLetterByValue(String textToEncrypted, int key) {
        StringBuilder textEncrypted = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < textToEncrypted.length(); i++) {
            textEncrypted.append((char) (textToEncrypted.charAt(i) + key));

        }
        return textEncrypted.toString();
    }

}
