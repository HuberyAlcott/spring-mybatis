package demos.persist.mto;

import static org.junit.jupiter.api.Assertions.*;

import demos.SpringMybatisApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class NoteInfoPersistTest extends SpringMybatisApplicationTests {

  @Autowired private NoteInfoPersist noteInfoPersist;

  @Test
  void selectByPrimaryKey() {
    final var noteList = noteInfoPersist.selectByPrimaryKey(1L);

    log.warn("NoteInfo : {}", noteList);
  }
}
