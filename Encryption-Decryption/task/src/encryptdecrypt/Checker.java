package encryptdecrypt;

import java.io.File;

public class Checker {
    static boolean arguments(String[] args) {
        if (args.length % 2 != 0) {
            return false;
        }

        for (int i = 0; i < args.length; i++) {
            if ("-out".equals(args[i]) && !args[i + 1].contains(".txt")) {
                return false;
            } else if ("-in".equals(args[i])) {
                if (!args[i + 1].contains(".txt") || !new File(args[i + 1]).exists()) {
                    return false;
                }
            }
        }
        return true;
    }
}
