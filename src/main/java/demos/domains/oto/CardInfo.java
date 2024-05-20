package demos.domains.oto;

import demos.globals.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 卡片表
 *
 * @author marcus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardInfo extends BaseData {

  /** 卡片名称 */
  private String cardName;
}
