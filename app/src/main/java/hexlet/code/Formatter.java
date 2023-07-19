package hexlet.code;

import hexlet.code.formatters.Json;
import hexlet.code.formatters.Stylish;

import java.util.Map;

public class Formatter {
    public static String formatChoice(Map<String, Object> file1, Map<String, Object> file2,
                                      String format) throws Exception {

        switch (format) {
            case "stylish":
                return Stylish.formatStylish(file1, file2, format);
            case "json":
                return Json.formatJson(file1, file2, format);
            default:
                throw new Exception("Unknown format: " + format);
        }
    }
}
