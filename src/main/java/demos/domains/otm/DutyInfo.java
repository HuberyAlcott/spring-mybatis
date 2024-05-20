package demos.domains.otm;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 权限表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DutyInfo extends BaseData {

  /** 权限名称 */
  private String dutyName;
}
