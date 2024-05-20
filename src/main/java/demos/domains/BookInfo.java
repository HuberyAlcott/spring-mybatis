package demos.domains;

import demos.globals.BaseData;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 书籍表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BookInfo extends BaseData {

  /** 书籍编号 */
  private Long bookSole;

  /** 书籍名称 */
  private String bookName;

  /** 作者姓名 */
  private String realName;

  /** 书籍售价 */
  private BigDecimal bookCost;
}
