package com.project.questapp.requests;

import lombok.Data;

@Data
public class PostUpdateRequest {

    //sadece bu iki alanı update edebiliriz.
    String title;
    String text;
}
