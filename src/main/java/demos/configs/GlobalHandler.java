package demos.configs;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @author Marcus
 */
@Slf4j
@RestControllerAdvice
public class GlobalHandler {

  @ExceptionHandler(value = {SQLException.class, DataIntegrityViolationException.class})
  public Object handler(
      HttpServletRequest request, HttpServletResponse response, SQLException errors) {
    final var message = parseError(errors);
    log.error("Occur Errors cause : {} ", message);
    errors.printStackTrace();
    return "Persistent error : " + message;
  }

  @ExceptionHandler(value = {Throwable.class})
  public Object handler(
      HttpServletRequest request, HttpServletResponse response, Throwable errors) {
    final var message = parseError(errors);
    log.error("Occur > {} >> cause > {} ", errors.getClass().getSimpleName(), message);
    errors.printStackTrace();
    return message;
  }

  private String parseError(Throwable errors) {
    final var message = errors.getMessage();
    return message.substring(message.lastIndexOf(':') + 1);
  }
}
