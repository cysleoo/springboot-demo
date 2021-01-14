package gson.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ssliu
 * @date 2020-09-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplexType implements Serializable {
  private static final long serialVersionUID = -7920034629611516795L;

  private Integer integerFiled;
  private Long  longFiled;
  private BigDecimal bigDecimalField;

  private List<String> list;
  private Set<String> set;
  private String[] array;

  private SimpleType simpleType;

  private List<SimpleType> simpleTypeList;


}
