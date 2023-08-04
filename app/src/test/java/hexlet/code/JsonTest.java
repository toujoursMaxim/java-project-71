package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import static org.assertj.core.api.Assertions.assertThat;



public class JsonTest {
    private static String file1;
    private static String file2;

    private static String correctResult;
    private static String defaultFormat;

    @BeforeAll
    public static void beforeAll() throws Exception {
        file1 = "./src/test/resources/file1.json";
        file2 = "./src/test/resources/file2.json";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));
        defaultFormat = "stylish";
    }

    @Test
    public void jsonTest() throws Exception {
        String result = Differ.generate(file1, file2, defaultFormat);
        assertThat(result).isEqualTo(correctResult);
    }
}
