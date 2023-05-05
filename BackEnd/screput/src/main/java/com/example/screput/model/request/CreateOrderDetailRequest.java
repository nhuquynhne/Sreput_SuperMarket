package com.example.screput.model.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderDetailRequest {

    @NotNull(message="Tên sản phẩm trống")
    @NotEmpty(message = "Tên sản phẩm trống")
    @Size(min=5,max=50,message="Tên sản phẩm từ 5-50 ký tự")
    private String name;

    @NotNull(message="Giá sản phẩm trống")
    @NotEmpty(message="Giá sản phẩm trống")
    @Size(min=0,message ="Giá sản phẩm từ 0 trở lên")
    private long price;

    @NotNull(message = "Số lượng sản phẩm trống")
    @NotEmpty(message = "Số lượng sản phẩm trống")
    @Size(min = 1,message="Số lượng sản phẩm từ 1 trở lên")
    private int quantity;

    private long subTotal;
}
