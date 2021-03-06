package com.vedatech.pro.service.bank;

import com.vedatech.pro.model.bank.BankTransactionDto;
import com.vedatech.pro.repository.bank.BankTransactionDtoDao;
import com.vedatech.pro.service.bank.BankTransactionDtoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class BankTransactionDtoServiceImp implements BankTransactionDtoService {


    public final BankTransactionDtoDao bankTransactionDtoDao;

    public BankTransactionDtoServiceImp(BankTransactionDtoDao bankTransactionDtoDao) {
        this.bankTransactionDtoDao = bankTransactionDtoDao;
    }



    @Override
    public List<BankTransactionDto> findAll() {
        System.out.println("BANK TRANSACTION DTO SERVICE");
       return (List<BankTransactionDto>) this.bankTransactionDtoDao.findAll();
    }

    @Override
    public Optional<BankTransactionDto> findById(Long aLong) {
        return bankTransactionDtoDao.findById(aLong);
    }

    @Override
    public BankTransactionDto save(BankTransactionDto object) {
        return null;
    }

    @Override
    public void delete(BankTransactionDto object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<BankTransactionDto> object) {
            bankTransactionDtoDao.saveAll(object);
    }
}
