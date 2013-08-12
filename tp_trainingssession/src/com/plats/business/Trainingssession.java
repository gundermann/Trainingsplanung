package com.plats.business;
import java.util.*;

public class Trainingssession {

	private String date;
	private int duration;
	private int minAge;
	private int maxAge;
	private int minLevel;
	private int maxLevel;
	private Collection<Focus> focuses;
	private Collection<Exercise> exercises; //TODO Duration (not in Exercise)

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return this.maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public int getMinLevel() {
		return this.minLevel;
	}

	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}

	public int getMaxLevel() {
		return this.maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public Collection<Focus> getFocuses() {
		return this.focuses;
	}

	public void setFocuses(Collection<Focus> focuses) {
		this.focuses = focuses;
	}

	public Collection<Exercise> getExercises() {
		return this.exercises;
	}

	public void setExercises(Collection<Exercise> exercises) {
		this.exercises = exercises;
	}

}