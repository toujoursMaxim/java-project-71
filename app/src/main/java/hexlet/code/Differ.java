package hexlet.code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Differ {
    public static String generate(String filePath1, String filePath2, String format) throws Exception {

        Path getObjectFile1 = Paths.get(filePath1);
        Path getFile1Location = getObjectFile1.toAbsolutePath().normalize();
        String content1 = Files.readString(getFile1Location);

        Path getObjectFile2 = Paths.get(filePath2);
        Path getFile2Location = getObjectFile2.toAbsolutePath().normalize();
        String content2 = Files.readString((getFile2Location));

        Map<String, Object> file1 = Parser.parse(content1);
        Map<String, Object> file2 = Parser.parse(content2);

        return Formatter.formatChoice(file1, file2, format);
    }
    public static String generate(String filePath1, String filePath2) throws Exception {
        return generate(filePath1, filePath2, "stylish");
    }
}
