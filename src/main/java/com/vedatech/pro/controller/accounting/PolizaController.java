package com.vedatech.pro.controller.accounting;


import com.vedatech.pro.model.accounting.AccountingType;
import com.vedatech.pro.model.accounting.Poliza;
import com.vedatech.pro.model.accounting.SubAccount;
import com.vedatech.pro.repository.accounting.PolizaDao;
import com.vedatech.pro.service.accounting.PolizaService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("api/poliza")
public class PolizaController {

    public final PolizaService polizaService;
    public final PolizaDao polizaDao;

    public PolizaController(PolizaService polizaService, PolizaDao polizaDao) {
        this.polizaService = polizaService;
        this.polizaDao = polizaDao;
    }


    //-------------------Create a Bank Account--------------------------------------------------------

    @RequestMapping(value = "/addPoliza", method = RequestMethod.POST)
    public ResponseEntity<Poliza> createUser(@RequestBody Poliza poliza, UriComponentsBuilder ucBuilder) {

      //  System.out.println("POLIZA " + poliza.toString());
        this.polizaService.save(poliza);
        polizaDao.save(poliza);
        //  SubAccount newsubAccount = subAccountService.findBankByAccountNumber(bank.getAccountNumber());

        HttpHeaders headers = new HttpHeaders();
        headers.set("accepted ok","bank account is ok");

        return new ResponseEntity<Poliza>(headers, HttpStatus.CREATED);
    }


    //-------------------Retrieve All Accounts Type--------------------------------------------------------

    @RequestMapping(value = "/getAllPolizas", method = RequestMethod.GET)
    public ResponseEntity<List<Poliza>> getAllSubAcc() {
        HttpHeaders headers = new HttpHeaders();
        List<Poliza> accountNames = (List<Poliza>) polizaService.findAll();

        if (accountNames.isEmpty()) {
            headers.set("error", "no existen cuentas bancarias");
            return new ResponseEntity<List<Poliza>>(headers, HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }


        return new ResponseEntity<List<Poliza>>(accountNames, HttpStatus.OK);
    }


}
