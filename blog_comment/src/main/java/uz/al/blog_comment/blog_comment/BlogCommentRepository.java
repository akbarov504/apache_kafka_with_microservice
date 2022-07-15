package uz.al.blog_comment.blog_comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogCommentRepository extends JpaRepository<BlogCommentEntity, Integer> {
    List<BlogCommentEntity> findAllByBlogId(Integer blogId);
}
