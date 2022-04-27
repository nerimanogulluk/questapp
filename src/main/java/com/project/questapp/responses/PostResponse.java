package com.project.questapp.responses;

import com.project.questapp.entities.Post;
import lombok.Data;

@Data
public class PostResponse {

    Long id;
    Long userId;
    String userName;
    String title;
    String text;

    public PostResponse(Post entity){ //constructor mapper yapmış olduk aslında
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.userName = entity.getUser().getUserName();
        this.title = entity.getTitle();
        this.text = entity.getText();

    }
}
