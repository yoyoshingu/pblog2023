package com.sg.leo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sg.leo.PostService;
import com.sg.leo.domain.Post;

@Controller
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping("/post")
	public String insertPost(@RequestBody Post post){
		
		post.setCnt(0);
		postService.insertPost(post);
		return  "새로운포스트 등록";
		
	}
	
	@GetMapping("/post")
	public String post() {
		return "insertPost";
	}
	

	
}
