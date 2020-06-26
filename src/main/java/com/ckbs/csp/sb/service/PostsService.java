package com.ckbs.csp.sb.service;

import com.ckbs.csp.sb.domain.posts.Posts;
import com.ckbs.csp.sb.domain.posts.PostsRepository;
import com.ckbs.csp.sb.web.dto.PostsResponseDto;
import com.ckbs.csp.sb.web.dto.PostsSaveRequestDto;
import com.ckbs.csp.sb.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEnity()).getId();
    }
    /////////////////

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("[Error]해당 게시글없음 id="+id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById (Long id){
        Posts entity = postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("[Error2]해당 게시글없음2 id="+id));
        return new PostsResponseDto(entity);
    }







}
