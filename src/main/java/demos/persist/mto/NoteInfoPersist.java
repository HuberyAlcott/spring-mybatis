package demos.persist.mto;

import demos.domains.mto.NoteInfo;
import demos.globals.BaseSave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcus
 */
@Mapper
@Repository
public interface NoteInfoPersist extends BaseSave<NoteInfo> {

  int deleteByPrimaryKey(Long id);

  int insert(NoteInfo record);

  int insertSelective(NoteInfo record);

  List<NoteInfo> selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(NoteInfo record);

  int updateByPrimaryKey(NoteInfo record);
}
