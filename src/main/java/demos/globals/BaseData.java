package demos.globals;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Marcus
 */
@Data
@EqualsAndHashCode
public abstract class BaseData implements Serializable {

  /** 自增主键 */
  private Long mainSole;

  /** 上级编号 */
  private Long highSole;

  /** 可用状态 */
  private Integer ableFlag;

  /** 删除状态 */
  private Integer lockFlag;

  /** 记录时间 */
  private LocalDateTime saveTime;

  /** 最后更新 */
  private LocalDateTime lastTime;

  /** 记录时间 */
  private String saveUser;

  /** 最后更新 */
  private String lastUser;

  public void beforeInsert() {
    final var time = LocalDateTime.now();
    this.highSole = -1L;
    this.ableFlag = 1;
    this.lockFlag = 1;
    this.saveTime = time;
    this.lastTime = time;
    this.saveUser = "sys_auto";
    this.lastUser = "sys_auto";
  }

  protected void beforeUpdate() {
    this.lastTime = LocalDateTime.now();
  }

  protected void beforeDelete() {}
}
