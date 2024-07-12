package com.hscastro.hexagonal.config;

import com.hscastro.hexagonal.adapters.out.FindCustumerByIdAdapter;
import com.hscastro.hexagonal.application.core.usecase.FindCustumerByIdUseCase;
import com.hscastro.hexagonal.application.ports.out.FindCustumerByIdOuputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustumerByIdConfig {

    @Bean
    public FindCustumerByIdUseCase findCustumerByIdUseCase(FindCustumerByIdOuputPort findCustumerByIdOuputPort){
             return new FindCustumerByIdUseCase(findCustumerByIdOuputPort);
    }
}
