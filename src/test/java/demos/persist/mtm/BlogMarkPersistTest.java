package demos.persist.mtm;

import static org.junit.jupiter.api.Assertions.*;

import demos.SpringMybatisApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class BlogMarkPersistTest extends SpringMybatisApplicationTests {

  @Autowired BlogMarkPersist blogMarkPersist;

  @Test
  void selectByPrimaryKey() {
    final var blogMark = blogMarkPersist.selectByPrimaryKey(1L);
    log.warn("blogMark: {}", blogMark);
  }
}
