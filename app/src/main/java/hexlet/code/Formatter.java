package hexlet.code;

import hexlet.code.formatters.Json;

import java.util.List;
import java.util.Map;

public class Formatter {
    public static String formatChoice(final List<Map<String, Object>> compareResult, String format) throws Exception {

        return switch (format) {
            case "json" -> Json.jsonResult(compareResult);
            default -> throw new Exception("Unknown format: " + format);
            };
        }
    }
