package demos.domains.mtm;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 博客与标签关联表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BlogMark extends BaseData {

  /** 博客编号 */
  private Long blogSole;

  /** 标签编号 */
  private Long markSole;
}
