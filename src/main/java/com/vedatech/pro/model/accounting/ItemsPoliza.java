package com.vedatech.pro.model.accounting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedatech.pro.model.BaseEntity;
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
@Table(name = "items_poliza")

public class ItemsPoliza extends BaseEntity {

    @Column(name = "fecha_operacion")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private GregorianCalendar date;

    @Column
    private String concept;

    @Column
    private BigDecimal credit;

    @Column
    private BigDecimal debit;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="subaccount_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    SubAccount subAccount;


}
