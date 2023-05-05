package com.example.screput.model.request;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    
    @NotNull(message="Họ khách hàng trống")
    @NotEmpty(message="Họ khách hàng trống")
    private String firstname;
    
    @NotNull(message="Tên khách hàng trống")
    @NotEmpty(message="Tên khách hàng trống")
    private String lastname;

    @NotNull(message="Tên quốc gia trống")
    @NotEmpty(message="Tên quốc gia trống")
    private String country;

    @NotNull(message="Tên địa chỉ trống")
    @NotEmpty(message="Tên địa chỉ trống")
    private String address;

    @NotNull(message="Tên khu vực trống")
    @NotEmpty(message="Tên khu vực trống")
    private String state;

    @NotNull(message ="Mã bưu điện trống")
    @NotEmpty(message ="Mã bưu điện trống")
    private long postCode;

    @NotNull(message = "Email trống")
    @NotEmpty(message = "Email trống")
    @Email(message = "Email không đúng định dạng")
    private String email;
     
    @NotNull(message="Số điện thoại trống")
    @NotEmpty(message="Số điện thoại trống")
    private String phone;

    private String note;

    private long totalPrice;
    
    private String username;

    private List<CreateOrderDetailRequest> orderDetails;
    
}
