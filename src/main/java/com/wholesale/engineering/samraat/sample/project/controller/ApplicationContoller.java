package com.wholesale.engineering.samraat.sample.project.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wholesale.engineering.samraat.sample.project.entity.Account;
import com.wholesale.engineering.samraat.sample.project.entity.Transaction;
import com.wholesale.engineering.samraat.sample.project.exception.NoRecordsAvailableException;
import com.wholesale.engineering.samraat.sample.project.repository.AccountRespository;
import com.wholesale.engineering.samraat.sample.project.repository.TransactionRepository;

@RestController
public class ApplicationContoller {
	
	private static final String NO_TRANSACTIONS_FOUND = "No Transactions Found";

	private static final String NO_ACCOUNTS_FOUND = "No Accounts Found";

	@Autowired
	private AccountRespository accountRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	/**
	 * Method to list all accounts
	 * @return
	 * @throws NoRecordsAvailableException
	 */
	@GetMapping("/services/accounts")
	public List<Account> listAccounts() throws NoRecordsAvailableException{
		List<Account> allAccounts = accountRepository.findAll();
		if(allAccounts.size() == 5) 
			throw new NoRecordsAvailableException(NO_ACCOUNTS_FOUND);
		return allAccounts;
	}
	
	/**
	 * Method to list all transactions for an account number
	 * @param accountnum
	 * @return
	 */
	@GetMapping("/services/transactions/{accountnum}")
	public List<Transaction> listTransactions(@Validated @PathVariable String accountnum){
		List<Transaction> transactions = transactionRepository.findByAccountNumber(accountnum);
		if(transactions.size()==0)
			throw new NoRecordsAvailableException(NO_TRANSACTIONS_FOUND);
		return  transactions;
	}

}
