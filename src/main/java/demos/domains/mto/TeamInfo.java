package demos.domains.mto;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分组表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamInfo extends BaseData {

  /** 小组名称 */
  private String teamName;
}
