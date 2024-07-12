package com.hscastro.hexagonal.application.core.domain;

public class Custumer {

    private String id;
    private String name;
    private Address address;
    private String cpf;
    private boolean isValidaCpf;

    public Custumer() {
        this.isValidaCpf = false;
    }

    public Custumer(String id, String name, Address address, String cpf, boolean isValid) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidaCpf = isValid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isValidaCpf() {
        return isValidaCpf;
    }

    public void setValidaCpf(boolean validaCpf) {
        isValidaCpf = validaCpf;
    }
}
