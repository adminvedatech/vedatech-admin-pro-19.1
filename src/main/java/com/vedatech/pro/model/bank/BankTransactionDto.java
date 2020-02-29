package com.vedatech.pro.model.bank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedatech.pro.model.BaseEntity;
import com.vedatech.pro.model.accounting.Poliza;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "transaction")
public class BankTransactionDto extends BaseEntity {

    @Column
    private String Cuenta;

    @Column(name = "date_operation")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaOperacion;

    @Column(name = "date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecha;

    @Column(name = "reference")
    private String referencia;

    @Column(name = "description")
    private String descripcion;

    @Column(name = "code_transfer")
    private String codTransac;

    @Column
    private String sucursal;

    @Column(name = "deposit")
    private Double depositos;

    @Column(name = "withdraw")
    private Double retiros;

    @Column
    private Double saldo;

    @Column
    private String movimiento;

    @Lob
    @Column(name = "description_details")
    private String DescripcionDetallada;

    @Column(columnDefinition="bit default 0")
    private Boolean isContable;

//    @OneToOne(fetch= FetchType.LAZY)
//    @JoinColumn(name="poliza_id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    Poliza poliza;




    @Override
    public String toString() {
        return "BankTransactionDto{" +
                "Cuenta='" + Cuenta + '\'' +
                ", fechaOperacion=" + fechaOperacion +
                ", fecha=" + fecha +
                ", referencia='" + referencia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codTransac='" + codTransac + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", deposito=" + depositos +
                ", retiro=" + retiros +
                ", saldo=" + saldo +
                ", movimiento='" + movimiento + '\'' +
                ", DescripcionDetallada='" + DescripcionDetallada + '\'' +
                '}';
    }
}
