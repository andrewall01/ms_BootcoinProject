package com.bootcoin.project.infraestructure.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bootcoin.project.domain.entity.Account;
import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
  Mono<Account> findByIdAccount(String idAccount);  
  Mono<Account> findByPhone(String phone);    
    
}
