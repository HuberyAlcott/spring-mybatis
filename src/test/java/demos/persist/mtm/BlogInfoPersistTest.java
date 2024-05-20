package demos.persist.mtm;

import demos.SpringMybatisApplicationTests;
import demos.domains.mtm.BlogInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class BlogInfoPersistTest extends SpringMybatisApplicationTests {

  @Autowired BlogInfoPersist blogInfoPersist;

  @Test
  void deleteByPrimaryKey() {}

  @Test
  void insertBatch() {
    BlogInfo info_0 = new BlogInfo();
    info_0.beforeInsert();
    info_0.setBlogHead("jasdjofi");
    BlogInfo info_1 = new BlogInfo();
    info_1.beforeInsert();
    info_1.setBlogHead("jasdjof");

    final var infoList = List.of(info_0, info_1);

    final var saveSize = blogInfoPersist.insertBatch(new ArrayList<>(infoList));
    final var soleList = infoList.parallelStream().map(BlogInfo::getMainSole).toList();
    log.warn("Saved blog info size : {} - {}", saveSize, soleList);
  }

  @Test
  void insertBatchSelective() {}

  @Test
  void selectByPrimaryKey() {
    final var select = blogInfoPersist.selectByPrimaryKey(1L);
    log.warn("Select: {}", select);
  }

  @Test
  void updateByPrimaryKeySelective() {}

  @Test
  void updateByPrimaryKey() {}
}
