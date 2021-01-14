package gson.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

import org.assertj.core.error.ConditionAndGroupGenericParameterTypeShouldBeTheSame;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.json.GsonTester;

import com.google.gson.Gson;

import gson.domain.ComplexType;
import gson.domain.SimpleType;

/**
 * @author ssliu
 * @date 2020-09-05
 */
class TestStringObject {

  private final Gson gson = new Gson();


  @Test
  void testComplexType(){
    String[] array = {"1","2"};
    ArrayList<String> strList = new ArrayList<>(10);
    strList.add("1");
    HashSet<String> strSet = new HashSet<>(strList);
    SimpleType simpleType = new SimpleType(1, "123");
    ArrayList<SimpleType> simpleTypes = new ArrayList<>(10);
    simpleTypes.add(simpleType);

    ComplexType complexType = new ComplexType();
    complexType.setIntegerFiled(1);
    complexType.setLongFiled(1L);
    complexType.setBigDecimalField(new BigDecimal(123));
    complexType.setArray(array);
    complexType.setList(strList);
    complexType.setSet(strSet);
    complexType.setSimpleType(simpleType);
    complexType.setSimpleTypeList(simpleTypes);

    String complexTypeStr = gson.toJson(complexType);
    System.out.println(complexTypeStr);

    ComplexType complexType1 = gson.fromJson(complexTypeStr, ComplexType.class);
    String s = gson.toJson(complexType1);
    System.out.println(s);


  }

  @Test
  void testString2Obj() {

  }

  @Test
  void testString2String() {
    System.out.println(gson.toJson(""));
    System.out.println(gson.toJson("123"));
    System.out.println("");
    System.out.println("123");

    System.out.println(gson.toJson(1));
    System.out.println(1);
  }






}
