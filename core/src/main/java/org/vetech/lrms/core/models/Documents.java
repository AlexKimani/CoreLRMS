package org.vetech.lrms.core.models;
// Generated Jan 17, 2015 8:30:18 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Documents generated by hbm2java
 */
public class Documents  implements java.io.Serializable {


     private DocumentsId id;
     private int documentCaseClassId;
     private int clientId;
     private Date dateOpened;
     private int creator;
     private Date dateCreated;
     private Integer changedBy;
     private Date dateChanged;
     private Boolean retired;
     private Integer retiredBy;
     private Date dateRetired;
     private String retireReason;
     private String uuid;

    public Documents() {
    }

	
    public Documents(DocumentsId id, int documentCaseClassId, int clientId, Date dateOpened, int creator, Date dateCreated, String uuid) {
        this.id = id;
        this.documentCaseClassId = documentCaseClassId;
        this.clientId = clientId;
        this.dateOpened = dateOpened;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.uuid = uuid;
    }
    public Documents(DocumentsId id, int documentCaseClassId, int clientId, Date dateOpened, int creator, Date dateCreated, Integer changedBy, Date dateChanged, Boolean retired, Integer retiredBy, Date dateRetired, String retireReason, String uuid) {
       this.id = id;
       this.documentCaseClassId = documentCaseClassId;
       this.clientId = clientId;
       this.dateOpened = dateOpened;
       this.creator = creator;
       this.dateCreated = dateCreated;
       this.changedBy = changedBy;
       this.dateChanged = dateChanged;
       this.retired = retired;
       this.retiredBy = retiredBy;
       this.dateRetired = dateRetired;
       this.retireReason = retireReason;
       this.uuid = uuid;
    }
   
    public DocumentsId getId() {
        return this.id;
    }
    
    public void setId(DocumentsId id) {
        this.id = id;
    }
    public int getDocumentCaseClassId() {
        return this.documentCaseClassId;
    }
    
    public void setDocumentCaseClassId(int documentCaseClassId) {
        this.documentCaseClassId = documentCaseClassId;
    }
    public int getClientId() {
        return this.clientId;
    }
    
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public Date getDateOpened() {
        return this.dateOpened;
    }
    
    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
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
    public Boolean getRetired() {
        return this.retired;
    }
    
    public void setRetired(Boolean retired) {
        this.retired = retired;
    }
    public Integer getRetiredBy() {
        return this.retiredBy;
    }
    
    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }
    public Date getDateRetired() {
        return this.dateRetired;
    }
    
    public void setDateRetired(Date dateRetired) {
        this.dateRetired = dateRetired;
    }
    public String getRetireReason() {
        return this.retireReason;
    }
    
    public void setRetireReason(String retireReason) {
        this.retireReason = retireReason;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }




}


