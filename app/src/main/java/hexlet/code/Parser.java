package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
public class Parser {
        private static Map<String, Object> parse(String file) throws Exception {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<>() {
            });
    }
}
