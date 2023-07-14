package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Differ {
    public static String generate(String filePath1, String filePath2, String format) throws Exception {

        Path getFile1 = Paths.get(filePath1);
        Path getFile1Location = getFile1.toAbsolutePath().normalize();
        String content1 = Files.readString(getFile1Location);
        ObjectMapper objectMapper1 = new ObjectMapper();
        Map<String, Object> file1 = objectMapper1.readValue(content1, new TypeReference<>() {
        });

        Path getFile2 = Paths.get(filePath2);
        Path getFile2Location = getFile2.toAbsolutePath().normalize();
        String content2 = Files.readString((getFile2Location));
        ObjectMapper objectMapper2 = new ObjectMapper();
        Map<String, Object> file2 = objectMapper2.readValue(content2, new TypeReference<>() {
        });

        return Formatter.formatStyle(file1, file2, format);
    }
}