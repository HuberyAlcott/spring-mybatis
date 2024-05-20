package demos.persist.mto;

import demos.domains.mto.TeamInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface TeamInfoPersist extends BaseSave<TeamInfo> {

  int insert(TeamInfo record);

  int insertSelective(TeamInfo record);

  List<TeamInfo> selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(TeamInfo record);

  int updateByPrimaryKey(TeamInfo record);
}
