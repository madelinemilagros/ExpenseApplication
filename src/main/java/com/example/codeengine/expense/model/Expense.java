package com.example.codeengine.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Data
@Table(name="expense")
public class Expense {

    @Id
    private Long id;

    private Instant expensedate;

    private String description;

    private String location;

    @ManyToOne
    private Category category;

//    @JsonIgnore
    @ManyToOne
    private User user;


}
