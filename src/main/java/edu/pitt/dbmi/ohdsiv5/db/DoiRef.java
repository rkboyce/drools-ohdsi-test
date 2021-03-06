package edu.pitt.dbmi.ohdsiv5.db;
// Generated Jun 15, 2010 5:42:53 PM by Hibernate Tools 3.1.0.beta4

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * DoiRef generated by hbm2java
 */
@Entity
@Table(name="DOI_REF")

public class DoiRef  implements java.io.Serializable {


    // Fields    

     private Long id;


    // Constructors

    /** default constructor */
    public DoiRef() {
    }

    
    /** full constructor */
    public DoiRef(Long id) {
        this.id = id;
    }
    

   
    // Property accessors
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="doiConceptId", column=@Column(name="DOI_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=15, scale=0) ), 
        @AttributeOverride(name="doiDrugName", column=@Column(name="DOI_DRUG_NAME", unique=false, nullable=false, insertable=true, updatable=true) ), 
        @AttributeOverride(name="doiDescription", column=@Column(name="DOI_DESCRIPTION", unique=false, nullable=false, insertable=true, updatable=true, length=2000) ) } )

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
   








}
