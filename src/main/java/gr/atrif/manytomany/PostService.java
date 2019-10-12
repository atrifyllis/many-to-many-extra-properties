package gr.atrif.manytomany;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;
    private TagRepository tagRepository;

    public PostService(PostRepository postRepository, TagRepository tagRepository) {
        this.postRepository = postRepository;
        this.tagRepository = tagRepository;
    }

    public Post create() {
        List<Tag> tags = this.tagRepository.findAll();
        Post post = new Post("post title");
        post.addTag(tags.get(0));
        return postRepository.save(post);
    }
}
