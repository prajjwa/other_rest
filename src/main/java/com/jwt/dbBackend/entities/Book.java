package com.jwt.dbBackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @JsonIgnore
    @ManyToOne
    @PrimaryKeyJoinColumn
    private Users user;


    @JsonIgnore
    @OneToMany(mappedBy = "book")
    private List<Trade> tradeList;
}
