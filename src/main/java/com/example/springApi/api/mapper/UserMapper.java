package com.example.springApi.api.mapper;

import com.example.springApi.api.dto.UserDTO;
import com.example.springApi.api.model.User;
import org.mapstruct.Mapper;

/*aquí es donde se hace el mapping solo*/
@Mapper(componentModel = "spring")      /*esta etiqueta es prácticamente magia*/
public interface UserMapper {
    UserDTO toDto(User user);

    User toEntity(UserDTO dto);
}
