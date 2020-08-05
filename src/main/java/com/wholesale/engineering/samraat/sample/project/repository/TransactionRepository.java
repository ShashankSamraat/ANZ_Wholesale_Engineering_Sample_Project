package com.wholesale.engineering.samraat.sample.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wholesale.engineering.samraat.sample.project.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	List<Transaction> findByAccountNumber(String accountNumber);

}
