package com.mithun.eureka.bank.repo;


import com.mithun.eureka.bank.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepo extends JpaRepository<BankEntity, Long>{


    @Query("SELECT b FROM BankEntity b WHERE b.customerId = :customerId")
    Optional<BankEntity> findByCustomerId(@Param("customerId") Long customerId);


}
