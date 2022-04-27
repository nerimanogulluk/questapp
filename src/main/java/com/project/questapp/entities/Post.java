package com.project.questapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "post")
@Data
public class Post {

    @Id
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //bi user silince postları da silinsin
    //@JsonIgnore //Serialization kısmında sorun çıkarmaması için bu alanı ignore et
    User user;

    String title;
    @Lob
    @Column(columnDefinition = "text") //hibernate mysqlde stringi text olarak algılaması için
    String text;
}
