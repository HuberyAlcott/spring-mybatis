package demos.domains.oto;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserInfo extends BaseData {

  /** 用户名称 */
  private String userName;
}
