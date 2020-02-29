package com.vedatech.pro.service.bank.transaction;

import com.vedatech.pro.model.bank.BankingMovement;
import com.vedatech.pro.repository.bank.BankingMovementDao;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BankingMovementsServiceImp implements BankingMovementsService  {

    public final BankingMovementDao bankingMovementDao;

    public BankingMovementsServiceImp(BankingMovementDao bankingMovementDao) {
        this.bankingMovementDao = bankingMovementDao;
    }

    @Override
    public BankingMovement save(BankingMovement object) {
        return bankingMovementDao.save(object);
    }

    @Override
    public <S extends BankingMovement> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BankingMovement> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<BankingMovement> findAll() {
        return null;
    }

    @Override
    public Iterable<BankingMovement> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BankingMovement entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends BankingMovement> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
