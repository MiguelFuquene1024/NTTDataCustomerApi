package com.serviceRest.CustomerInformationApi.model.entities;


import com.serviceRest.CustomerInformationApi.model.dtos.CustomerDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String documentType;
    private int numberDocument;
    private String firstName;
    private String secondName;
    private String firstLastname;
    private String secondLastname;
    private int phone;
    private String address;
    private String residenceCity;

    public Customer() {
    }

    public Customer(long id, String documentType, int numberDocument, String firstName, String secondName, String firstLastname, String secondLastname, int phone, String address, String residenceCity) {
        this.id = id;
        this.documentType = documentType;
        this.numberDocument = numberDocument;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastname = firstLastname;
        this.secondLastname = secondLastname;
        this.phone = phone;
        this.address = address;
        this.residenceCity = residenceCity;
    }

    public Customer(CustomerDTO usuarioDto){
        this.documentType = usuarioDto.getDocumentType();
        this.numberDocument = usuarioDto.getNumberDocument();
    }
    public Customer(String documentType, int numberDocument) {
        this.documentType =documentType;
        this.numberDocument =numberDocument;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(int numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastname() {
        return firstLastname;
    }

    public void setFirstLastname(String firstLastname) {
        this.firstLastname = firstLastname;
    }

    public String getSecondLastname() {
        return secondLastname;
    }

    public void setSecondLastname(String secondLastname) {
        this.secondLastname = secondLastname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }
}
