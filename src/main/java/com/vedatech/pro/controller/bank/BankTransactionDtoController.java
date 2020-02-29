package com.vedatech.pro.controller.bank;


import com.vedatech.pro.model.bank.BankTransactionDto;
import com.vedatech.pro.repository.bank.BankTransactionDtoDao;
import com.vedatech.pro.service.bank.BankTransactionDtoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dto")
public class BankTransactionDtoController {
    HttpHeaders headers = new HttpHeaders();

    BankTransactionDtoService bankTransactionDtoService;
    BankTransactionDtoDao bankTransactionDto;

    public BankTransactionDtoController(BankTransactionDtoService bankTransactionDtoService, BankTransactionDtoDao bankTransactionDto) {
        this.bankTransactionDtoService = bankTransactionDtoService;
        this.bankTransactionDto = bankTransactionDto;
    }

    @RequestMapping(value = "/getAllBankTransaction", method = RequestMethod.GET)
    public ResponseEntity<List<BankTransactionDto>> getAllBankTransaction() {

        List<BankTransactionDto> bankTransactionDtoList = bankTransactionDtoService.findAll();
        List<BankTransactionDto> bankTransactionDtoList2 = (List<BankTransactionDto>) bankTransactionDto.findAll();
        System.out.println("LISTA DE BANK TRANSACT " + bankTransactionDtoList2.toString());
        if (bankTransactionDtoList.isEmpty()) {
            headers.set("error", "no existen movimientos de cuentas bancarias");
            return new ResponseEntity<List<BankTransactionDto>>(headers, HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<BankTransactionDto>>(bankTransactionDtoList2, HttpStatus.OK);

    }
}
