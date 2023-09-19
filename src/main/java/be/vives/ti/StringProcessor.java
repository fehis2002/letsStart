package be.vives.ti;

public class StringProcessor {

    /**
     * Voegt de suffix toe aan het einde van str als
     * str nog niet eindigt met de suffix
     */
    public String appendIfMissing(String str, String suffix) {

        int i = 0;

        if (str.endsWith(suffix)) {
            return str;
        } else {
            return str + suffix;
        }
    }
}
