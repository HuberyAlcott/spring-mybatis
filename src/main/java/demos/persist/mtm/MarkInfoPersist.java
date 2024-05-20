package demos.persist.mtm;

import demos.domains.mtm.MarkInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface MarkInfoPersist extends BaseSave<MarkInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(MarkInfo record);

  int insertSelective(MarkInfo record);

  List<MarkInfo> selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(MarkInfo record);

  int updateByPrimaryKey(MarkInfo record);
}
