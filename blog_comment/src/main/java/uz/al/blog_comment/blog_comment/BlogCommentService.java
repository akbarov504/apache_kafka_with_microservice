package uz.al.blog_comment.blog_comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.al.blog_comment.blog_comment.kafka.ProducerService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BlogCommentService {
    private final ProducerService producerService;
    private final BlogCommentRepository repository;

    public BlogCommentEntity create(BlogCommentEntity comment) {
        producerService.sendMessage("This " + comment.toString() + " comment is created !");
        return repository.save(comment);
    }

    public List<BlogCommentEntity> list(Integer blogId) {
        return repository.findAllByBlogId(blogId);
    }
}
