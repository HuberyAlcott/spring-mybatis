package demos.persist;

import demos.domains.BookInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface BookInfoPersist extends BaseSave<BookInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(BookInfo record);

  int insertSelective(BookInfo record);

  BookInfo selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(BookInfo record);

  int updateByPrimaryKey(BookInfo record);
}
