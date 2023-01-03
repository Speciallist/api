package io.github.Speciallist.api.resources.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import io.github.Speciallist.api.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException exception, HttpServletRequest request) {
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), LocalDateTime.now(),
				exception.getMessage(), request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
