package uz.al.blog.blog;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog")
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false, length = 300, unique = true)
    private String title;

    @Column(name = "image", nullable = false, columnDefinition = "text")
    private String image;

    @Column(name = "description", nullable = false, length = 500)
    private String description;
}
