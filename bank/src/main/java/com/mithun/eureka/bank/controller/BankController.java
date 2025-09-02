package com.mithun.eureka.bank.controller;

import com.mithun.eureka.bank.entity.AccountResponse;
import com.mithun.eureka.bank.entity.BankEntity;
import com.mithun.eureka.bank.entity.CustomerDto;
import com.mithun.eureka.bank.service.BankService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("createAccount")
    public ResponseEntity<String> createAccount(@Valid @RequestBody CustomerDto customer){
        return bankService.createAccount(customer);
    }

    @GetMapping("getAccount/{customerId}")
    public ResponseEntity<AccountResponse> getAccountDetails(@PathVariable Long customerId){
        return bankService.getAccountDetails(customerId);
    }

    @GetMapping("getBankByCusId/{customerId}")
    public BankEntity getBanKByCusId(@PathVariable Long customerId){
        return bankService.getBankDetailsById(customerId);
    }

    @GetMapping("getBankByAccId/{accId}")
    public BankEntity getBanKByAccId(@PathVariable Long accId){
        return bankService.getBankDetailsByAccId(accId);
    }

}
