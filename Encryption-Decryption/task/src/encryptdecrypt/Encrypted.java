package encryptdecrypt;

public class Encrypted {
    private final String textToEncrypted;
    private final StringBuilder textEncrypted = new StringBuilder();

    public Encrypted(String textToEncrypted) {
        this.textToEncrypted = textToEncrypted;
    }

    public String reversedEncrypt() {
        int numOfChar;
        char actualChar;
        for (int i = 0; i < textToEncrypted.length(); i++) {
            actualChar = textToEncrypted.charAt(i);
            if (actualChar > 96 && actualChar < 123){
                numOfChar = actualChar - 96;  //a == 97, letters == 26
                textEncrypted.append((char) ('z' - numOfChar + 1));
            }else {
                textEncrypted.append(actualChar);
            }
        }
        return textEncrypted.toString();
    }
}
