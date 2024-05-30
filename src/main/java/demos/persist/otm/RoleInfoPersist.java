package demos.persist.otm;

import demos.domains.otm.RoleInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface RoleInfoPersist extends BaseSave<RoleInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(RoleInfo record);

  int insertSelective(RoleInfo record);

  RoleInfo selectFullData(Long id);

  RoleInfo selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(RoleInfo record);

  int updateByPrimaryKey(RoleInfo record);
}
