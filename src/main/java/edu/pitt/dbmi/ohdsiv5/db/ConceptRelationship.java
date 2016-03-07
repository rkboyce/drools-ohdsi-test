package edu.pitt.dbmi.ohdsiv5.db;
// Generated Aug 25, 2010 7:48:41 AM by Hibernate Tools 3.1.0.beta4

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

/**
 * ConceptRelationship generated by hbm2java
 */
@Entity
@Table(name="CONCEPT_RELATIONSHIP", uniqueConstraints = {  })

public class ConceptRelationship  implements java.io.Serializable {


    // Fields    

    private String relationshipId;
    private Integer conceptId1;
    private Integer conceptId2;
    private Calendar validStartDate;
    private Calendar validEndDate;
    private String invalidReason;


    // Constructors

    /** default constructor */
    public ConceptRelationship() {
    }

    
    /** full constructor */
    public ConceptRelationship(String relationshipId, Integer conceptId1, Integer conceptId2) {
        this.relationshipId = relationshipId;
        this.conceptId1 = conceptId1;
        this.conceptId2 = conceptId2;	
    }
    

   
    // Property accessors
    @Id
    @Column(name="RELATIONSHIP_ID", unique=true, nullable=false, insertable=true, updatable=true, length=20, scale=0)

    public String getRelationshipId() {
        return this.relationshipId;
    }
    
    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
    }
    @Column(name="CONCEPT_ID_1", unique=false, nullable=false, insertable=true, updatable=true, precision=22, scale=0)

    public Integer getConceptId1() {
        return this.conceptId1;
    }
    
    public void setConceptId1(Integer conceptId1) {
        this.conceptId1 = conceptId1;
    }
    @Column(name="CONCEPT_ID_2", unique=false, nullable=false, insertable=true, updatable=true, precision=22, scale=0)

    public Integer getConceptId2() {
        return this.conceptId2;
    }
    
    public void setConceptId2(Integer conceptId2) {
        this.conceptId2 = conceptId2;
    }

    @Column(name="VALID_START_DATE", unique=true, nullable=false, insertable=true, updatable=true, length=7)
    public Calendar getValidStartDate() {
	return validStartDate;
    }
    public void setValidStartDate(Calendar validStartDate) {
	this.validStartDate = validStartDate;
    }

    @Column(name="VALID_END_DATE", unique=true, nullable=false, insertable=true, updatable=true, length=7)
    public Calendar getValidEndDate() {
	return validEndDate;
    }
    public void setValidEndDate(Calendar validEndDate) {
	this.validEndDate = validEndDate;
    }

    @Column(name="INVALID_REASON", unique=true, nullable=true, insertable=true, updatable=true, length=1, scale=0)
    public String getInvalidReason() {
	return invalidReason;
    }
    public void setInvalidReason(String invalidReason) {
	this.invalidReason = invalidReason;
    }









}
