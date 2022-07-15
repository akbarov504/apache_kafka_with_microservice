package uz.al.blog.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.al.blog.blog.kafka.ProducerService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository repository;
    private final ProducerService producerService;

    public BlogEntity create(BlogEntity blog) {
        producerService.sendMessage("This " + blog.toString() + " blog is created !");
        return repository.save(blog);
    }

    public List<BlogEntity> list() {
        return repository.findAll();
    }
}
