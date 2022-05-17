import org.testng.annotations.Test;

import java.util.Map;

public class TestYamlData extends YamlDataHelper{

    @Test(dataProvider = "yamlDataMethod")
    public void testYamlData(Map<String,String> param){
       //System.out.println(param.get("name")+"\t"+param.get("passwd"));
       String url = param.get("url");
       String username = param.get("username");
       String password = param.get("password");

    }
}
