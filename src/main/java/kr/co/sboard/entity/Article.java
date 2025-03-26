package kr.co.sboard.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.LazyGroup;

import java.time.LocalDateTime;




@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    @Column(nullable = false)
    private String cate;

    private String title;
    private String content;
    private int comment;
    private int file;
    private int hit;
    private String writer;
    private String regip;

    @CreationTimestamp
    private LocalDateTime wdate;
    
    // 추가 필드
    


    @PrePersist
    public void prePersist(){
        // 엔티티 기본 속성 값 초기화
        if(this.cate == null){
            this.cate= "free";
        }
    }
}
