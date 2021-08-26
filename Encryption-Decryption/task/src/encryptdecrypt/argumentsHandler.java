package encryptdecrypt;

public class argumentsHandler {
    static void handler(String[] args) {
        if (Checker.arguments(args)) {
            dataHandler(args);
        } else {
            System.out.println("Error");
        }
    }

    private static void dataHandler(String[] args) {
        int key = 0;
        String mode = "enc";
        String data = "";
        String in = "";
        String out = "";
        String messageReturn;

        for (int i = 0; i < args.length; i += 2) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            } else if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            } else if ("-data".equals(args[i])) {
                data = args[i + 1];
            } else if ("-in".equals(args[i])) {
                in = args[i + 1];
            } else if ("-out".equals(args[i])) {
                out = args[i + 1];
            }
        }

        messageReturn = crypt(mode, setTextToCrypt(data, in), key);

        if (!"".equals(out)) {
            FileMenger.saveToFile(out, messageReturn);
        } else {
            System.out.println(messageReturn);
        }

    }

    private static String setTextToCrypt(String data, String in) {
        String text = "";

        if (!"".equals(data)) {
            text = data;
        } else if (!"".equals(in)) {
            text = FileMenger.readFileAsString(in);
        }

        return text;
    }

    private static String crypt(String mode, String text, int key) {
        if ("dec".equals(mode)) {
            return Decrypted.shiftLetterByValue(text, key);
        }
        return Encrypted.shiftLetterByValue(text, key);
    }

}
