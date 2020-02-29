package com.vedatech.pro.repository.bank;

import com.vedatech.pro.model.bank.BankingMovement;
import org.springframework.data.repository.CrudRepository;

public interface BankingMovementDao extends CrudRepository<BankingMovement, Long> {
}
