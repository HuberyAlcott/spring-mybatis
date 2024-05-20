package demos.persist.mtm;

import static org.junit.jupiter.api.Assertions.*;

import demos.SpringMybatisApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class MarkInfoPersistTest extends SpringMybatisApplicationTests {

  @Autowired private MarkInfoPersist markInfoPersist;

  @Test
  void selectByPrimaryKey() {
    final var markInfo = markInfoPersist.selectByPrimaryKey(1L);
    log.warn("MarkInfo: {}", markInfo);
  }
}
