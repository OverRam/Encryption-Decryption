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
        String alg = "shift";
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
            } else if ("-alg".equals(args[i])) {
                alg = args[i + 1];
            }
        }
        messageReturn = convertMessage(setSrcText(data,in),mode,alg,key);
        if (!"".equals(out)) {
            FileMenger.saveToFile(out, messageReturn);
        } else {
            System.out.println(messageReturn);
        }

    }

    private static String setSrcText(String data, String in) {
        if (!"".equals(data)) {
            return data;
        } else if (!"".equals(in)) {
            return FileMenger.readFileAsString(in);
        }
        return "";
    }

    private static String convertMessage(String text, String mode, String alg, int key) {
        StrategyAlgorithm algorithm = new StrategyAlgorithm();
        algorithm.setAlgorithm(mode.equals("enc") ? new Encode() : new Decode());

        if (alg.equals("shift")) {
            return algorithm.shift(text, key);
        } else {
            return algorithm.unicode(text, key);
        }
    }

}
