package com.hscastro.hexagonal.adapters.in.controller;

import com.hscastro.hexagonal.adapters.in.controller.mapper.CustumerMapper;
import com.hscastro.hexagonal.adapters.in.controller.request.CustumerRequest;
import com.hscastro.hexagonal.adapters.in.controller.response.CustumerResponse;
import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.in.DeleteCustumerInputPort;
import com.hscastro.hexagonal.application.ports.in.FindCustumerByIdInputPort;
import com.hscastro.hexagonal.application.ports.in.InsertCustumerInputPort;
import com.hscastro.hexagonal.application.ports.in.UpdateCustumerInputPort;
import com.hscastro.hexagonal.application.ports.out.InsertCustumerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/custumers")
public class CustumerController {

    @Autowired
    private InsertCustumerInputPort insertCustumerInputPort;

    @Autowired
    private FindCustumerByIdInputPort findCustumerByIdInputPort;

    @Autowired
    private UpdateCustumerInputPort updateCustumerInputPort;

    @Autowired
    private DeleteCustumerInputPort deleteCustumerInputPort;

    @Autowired
    private CustumerMapper custumerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustumerRequest custumerRequest){
        var custumer = custumerMapper.toCustumer(custumerRequest);
        insertCustumerInputPort.insertCustumer(custumer, custumerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustumerResponse> find(@PathVariable("id") final String id){
        var custumer = findCustumerByIdInputPort.findCustumer(id);
        var custumerResponse = custumerMapper.toCustumerResponse(custumer);
        return ResponseEntity.ok(custumerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") final String id, @Valid @RequestBody CustumerRequest custumerRequest){
        Custumer custumer = custumerMapper.toCustumer(custumerRequest);
        custumer.setId(id);
        updateCustumerInputPort.updateCustumer(custumer, custumerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final String id){
        var custumer = findCustumerByIdInputPort.findCustumer(id);
        deleteCustumerInputPort.deleteCustumer(custumer);
        return ResponseEntity.noContent().build();
    }
}
