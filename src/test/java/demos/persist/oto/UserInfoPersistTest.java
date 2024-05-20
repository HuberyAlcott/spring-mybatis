package demos.persist.oto;

import static org.junit.jupiter.api.Assertions.*;

import demos.SpringMybatisApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class UserInfoPersistTest extends SpringMybatisApplicationTests {

  @Autowired UserInfoPersist userInfoPersist;

  @Test
  void deleteByPrimaryKey() {}

  @Test
  void insert() {}

  @Test
  void insertSelective() {}

  @Test
  void selectByPrimaryKey() {}

  @Test
  void updateByPrimaryKeySelective() {}

  @Test
  void updateByPrimaryKey() {}

  @Test
  void pagingUsers() {
    final var userList = userInfoPersist.pagingUsers(10, 20);
    log.warn("Select result: {}", userList.size());
    userList.forEach(info -> log.warn("User info: {}", info));
  }
}
