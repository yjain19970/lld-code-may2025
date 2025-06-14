package com.example.splitwise2025.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExpenseUser extends BaseModel {

    @ManyToOne
    private Expense expense;
    @ManyToOne
    private User user;
    private double amount;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseUserType expenseUserType;
}
