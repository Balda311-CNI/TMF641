package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ExactSearchJoinBody implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String leftRelation;
	private String rightRelation;
	private String filterExpression;
	private Boolean useLeftJoin;

	public ExactSearchJoinBody() {
	}

	public String getLeftRelation() {
		return this.leftRelation;
	}

	public void setLeftRelation( String leftRelation) {
		this.leftRelation = leftRelation;
	}

	public String getRightRelation() {
		return this.rightRelation;
	}

	public void setRightRelation( String rightRelation) {
		this.rightRelation = rightRelation;
	}

	public String getFilterExpression() {
		return this.filterExpression;
	}

	public void setFilterExpression( String filterExpression) {
		this.filterExpression = filterExpression;
	}

	public Boolean getUseLeftJoin() {
		return this.useLeftJoin;
	}

	public void setUseLeftJoin( Boolean useLeftJoin) {
		this.useLeftJoin = useLeftJoin;
	}

	public ExactSearchJoinBody( String leftRelation,
                                String rightRelation, String filterExpression,
                                Boolean useLeftJoin) {
		this.leftRelation = leftRelation;
		this.rightRelation = rightRelation;
		this.filterExpression = filterExpression;
		this.useLeftJoin = useLeftJoin;
	}

}