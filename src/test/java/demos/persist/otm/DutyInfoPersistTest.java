package demos.persist.otm;

import static org.junit.jupiter.api.Assertions.*;

import demos.SpringMybatisApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class DutyInfoPersistTest extends SpringMybatisApplicationTests {

  @Autowired private DutyInfoPersist dutyInfoPersist;

  @Test
  void selectByPrimaryKey() {
    final var dutyList = dutyInfoPersist.selectByPrimaryKey(1L);

    log.warn("Duty list : {}", dutyList);
  }
}
