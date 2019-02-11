package com.companies.cerner.alergies;

public class Alergy {
	private Severity severity;
	private String name;
	private String description;
	
	public Alergy(String name, String description, Severity severity) {
		this.name = name;
		this.description = description;
		this.severity = severity;
	}
	
	@Override
	public boolean equals(Object al) {
		return this.equals(al);
	}
	
	
	@Override 
	public int hashCode() {
		return this.name.hashCode()*this.description.hashCode();
	}
	/**
	 * @return the severity
	 */
	public Severity getSeverity() {
		return severity;
	}
	/**
	 * @param severity the severity to set
	 */
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
