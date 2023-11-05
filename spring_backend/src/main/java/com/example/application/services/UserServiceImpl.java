package com.example.application.services;

import com.example.application.Repositries.AccountRepository;
import com.example.application.dto.AccountDto;
import com.example.application.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.application.mappers.AccountMapper;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService,UserDetailsService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;


    public UserServiceImpl(AccountRepository accountRepository,
                       PasswordEncoder passwordEncoder
                       ){
        this.accountRepository=accountRepository;
        this.passwordEncoder=passwordEncoder;
    }


    @Override
    public AccountDto createUser(AccountDto accountDto) {
        Account account=AccountMapper.INSTANCE.accountDtoToAccount(accountDto);
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return AccountMapper.INSTANCE.accountToAccountDto(accountRepository.save(account));
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountRepository.findById(id).orElse(null);
    }
    @Override
    public Account findAccountByPhoneNumber(String number) {
        return accountRepository.findByPhoneNumber(number);
    }
    @Override
    public Account findAccountByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account user=accountRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with the provided email");
        }
        return user;
    }



}
