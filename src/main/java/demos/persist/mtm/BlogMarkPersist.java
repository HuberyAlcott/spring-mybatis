package demos.persist.mtm;

import demos.domains.mtm.BlogMark;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface BlogMarkPersist extends BaseSave<BlogMark> {

  int deleteByPrimaryKey(Long id);

  int insert(BlogMark record);

  int insertSelective(BlogMark record);

  List<BlogMark> selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(BlogMark record);

  int updateByPrimaryKey(BlogMark record);
}
