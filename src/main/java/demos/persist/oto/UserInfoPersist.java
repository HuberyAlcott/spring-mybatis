package demos.persist.oto;

import demos.domains.oto.UserInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface UserInfoPersist extends BaseSave<UserInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(UserInfo record);

  int insertSelective(UserInfo record);

  UserInfo selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(UserInfo record);

  int updateByPrimaryKey(UserInfo record);
  /**
   * 分页查询用户信息
   *
   * @param skip 跳过数量
   * @param size 查询数量
   * @return 信息列表
   */
  @Select(value = "select * from oto_user_info limit #{size},#{skip};")
  List<UserInfo> pagingUsers(@Param("skip") int skip, @Param("size") int size);
}
