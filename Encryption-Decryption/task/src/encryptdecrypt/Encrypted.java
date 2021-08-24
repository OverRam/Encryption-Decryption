package encryptdecrypt;

public class Encrypted {
    private final String textToEncrypted;
    private int numOfChar;
    private char actualChar;

    public Encrypted(String textToEncrypted) {
        this.textToEncrypted = textToEncrypted;
    }

    public String reversedEncrypt() {
        StringBuilder textEncrypted = new StringBuilder();

        for (int i = 0; i < textToEncrypted.length(); i++) {
            actualChar = textToEncrypted.charAt(i);
            if (actualChar > 96 && actualChar < 123) {
                numOfChar = actualChar - 96;  //a == 97, letters == 26
                textEncrypted.append((char) ('z' - numOfChar + 1));
            } else {
                textEncrypted.append(actualChar);
            }
        }
        return textEncrypted.toString();
    }

    public String shiftLetterByValue(int key) {
        StringBuilder textEncrypted = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < textToEncrypted.length(); i++) {
            actualChar = textToEncrypted.charAt(i);
            numOfChar = actualChar - 96;
            textEncrypted.append((char) (actualChar + key));

        }
        return textEncrypted.toString();
    }

}
