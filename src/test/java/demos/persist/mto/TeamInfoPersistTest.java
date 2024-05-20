package demos.persist.mto;

import static org.junit.jupiter.api.Assertions.*;

import demos.SpringMybatisApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class TeamInfoPersistTest extends SpringMybatisApplicationTests {

  @Autowired TeamInfoPersist teamInfoPersist;

  @Test
  void selectByPrimaryKey() {
    final var teamList = teamInfoPersist.selectByPrimaryKey(1L);

    log.warn("Team list : {}", teamList);
  }
}
