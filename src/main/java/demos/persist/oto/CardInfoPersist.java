package demos.persist.oto;

import demos.domains.oto.CardInfo;
import demos.globals.BaseSave;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface CardInfoPersist extends BaseSave<CardInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(CardInfo record);

  int insertSelective(CardInfo record);

  CardInfo selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(CardInfo record);

  int updateByPrimaryKey(CardInfo record);

  /**
   * 分页查询书籍信息
   *
   * @param skip 跳过数量
   * @param size 查询数量
   * @return 信息列表
   */
  @Select(value = "select * from oto_card_info limit :size,:skip;")
  List<CardInfo> pagingUsers(@Param("skip") int skip, @Param("size") int size);
}
