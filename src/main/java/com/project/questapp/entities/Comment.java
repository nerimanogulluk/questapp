package com.project.questapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@Data
public class Comment {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //bi user silince postları da silinsin
    @JsonIgnore //Serialization kısmında sorun çıkarmaması için bu alanı ignore et
    Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //bi user silince postları da silinsin
    @JsonIgnore //Serialization kısmında sorun çıkarmaması için bu alanı ignore et
    User user;

    @Lob  //Large object olarak ifade edilir,yani büyük veri tipleri için kullanılır.
    @Column(columnDefinition = "text")
    String text;

}
