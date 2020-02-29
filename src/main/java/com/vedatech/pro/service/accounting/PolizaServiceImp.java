package com.vedatech.pro.service.accounting;


import com.vedatech.pro.model.accounting.Poliza;
import com.vedatech.pro.repository.accounting.PolizaDao;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PolizaServiceImp implements PolizaService {

    public final PolizaDao polizaDao;

    public PolizaServiceImp(PolizaDao polizaDao) {
        this.polizaDao = polizaDao;
    }

    @Override
    public List<Poliza> findAll() {
        return (List<Poliza>) polizaDao.findAll();
    }

    @Override
    public Optional<Poliza> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Poliza save(Poliza object)
    {
        System.out.println("POLIZA SERVICE IMP SAVE");
        return polizaDao.save(object);
    }

    @Override
    public void delete(Poliza object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<Poliza> object) {

    }
}
