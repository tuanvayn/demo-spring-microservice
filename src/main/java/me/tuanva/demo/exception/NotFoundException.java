package me.tuanva.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** Class of customized NotFoundException. */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

  private static final long serialVersionUID = 8371770589627143906L;

  /**
   * Init not found exception.
   *
   * @param id the id
   */
  public NotFoundException(String id) {
    super("Not found: " + id);
  }
}
