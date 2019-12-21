package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelp {

    /**
     * Convert object to JSON string.
     *
     * @param item Object instance.
     * @return Result.
     */
    public static String ToJson(Object item) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(item);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Convert JSON string to object.
     *
     * @param <T>      Instance type.
     * @param jsonText Json string.
     * @return Result.
     */
    public static <T> T FromJson(String jsonText) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(jsonText, new TypeReference<T>() {
            });
        } catch (Exception e) {
            return null;
        }
    }
}
