package com.vedatech.pro.repository.accounting;

import com.vedatech.pro.model.accounting.Poliza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolizaDao extends CrudRepository<Poliza, Long> {
}
