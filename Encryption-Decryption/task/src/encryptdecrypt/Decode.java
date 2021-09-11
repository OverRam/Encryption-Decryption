package encryptdecrypt;

public class Decode implements Algorithm {

    @Override
    public String shift(String text, int key) {
        StringBuilder textBuild = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char actualChar = text.charAt(i);
            int numberChar = actualChar - key;

            if (actualChar >= 97 && actualChar <= 122) {
                //a == 97, z == 122
                textBuild.append((char) (numberChar < 97 ? 122 - (96 - numberChar) : numberChar));

            } else if (actualChar >= 65 && actualChar <= 90) {
                // A == 65, Z == 90
                textBuild.append((char) (numberChar < 65 ? 90 - (64 - numberChar) : numberChar));
            } else {
                textBuild.append(actualChar);
            }
        }
        return textBuild.toString();
    }

    @Override
    public String unicode(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            sb.append((char) (text.charAt(i) - key));
        }
        return sb.toString();
    }
}