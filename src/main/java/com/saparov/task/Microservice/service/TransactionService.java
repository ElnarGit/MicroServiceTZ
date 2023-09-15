package com.saparov.task.Microservice.service;

import com.saparov.task.Microservice.entity.Transaction;
import com.saparov.task.Microservice.exception.NotFoundException;
import com.saparov.task.Microservice.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TransactionService {
	private final TransactionRepository transactionRepository;
	private final LimitService limitService;
	
	public List<Transaction> getAllTransaction(){
		return transactionRepository.findAll();
	}
	
	public List<Transaction> getTransactionsWithLimitExceeded(){
		return transactionRepository.findByLimitExceededTrue();
	}
	
	public Transaction getTransactionById(Long id){
		return transactionRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Transaction not found with id: " + id));
	}
	
	@Transactional
	public Transaction createTransaction(Transaction transaction){
		return transactionRepository.save(transaction);
	}
	
	@Transactional
	public void deleteTransaction(Long id){
		transactionRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Transaction not found with id: " + id));
		
		transactionRepository.deleteById(id);
	}
	

}
