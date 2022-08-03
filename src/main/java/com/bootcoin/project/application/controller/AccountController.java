package com.bootcoin.project.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bootcoin.project.domain.entity.Account;
import com.bootcoin.project.domain.services.AccountService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bootcoin/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public Mono<ResponseEntity<Account>> saveAccount (@RequestBody Account account) {
        System.out.println(account);
        return accountService.save(account)
            .map(ResponseEntity::ok)
            .defaultIfEmpty(ResponseEntity.badRequest().build());
    }

    @PutMapping("/update")
    public Mono<ResponseEntity<Account>> updateAccount (@RequestBody Account account) {
        return accountService
            .update(account)
            .map(ResponseEntity::ok)
            .defaultIfEmpty(ResponseEntity.badRequest().build());
    }

    @GetMapping("/{phone}")
    public Mono<ResponseEntity<Account>> findAccount (@PathVariable("phone") String phone) {
        return accountService.find(phone)
            .map(ResponseEntity::ok)
            .defaultIfEmpty(ResponseEntity.noContent().build());
    }

}
