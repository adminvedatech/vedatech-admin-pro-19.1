package com.vedatech.pro.model.accounting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedatech.pro.model.BaseEntity;
import com.vedatech.pro.model.bank.BankTransactionDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "poliza")
public class Poliza extends BaseEntity {


    @Column(name = "date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private GregorianCalendar date;

    @Column
    private String type;

    @Column
    private String polizaNum;

    @Column
    private String concept;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "items_poliza_id")
    private List<ItemsPoliza> itemsPolizas;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="bank_transaction_dto_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    BankTransactionDto transaction;



}
