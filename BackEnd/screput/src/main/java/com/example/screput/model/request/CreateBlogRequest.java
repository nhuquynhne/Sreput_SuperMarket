package com.example.screput.model.request;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBlogRequest {
    
    @NotNull(message="Tiêu đề trống")
    @NotEmpty(message = "Tiêu đề trống")
    @Size(min=5,max=300,message="Độ dài tiêu đề từ 1-300 ký tự")
    private String title;


    @NotNull(message = "Mô tả trống")
    @NotEmpty(message = "Mô tả trống")
    @Size(min=5,max=300,message= "Độ dài mô tả từ 1-300 ký tự")
    private String description;

    @NotNull(message="Nội dung trống")
    @NotEmpty(message="Nội dung trống")
    @Size(min=5,message="Độ dài nội dung tối thiểu từ 5 ký tự")
    private String content;

    @NotNull(message="Ảnh đang trống")
    @NotEmpty(message="Ảnh đang trống")
    private Long imageId;

    private String username;

    private Set<Long> tags = new HashSet<>();

}
