package com.hscastro.hexagonal.config;

import com.hscastro.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.hscastro.hexagonal.adapters.out.InsertCustumerAdapter;
import com.hscastro.hexagonal.application.core.usecase.InsertCustumerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustumerConfig {

    @Bean
    public InsertCustumerUseCase insertCustumerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustumerAdapter insertCustumerAdapter){
             return new InsertCustumerUseCase(findAddressByZipCodeAdapter, insertCustumerAdapter);
    }

}
