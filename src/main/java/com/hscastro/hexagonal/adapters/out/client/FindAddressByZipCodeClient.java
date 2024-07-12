package com.hscastro.hexagonal.adapters.out.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressByZipCodeClient", url="hscastro.client.address.url")
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);


}
