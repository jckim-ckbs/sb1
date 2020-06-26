package com.ckbs.csp.sb.web.dto;

import com.ckbs.csp.sb.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEnity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }




}
