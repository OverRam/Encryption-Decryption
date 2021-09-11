package encryptdecrypt;

public class Encode implements Algorithm {
    @Override
    public String shift(String text, int key) {
        StringBuilder textBuild = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char actualChar = text.charAt(i);
            int numberChar = actualChar + key;

            if (actualChar >= 97 && actualChar <= 122) {
                //a == 97, z == 122
                textBuild.append((char) (numberChar > 122 ? 96 + (numberChar % 122)  : numberChar));

            } else if (actualChar >= 65 && actualChar <= 90) {
                // A == 65, Z == 90
                textBuild.append((char) (numberChar > 90 ? 64 + (numberChar % 90) : numberChar));
            } else {
                textBuild.append(actualChar);
            }
        }
        return textBuild.toString();
    }

    @Override
    public String unicode(String text, int key) {
        StringBuilder sb = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < text.length(); i++) {
            sb.append((char) (text.charAt(i) + key));
        }
        return sb.toString();
    }
}
