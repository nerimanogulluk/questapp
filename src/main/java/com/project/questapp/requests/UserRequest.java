package com.project.questapp.requests;

import lombok.Data;

//login olurken sadece lazım olacakları yazdık
@Data
public class UserRequest {

    String userName;
    String password;

}