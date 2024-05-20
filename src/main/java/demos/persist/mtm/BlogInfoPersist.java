package demos.persist.mtm;

import demos.domains.mtm.BlogInfo;
import demos.globals.BaseSave;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface BlogInfoPersist extends BaseSave<BlogInfo> {

  int deleteByPrimaryKey(Long id);

  int insertBatch(List<BlogInfo> saveList);

  int insertSelective(BlogInfo record);

  BlogInfo selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(BlogInfo record);

  int updateByPrimaryKey(BlogInfo record);
}
