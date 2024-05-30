package demos.domains.otm;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleInfo extends BaseData {

  /** 角色名称 */
  private String roleName;

  /** 权限列表 */
  private List<DutyInfo> dutyList = new ArrayList<>();
}
