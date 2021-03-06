package com.ckbs.csp.sb.web.dto;

import com.ckbs.csp.sb.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    /*
    public String index(){

        return "index";
    }
     */
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }


    @GetMapping("/posts/save")
    public String postSave(){
        return "posts-save";
    }



}
