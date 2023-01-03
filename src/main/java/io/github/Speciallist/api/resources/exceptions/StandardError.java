package io.github.Speciallist.api.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {

	private Integer status;

	private LocalDateTime timestamp;

	private String error;

	private String path;

}
