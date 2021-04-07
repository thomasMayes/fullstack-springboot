package com.example.demo.posts;

import lombok.*;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;


@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class Post {
        @Id
        @SequenceGenerator(
                name = "post_sequence",
                sequenceName = "post_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                generator = "post_sequence",
                strategy = GenerationType.SEQUENCE)
        private Long id;
        @NotBlank
        @Column(nullable = false)
        private String title;
        @NotBlank
        @Column(nullable = false)
        private String body;


        public Post(String title, String body) {
            this.title = title;
            this.body = body;
        }


}
