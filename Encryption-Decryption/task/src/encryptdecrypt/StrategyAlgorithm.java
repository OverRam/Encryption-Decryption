package encryptdecrypt;

class StrategyAlgorithm {
    private Algorithm algorithm;

    void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    String shift(String text, int key) {
        return this.algorithm.shift(text, key);
    }

    String unicode(String text, int key) {
        return this.algorithm.unicode(text, key);
    }

}
