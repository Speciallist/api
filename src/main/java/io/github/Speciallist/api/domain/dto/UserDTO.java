package io.github.Speciallist.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    private Integer id;

    private String name;

    private String email;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

}
