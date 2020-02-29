package com.vedatech.pro.model.bank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedatech.pro.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "banking_movement")
public class BankingMovement extends BaseEntity {


    @Column(name = "initial_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date initialDate;

    @Column(name = "payment_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date paymentDate;

    @Column(name = "reference")
    private String reference;

    @Column(name = "paymentTo")
    private String paymentTo;

    @Column
    private Double deposit;

    @Column
    private Double withdraw;

    @Column
    private Double balance;

    @Column
    private Double details;

    @Column
    private Double department;

    @Column(name = "type_of_cost")
    private Double typeOfCost;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="bank_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    Bank bank;
}
