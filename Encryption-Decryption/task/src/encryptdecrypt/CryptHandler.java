package encryptdecrypt;

public class CryptHandler {

    static void choseCrypt(String[] arguments) {
        String mode = "enc";
        String data = "";
        int key = 0;

        for (int i = 0; i < arguments.length; i += 2) {
            if ("-mode".equals(arguments[i])) {
                mode = arguments[i + 1];
            } else if ("-key".equals(arguments[i])) {
                key = Integer.parseInt(arguments[i + 1]);
            } else if ("-data".equals(arguments[i])) {
                data = arguments[i + 1];
            }
        }

        switch (mode) {
            case "enc":
                Encrypted ec = new Encrypted(data);
                System.out.println(ec.shiftLetterByValue(key));
                break;
            case "dec":
                Decrypted dec = new Decrypted(data);
                System.out.println(dec.shiftLetterByValue(key));
        }
    }

}
