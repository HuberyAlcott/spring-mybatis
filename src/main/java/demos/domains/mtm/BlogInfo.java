package demos.domains.mtm;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 博客表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BlogInfo extends BaseData {

  /** 博客标题 */
  private String blogHead;
}
