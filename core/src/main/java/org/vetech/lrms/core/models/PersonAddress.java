package org.vetech.lrms.core.models;
// Generated Jan 17, 2015 8:30:18 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * PersonAddress generated by hbm2java
 */
public class PersonAddress  implements java.io.Serializable {


     private Integer personAddressId;
     private Persons persons;
     private String address;
     private String cityVillage;
     private String stateProvince;
     private String countyDistrict;
     private String postalCode;
     private String country;
     private int creator;
     private Date dateCreated;
     private Boolean voided;
     private Integer retiredBy;
     private Date dateVoided;
     private Integer changedBy;
     private Date dateChanged;
     private String uuid;

    public PersonAddress() {
    }

	
    public PersonAddress(Persons persons, int creator, Date dateCreated) {
        this.persons = persons;
        this.creator = creator;
        this.dateCreated = dateCreated;
    }
    public PersonAddress(Persons persons, String address, String cityVillage, String stateProvince, String countyDistrict, String postalCode, String country, int creator, Date dateCreated, Boolean voided, Integer retiredBy, Date dateVoided, Integer changedBy, Date dateChanged, String uuid) {
       this.persons = persons;
       this.address = address;
       this.cityVillage = cityVillage;
       this.stateProvince = stateProvince;
       this.countyDistrict = countyDistrict;
       this.postalCode = postalCode;
       this.country = country;
       this.creator = creator;
       this.dateCreated = dateCreated;
       this.voided = voided;
       this.retiredBy = retiredBy;
       this.dateVoided = dateVoided;
       this.changedBy = changedBy;
       this.dateChanged = dateChanged;
       this.uuid = uuid;
    }
   
    public Integer getPersonAddressId() {
        return this.personAddressId;
    }
    
    public void setPersonAddressId(Integer personAddressId) {
        this.personAddressId = personAddressId;
    }
    public Persons getPersons() {
        return this.persons;
    }
    
    public void setPersons(Persons persons) {
        this.persons = persons;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCityVillage() {
        return this.cityVillage;
    }
    
    public void setCityVillage(String cityVillage) {
        this.cityVillage = cityVillage;
    }
    public String getStateProvince() {
        return this.stateProvince;
    }
    
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
    public String getCountyDistrict() {
        return this.countyDistrict;
    }
    
    public void setCountyDistrict(String countyDistrict) {
        this.countyDistrict = countyDistrict;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public int getCreator() {
        return this.creator;
    }
    
    public void setCreator(int creator) {
        this.creator = creator;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Boolean getVoided() {
        return this.voided;
    }
    
    public void setVoided(Boolean voided) {
        this.voided = voided;
    }
    public Integer getRetiredBy() {
        return this.retiredBy;
    }
    
    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }
    public Date getDateVoided() {
        return this.dateVoided;
    }
    
    public void setDateVoided(Date dateVoided) {
        this.dateVoided = dateVoided;
    }
    public Integer getChangedBy() {
        return this.changedBy;
    }
    
    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }
    public Date getDateChanged() {
        return this.dateChanged;
    }
    
    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }




}


