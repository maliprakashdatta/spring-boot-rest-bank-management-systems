package com.swsa.domain;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    int customerId;
    String name;
    long mobileNo;
    String address;
    String emailId;
    long aadhaarNo;


}
