package com.example.application.mappers;



import com.example.application.dto.AccountDto;
import com.example.application.entities.Account;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Configuration;


@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDto accountToAccountDto(Account account);

    Account accountDtoToAccount(AccountDto accountDto);
}
