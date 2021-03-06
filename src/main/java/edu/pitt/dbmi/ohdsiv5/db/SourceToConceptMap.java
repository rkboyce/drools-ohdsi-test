package edu.pitt.dbmi.ohdsiv5.db;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;

import edu.pitt.dbmi.ohdsiv5.db.util.HibernateUtil;


/**
 * SourceToConceptMap generated by hbm2java
 */
@Entity
@Table(name="SOURCE_TO_CONCEPT_MAP")

	public class SourceToConceptMap  implements java.io.Serializable {


	// Fields    

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sourceToConceptMapId;
	private String sourceCode;
	private String sourceCodeDescription;
	private String mappingType;
	private Integer targetConceptId;
	private Integer targetVocabularyId;
	private Integer sourceVocabularyId;


	// Constructors

	/** default constructor */
	public SourceToConceptMap() {
	}

	/** minimal constructor */
	public SourceToConceptMap(String sourceCode, String mappingType, Integer targetConceptId, Integer targetVocabularyId, Integer sourceVocabularyId) {
		this.sourceCode = sourceCode;
		this.mappingType = mappingType;
		this.targetConceptId = targetConceptId;
		this.targetVocabularyId = targetVocabularyId;
		this.sourceVocabularyId = sourceVocabularyId;
	}

	/** full constructor */
	public SourceToConceptMap(String sourceCode, String sourceCodeDescription, String mappingType, Integer targetConceptId, Integer targetVocabularyId, Integer sourceVocabularyId) {
		this.sourceCode = sourceCode;
		this.sourceCodeDescription = sourceCodeDescription;
		this.mappingType = mappingType;
		this.targetConceptId = targetConceptId;
		this.targetVocabularyId = targetVocabularyId;
		this.sourceVocabularyId = sourceVocabularyId;
	}



	// Property accessors
	@Id	
	@Column(name="SOURCE_CODE", unique=false, nullable=false, insertable=true, updatable=true, length=40)
	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	@Column(name="SOURCE_CODE_DESCRIPTION", unique=false, nullable=true, insertable=true, updatable=true, length=256)

	public String getSourceCodeDescription() {
		return this.sourceCodeDescription;
	}

	public void setSourceCodeDescription(String sourceCodeDescription) {
		this.sourceCodeDescription = sourceCodeDescription;
	}

	@Column(name="MAPPING_TYPE", unique=false, nullable=false, insertable=true, updatable=true, length=20)

	public String getMappingType() {
		return this.mappingType;
	}

	public void setMappingType(String mappingType) {
		this.mappingType = mappingType;
	}


	@Column(name="TARGET_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=8, scale=0)
	public Integer getTargetConceptId() {
		return this.targetConceptId;
	}

	public void setTargetConceptId(Integer targetConceptId) {
		this.targetConceptId = targetConceptId;
	}


	@Column(name="TARGET_VOCABULARY_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=8, scale=0)

	public Integer getTargetVocabularyId() {
		return this.targetVocabularyId;
	}

	public void setTargetVocabularyId(Integer targetVocabularyId) {
		this.targetVocabularyId = targetVocabularyId;
	}

	@Column(name="SOURCE_VOCABULARY_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=8, scale=0)
	public Integer getSourceVocabularyId() {
		return this.sourceVocabularyId;
	}

	public void setSourceVocabularyId(Integer sourceVocabularyId) {
		this.sourceVocabularyId = sourceVocabularyId;
	}

	/**
	 * Given a source concept id see if there is a common concept code for it
	 * return the id to the common code, otherwise return null
	 * @param sourceCode
	 * @return conceptId
	 */
	@SuppressWarnings({ "unchecked"})
	public static Integer getConceptId(String sourceCode) {
		List<SourceToConceptMap>  results = null;
		Session session = HibernateUtil.getSession().getSessionFactory().getCurrentSession();
		if ( session != null ){
			SourceToConceptMap conceptMap = new SourceToConceptMap();
			conceptMap.setSourceCode(sourceCode);
			results = session.createCriteria(SourceToConceptMap.class)
			.add( Example.create(conceptMap) )
			.list();
		}

		if (results == null || results.size() < 1){
			return 0;
		}
		else {
			return results.get(0).getTargetConceptId();
		}
	}

}
