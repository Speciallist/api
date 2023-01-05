package io.github.Speciallist.api.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {

    private Integer status;

    private LocalDateTime timestamp;

    private String error;

    private String path;

}
