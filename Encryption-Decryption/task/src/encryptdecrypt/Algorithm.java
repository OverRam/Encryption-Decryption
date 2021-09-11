package encryptdecrypt;

interface Algorithm {
    String shift(String text, int key);

    String unicode(String text, int key);
}
