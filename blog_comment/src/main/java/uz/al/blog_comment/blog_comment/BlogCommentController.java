package uz.al.blog_comment.blog_comment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BlogCommentController {
    private final BlogCommentService service;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<BlogCommentEntity> create(@RequestBody BlogCommentEntity comment) {
        return new ResponseEntity<>(service.create(comment), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
    public ResponseEntity<List<BlogCommentEntity>> list(@PathVariable Integer blogId) {
        return new ResponseEntity<>(service.list(blogId), HttpStatus.OK);
    }
}
