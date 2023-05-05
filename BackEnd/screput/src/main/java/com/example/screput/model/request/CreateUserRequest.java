package com.example.screput.model.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {


    @NotNull(message="Username trống")
    @NotEmpty(message="Username trống")
    @Size(min=5,max=30,message="Username từ 5-30 ký tự")
    @Schema(description="Username",example="admin",required=true)
    private String username;

    @NotNull(message="Email trống")
    @NotEmpty(message="Email trống")
    @Size(min =5,max=30, message="Email từ 5-30 ký tự")
    @Email(message="Email không hợp lệ")
    @Schema(description = "Email",example="admin@gmail.com",required=true)
    private String email;

    @NotNull(message="Mật khẩu trống")
    @NotEmpty(message="Mật khẩu trống")
    @Size(min=6,message="Mật khẩu ít nhất 6 ký tự")
    @Schema(description="Mật khẩu",example="123456")
    private String password;

    private Set<String> role;
}
