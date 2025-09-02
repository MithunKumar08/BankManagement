package com.mithun.eureka.bank.service;

import com.mithun.eureka.bank.entity.AccountResponse;
import com.mithun.eureka.bank.entity.BankEntity;
import com.mithun.eureka.bank.entity.CustomerDto;
import com.mithun.eureka.bank.repo.BankRepo;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class BankService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private BankRepo bankRepository;

    public ResponseEntity<String> createAccount(@Valid CustomerDto customer) {
        if (customer == null || customer.getCustomerId() == null) {
            return new ResponseEntity<>("Customer data is missing or invalid", HttpStatus.BAD_REQUEST);
        }

        try {
            BankEntity bank = new BankEntity();
            bank.setAccountNumber("12345678");
            bank.setAccountType("Savings Account");
            bank.setBankLocation("Mysore");
            bank.setCustomerId(customer.getCustomerId());

            bankRepository.save(bank);
            System.out.println("Account created: "+ bank);
            return new ResponseEntity<>("Account1 Created Successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // or use a logger
            return new ResponseEntity<>("Customer data is missing or invalid", HttpStatus.BAD_REQUEST);
        }
    }


    public ResponseEntity<AccountResponse> getAccountDetails(Long customerId) {
        try{
            ResponseEntity<CustomerDto> customerDetails = restTemplate.exchange("http://localhost:8080/customer/getCustomer/"+ customerId,
                    HttpMethod.GET,
                    null,
                    CustomerDto.class);

            CustomerDto extractedCustomer = customerDetails.getBody();
            AccountResponse response = modelMapper.map(extractedCustomer,AccountResponse.class);

            BankEntity bankDetails = this.getBankDetailsById(customerId);
            if (bankDetails != null) {
                modelMapper.map(bankDetails, response);
            }

            return new ResponseEntity<>(response,HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public BankEntity getBankDetailsById(Long customerId) {
        Optional<BankEntity> bankDetails =  bankRepository.findByCustomerId(customerId);
         if(bankDetails.isPresent()){
             return bankDetails.get();
         }else {
             return null;
         }
    }

    public BankEntity getBankDetailsByAccId(Long accId) {
        Optional<BankEntity> bank = bankRepository.findById(accId);
        if(bank.isPresent()){
            return bank.get();
        }else {
            return null;
        }
    }
}
