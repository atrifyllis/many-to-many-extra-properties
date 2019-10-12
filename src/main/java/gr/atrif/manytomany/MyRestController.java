package gr.atrif.manytomany;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

    private TagRepository tagRepository;
    private PostService postService;

    public MyRestController(TagRepository tagRepository, PostService postService) {
        this.tagRepository = tagRepository;
        this.postService = postService;
    }
    @GetMapping("/tags")
    public List<Tag> getTags() {
        return this.tagRepository.findAll();
    }

    @PostMapping("/post")
    public Post createPost() {
        return this.postService.create();
    }
}
