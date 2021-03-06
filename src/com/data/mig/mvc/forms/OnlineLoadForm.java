package com.data.mig.mvc.forms;

public class OnlineLoadForm {
	
	private String sourceDatabase;
	private String targetDatabase;
	private String sourceSchema;
	private String sourceTableName;
	private Long noOfRecordsToBeExtracted;
	private String childTableExtractRequired;
	private String targetCollectionOrColumnFamilyName;
	private String message;
	private String pageName;
	private String pageAction;
	private String filePath;
	
	
	public String getPageAction() {
		return pageAction;
	}

	public void setPageAction(String pageAction) {
		this.pageAction = pageAction;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTargetCollectionOrColumnFamilyName() {
		return targetCollectionOrColumnFamilyName;
	}

	public void setTargetCollectionOrColumnFamilyName(String targetCollectionOrColumnFamilyName) {
		this.targetCollectionOrColumnFamilyName = targetCollectionOrColumnFamilyName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getChildTableExtractRequired() {
		return childTableExtractRequired;
	}

	public void setChildTableExtractRequired(String childTableExtractRequired) {
		this.childTableExtractRequired = childTableExtractRequired;
	}

	public String getSourceDatabase() {
		return sourceDatabase;
	}

	public void setSourceDatabase(String sourceDatabase) {
		this.sourceDatabase = sourceDatabase;
	}
	public String getTargetDatabase() {
		return targetDatabase;
	}
	public void setTargetDatabase(String targetDatabase) {
		this.targetDatabase = targetDatabase;
	}

	public Long getNoOfRecordsToBeExtracted() {
		return noOfRecordsToBeExtracted;
	}
	public void setNoOfRecordsToBeExtracted(Long noOfRecordsToBeExtracted) {
		this.noOfRecordsToBeExtracted = noOfRecordsToBeExtracted;
	}
	public String getSourceSchema() {
		return sourceSchema;
	}
	public void setSourceSchema(String sourceSchema) {
		this.sourceSchema = sourceSchema;
	}
	public String getSourceTableName() {
		return sourceTableName;
	}
	public void setSourceTableName(String sourceTableName) {
		this.sourceTableName = sourceTableName;
	}
	
	@Override
	public String toString() {
		return "OnlineLoadForm [sourceDatabase=" + sourceDatabase + ", targetDatabase=" + targetDatabase
				+ ", sourceSchema=" + sourceSchema + ", sourceTableName=" + sourceTableName
				+ ", noOfRecordsToBeExtracted=" + noOfRecordsToBeExtracted + ", childTableExtractRequired="
				+ childTableExtractRequired + ", targetCollectionOrColumnFamilyName="
				+ targetCollectionOrColumnFamilyName + ", message=" + message + ", pageName=" + pageName
				+ ", pageAction=" + pageAction + ", filePath=" + filePath + "]";
	}	

}
