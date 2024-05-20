package demos.persist.otm;

import demos.domains.otm.DutyInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface DutyInfoPersist extends BaseSave<DutyInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(DutyInfo record);

  int insertSelective(DutyInfo record);

  List<DutyInfo> selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(DutyInfo record);

  int updateByPrimaryKey(DutyInfo record);
}
