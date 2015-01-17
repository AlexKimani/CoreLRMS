package org.vetech.lrms.core.models;
// Generated Jan 17, 2015 8:30:18 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * PersonAttribute generated by hbm2java
 */
public class PersonAttribute  implements java.io.Serializable {


     private Integer personAttributeId;
     private Persons persons;
     private String nationalId;
     private String phoneNumber;
     private int personAttributeTypeId;
     private int creator;
     private Date dateCreated;
     private Integer changedBy;
     private Date dateChanged;
     private boolean voided;
     private Integer retiredBy;
     private String uuid;

    public PersonAttribute() {
    }

	
    public PersonAttribute(Persons persons, int personAttributeTypeId, int creator, Date dateCreated, boolean voided) {
        this.persons = persons;
        this.personAttributeTypeId = personAttributeTypeId;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.voided = voided;
    }
    public PersonAttribute(Persons persons, String nationalId, String phoneNumber, int personAttributeTypeId, int creator, Date dateCreated, Integer changedBy, Date dateChanged, boolean voided, Integer retiredBy, String uuid) {
       this.persons = persons;
       this.nationalId = nationalId;
       this.phoneNumber = phoneNumber;
       this.personAttributeTypeId = personAttributeTypeId;
       this.creator = creator;
       this.dateCreated = dateCreated;
       this.changedBy = changedBy;
       this.dateChanged = dateChanged;
       this.voided = voided;
       this.retiredBy = retiredBy;
       this.uuid = uuid;
    }
   
    public Integer getPersonAttributeId() {
        return this.personAttributeId;
    }
    
    public void setPersonAttributeId(Integer personAttributeId) {
        this.personAttributeId = personAttributeId;
    }
    public Persons getPersons() {
        return this.persons;
    }
    
    public void setPersons(Persons persons) {
        this.persons = persons;
    }
    public String getNationalId() {
        return this.nationalId;
    }
    
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPersonAttributeTypeId() {
        return this.personAttributeTypeId;
    }
    
    public void setPersonAttributeTypeId(int personAttributeTypeId) {
        this.personAttributeTypeId = personAttributeTypeId;
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
    public boolean isVoided() {
        return this.voided;
    }
    
    public void setVoided(boolean voided) {
        this.voided = voided;
    }
    public Integer getRetiredBy() {
        return this.retiredBy;
    }
    
    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }




}


