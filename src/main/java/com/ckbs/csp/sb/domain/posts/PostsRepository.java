package com.ckbs.csp.sb.domain.posts;

import com.ckbs.csp.sb.service.PostsService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {


}
