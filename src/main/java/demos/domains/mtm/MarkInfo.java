package demos.domains.mtm;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标签表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MarkInfo extends BaseData {

  /** 标签名称 */
  private String markName;
}
