package com.bootcoin.project.domain.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import com.bootcoin.project.domain.entity.Account;

public interface AccountService {
  Mono<Account> find(String phone);
  Mono<Account> save(Account account);
  Mono<Account> update(Account account);
  Flux<Account> saveAll(List<Account> account);

}
