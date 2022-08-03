package com.bootcoin.project.domain.services.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcoin.project.domain.entity.Account;
import com.bootcoin.project.domain.services.AccountService;
import com.bootcoin.project.infraestructure.repository.AccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Mono<Account> find(String phone) {
      return accountRepository.findByPhone(phone);
    }

    @Override
    public Mono<Account> save(Account account) {
      return accountRepository.save(account);
    }

    @Override
    public Mono<Account> update(Account account) {
      return accountRepository.findByIdAccount(account.getIdAccount()).switchIfEmpty(Mono.empty()).flatMap(user -> accountRepository.save(account));
    }

    @Override   
    public Flux<Account> saveAll(List<Account> account) {
      return accountRepository.saveAll(account);
    }

}
