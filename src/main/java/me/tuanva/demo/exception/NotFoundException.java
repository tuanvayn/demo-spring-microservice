package me.tuanva.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
  private static final long serialVersionUID = 8371770589627143906L;

  public NotFoundException(String id) {
    super("Not found: " + id);
  }
}
