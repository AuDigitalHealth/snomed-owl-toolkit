package org.snomed.otf.owltoolkit.domain;

import java.util.List;
import java.util.Map;

public class AxiomRepresentation {

	private boolean primitive;
	private Long leftHandSideNamedConcept;
    private Map<Integer, List<Relationship>> leftHandSideRelationships;
    private Map<Integer, List<DatatypeProperty>> leftHandSideDatatypes;
	private Long rightHandSideNamedConcept;
	private Map<Integer, List<Relationship>> rightHandSideRelationships;
    private Map<Integer, List<DatatypeProperty>> rightHandSideDatatypes;

	public AxiomRepresentation() {
	}

	public boolean isPrimitive() {
		return primitive;
	}

	public void setPrimitive(boolean primitive) {
		this.primitive = primitive;
	}

	public Long getLeftHandSideNamedConcept() {
		return leftHandSideNamedConcept;
	}

	public void setLeftHandSideNamedConcept(Long leftHandSideNamedConcept) {
		this.leftHandSideNamedConcept = leftHandSideNamedConcept;
	}

	public Map<Integer, List<Relationship>> getLeftHandSideRelationships() {
		return leftHandSideRelationships;
	}

	public void setLeftHandSideRelationships(Map<Integer, List<Relationship>> leftHandSideRelationships) {
		this.leftHandSideRelationships = leftHandSideRelationships;
	}

	public Long getRightHandSideNamedConcept() {
		return rightHandSideNamedConcept;
	}

	public void setRightHandSideNamedConcept(Long rightHandSideNamedConcept) {
		this.rightHandSideNamedConcept = rightHandSideNamedConcept;
	}

	public Map<Integer, List<Relationship>> getRightHandSideRelationships() {
		return rightHandSideRelationships;
	}

	public void setRightHandSideRelationships(Map<Integer, List<Relationship>> rightHandSideRelationships) {
		this.rightHandSideRelationships = rightHandSideRelationships;
	}

    public Map<Integer, List<DatatypeProperty>> getRightHandSideDatatypes() {
        return rightHandSideDatatypes;
    }

    public void setRightHandSideDatatypes(Map<Integer, List<DatatypeProperty>> datatypeMap) {
        this.rightHandSideDatatypes = datatypeMap;
    }

    public Map<Integer, List<DatatypeProperty>> getLeftHandSideDatatypes() {
        return leftHandSideDatatypes;
    }

    public void setLeftHandSideDatatypes(Map<Integer, List<DatatypeProperty>> leftHandSideDatatypes) {
        this.leftHandSideDatatypes = leftHandSideDatatypes;
    }

}
