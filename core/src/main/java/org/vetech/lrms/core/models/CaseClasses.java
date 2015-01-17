package org.vetech.lrms.core.models;
// Generated Jan 17, 2015 8:30:18 PM by Hibernate Tools 3.6.0



/**
 * CaseClasses generated by hbm2java
 */
public class CaseClasses  implements java.io.Serializable {


     private CaseClassesId id;
     private String class_;
     private String description;

    public CaseClasses() {
    }

	
    public CaseClasses(CaseClassesId id, String class_) {
        this.id = id;
        this.class_ = class_;
    }
    public CaseClasses(CaseClassesId id, String class_, String description) {
       this.id = id;
       this.class_ = class_;
       this.description = description;
    }
   
    public CaseClassesId getId() {
        return this.id;
    }
    
    public void setId(CaseClassesId id) {
        this.id = id;
    }
    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


