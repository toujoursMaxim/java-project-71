package hexlet.code.formatters;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Stylish {
    public static String formatStylish(Map<String, Object> file1,
                                       Map<String, Object> file2, String format) throws Exception {

        Set<String> keysFromFile = new TreeSet<>(file1.keySet());
        keysFromFile.addAll(file2.keySet());

        String result = "{\n";
        for (String key : keysFromFile) {
            if (file1.containsKey(key) && (!file2.containsKey(key))) {
                result += String.format("   - " + key + ": " + file1.get(key)) + "\n";
            } else if (!file1.containsKey(key) && (file2.containsKey((key)))) {
                result += String.format("   + " + key + ": " + file2.get(key)) + "\n";
            } else if (!Objects.equals(file1.get(key), file2.get(key))) {
                result += String.format("   - " + key + ": " + file1.get(key)
                        + "\n" + "   + " + key + ": " + file2.get(key)) + "\n";
            } else {
                result += String.format("     " + key + ": " + file1.get(key)) + "\n";
            }
        }
        return result + "}";
    }
}
