package model;

public class Identity {
    private String documentType;
    private String documentID;

    public Identity(String documentType, String documentID) {
        this.documentType = documentType;
        this.documentID = documentID;
    }

    public String getIdType() {
        return this.documentType;
    }

    public void setIdType(String documentType) {
        this.documentType = documentType;
    }

    public String getIdNumber() {
        return this.documentID;
    }

    public void setIdNumber(String documentID) {
        this.documentID = documentID;
    }
}