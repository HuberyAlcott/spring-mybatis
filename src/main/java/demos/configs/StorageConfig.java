package demos.configs;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Marcus
 */
@Slf4j
@Configuration
@Import(value = {})
@MapperScans({
  @MapperScan(
      basePackages = {
        "demos.persist",
      })
})
public class StorageConfig {}
