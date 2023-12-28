package com.casava.poeStarter.member.entity;

import com.casava.poeStarter.article.entity.Article;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;

    @Column
    private String email;

    @Column
    private int rating;

    @Column
    private boolean activated;

    @Column
    private int role;

    @OneToMany(mappedBy = "author")
    private List<Article> notices = new ArrayList<>();
}

