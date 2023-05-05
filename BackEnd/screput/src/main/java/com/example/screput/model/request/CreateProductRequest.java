package com.example.screput.model.request;

import java.util.Set;

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
public class CreateProductRequest {
    
    @NotNull(message = "Tên sản phẩm trống")
    @NotEmpty(message="Tên sản phẩm trống")
    private String name;

    @NotNull(message = "Giá tiền trống")
    @NotEmpty(message = "Giá tiền trống")
    @Size(min=0,message="Giá tiền sản phẩm lớn hơn 0")
    private long price;

    @NotNull(message = "Số lượng sản trống")
    @NotEmpty(message="Số lượng sản phẩm trống")
    @Size(min=0,message="Số lượng sản phẩm từ 0")
    private int quantity;

    @NotNull(message = "Danh mục trống")
    @NotEmpty(message = "Danh mục trống")
    private long categoryId;

    @NotNull(message="Ảnh sản phẩm trống")
    private Set<Long> imageIds;
}
