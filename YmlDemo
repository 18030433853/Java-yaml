
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;


public class YmlDemo {

    public static String getString(LinkedHashMap<String, Object> sourceMap, String key) {
        String[] keys = key.split("[.]");
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) sourceMap.clone();
        int length = keys.length;
        Object resultValue = null;
        for (int i = 0; i < length; i++) {
            Object value = map.get(keys[i]);
            if (i < length - 1) {
                map = ((LinkedHashMap<String, Object>) value);
            } else if (value == null) {
                throw new RuntimeException("key is not exists!");
            } else {
                resultValue = value;
            }
        }
        return resultValue.toString();
    }

    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        InputStream in = YmlDemo.class.getResourceAsStream("api.yaml");
        LinkedHashMap<String, Object> sourceMap = (LinkedHashMap<String, Object>) yaml.load(in);
        String url = getString(sourceMap, "accesstokenTest.request.url");
        String method = getString(sourceMap, "accesstokenTest.request.method");
        String data =getString(sourceMap, "accesstokenTest.request.data");
        System.out.println(sourceMap);

    }
}

