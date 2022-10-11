package com.serviceRest.CustomerInformationApi.model.dtos;

public class CustomerDTO {
    private String documentType;
    private int numberDocument;

    public CustomerDTO(String documentType, int numberDocument) {
        this.documentType = documentType;
        this.numberDocument = numberDocument;
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
}
