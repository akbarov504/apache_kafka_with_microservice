package uz.al.blog_comment.blog_comment;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog_comment")
public class BlogCommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "blog_id", nullable = false)
    private Integer blogId;

    @Column(name = "message", nullable = false, length = 300)
    private String message;
}
