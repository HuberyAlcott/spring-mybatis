package demos.domains.mto;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 消息表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NoteInfo extends BaseData {

  /** 消息内容 */
  private String noteText;
}
