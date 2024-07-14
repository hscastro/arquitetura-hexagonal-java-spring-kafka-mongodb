package com.hscastro.hexagonal.config;

import com.hscastro.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.hscastro.hexagonal.adapters.out.UpdateCustumerAdapter;
import com.hscastro.hexagonal.application.core.usecase.FindCustumerByIdUseCase;
import com.hscastro.hexagonal.application.core.usecase.UpdateCustumerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustumerConfig {

    @Bean
    public UpdateCustumerUseCase updateCustumerUseCase(
            FindCustumerByIdUseCase findCustumerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustumerAdapter updateCustumerAdapter){
             return new UpdateCustumerUseCase(findCustumerByIdUseCase, findAddressByZipCodeAdapter, updateCustumerAdapter);
    }
}
