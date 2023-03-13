package com.example.springmodulzaro.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Table;


@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "user_mz")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String jobTitle;

}
