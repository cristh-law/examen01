package com.artesanias.ludex.dtos;

import com.artesanias.ludex.model.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private Long id;

    @NotNull
    @Size(min = 5, max = 50, message = "{user_name.size}")
    private String name;

    @NotNull
    private String image;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 1, max = 200)
    private String password;

    @NotNull
    private UserType userType;

    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Timestamp updatedAt;

    private Timestamp deletedAt;
}
