package com.plats.business;
import java.util.Collection;

public class Exercise {

	private String description;
	private Collection<Focus> focuses;
	private Collection<File> files;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Focus> getFocuses() {
		return focuses;
	}

	public void setFocuses(Collection<Focus> focuses) {
		this.focuses = focuses;
	}

	public Collection<File> getFiles() {
		return files;
	}

	public void setFiles(Collection<File> files) {
		this.files = files;
	}

	
}