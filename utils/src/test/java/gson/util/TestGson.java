package gson.util;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.json.GsonTester;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * 测试Gson的相关方法
 * @author ssliu
 * @date 2020-09-08
 */
public class TestGson {


  private final Gson gson = new Gson();

  @Test
  void testToJsonTree() {
    String a = "string";
    JsonElement jsonElement = gson.toJsonTree(a);
    System.out.println(jsonElement.getClass());

    String b = "";
    JsonElement jsonElement1 = gson.toJsonTree(b);
    System.out.println(jsonElement1.getClass());


    int c = 3;
    System.out.println(gson.toJsonTree(c).getClass());


    String d = "[]";
    System.out.println(gson.toJsonTree(d).getClass());

    Object e = null;
    System.out.println(gson.toJsonTree(e).getClass());

    JsonObject jsonObject = new JsonObject();
    System.out.println(jsonObject.toString());;
    JsonObject jsonObject1 = gson.fromJson(jsonObject.toString(), JsonObject.class);
    System.out.println(jsonObject1.size());
    System.out.println(jsonObject1.getClass());

  }

  @Test
  void testMapKey() {
    HashMap<String, String> maps = new HashMap<>();
    maps.put("a", "1");
    maps.put("A", "2");
    System.out.println(maps.get("a"));
    System.out.println(maps.get("A"));


  }





}
