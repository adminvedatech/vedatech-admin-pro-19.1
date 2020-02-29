package com.vedatech.pro.service.bank.transaction;

import com.vedatech.pro.model.bank.BankingMovement;
import org.springframework.data.repository.CrudRepository;

public interface BankingMovementsService extends CrudRepository<BankingMovement, Long> {
}
