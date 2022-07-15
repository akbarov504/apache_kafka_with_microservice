package uz.al.blog_comment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@OpenAPIDefinition
@SpringBootApplication
public class BlogCommentApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogCommentApplication.class, args);
    }
}
