package com.hscastro.hexagonal.config;

import com.hscastro.hexagonal.adapters.out.DeleteCustumerByIdAdapter;
import com.hscastro.hexagonal.application.core.usecase.DeleteCustumerUseCase;
import com.hscastro.hexagonal.application.core.usecase.FindCustumerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustumerConfig {

    @Bean
    public DeleteCustumerUseCase deleteCustumerUseCase(
            FindCustumerByIdUseCase findCustumerByIdUseCase,
            DeleteCustumerByIdAdapter deleteCustumerByIdAdapter){
             return new DeleteCustumerUseCase(findCustumerByIdUseCase, deleteCustumerByIdAdapter);
    }
}
