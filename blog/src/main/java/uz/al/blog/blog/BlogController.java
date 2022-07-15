package uz.al.blog.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BlogController {
    private final BlogService service;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<BlogEntity> create(@RequestBody BlogEntity blog) {
        return new ResponseEntity<>(service.create(blog), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<BlogEntity>> list() {
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
}
