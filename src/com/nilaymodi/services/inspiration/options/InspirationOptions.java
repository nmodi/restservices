package com.nilaymodi.services.inspiration.options;

import java.util.List;

public class InspirationOptions {

	/**
	 * The fields in this class must match up exactly with the names of the
	 * arrays in Options.json
	 */

	private List<String>	subjects;
	private List<String>	lensTypes;
	private List<String>	times;
	private List<String>	lights;
	private List<String>	modifiers;
	private List<String>	colors;
	private List<String>	pluralSubjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getLensTypes() {
		return lensTypes;
	}

	public void setLensTypes(List<String> lensTypes) {
		this.lensTypes = lensTypes;
	}

	public List<String> getTimes() {
		return times;
	}

	public void setTimes(List<String> times) {
		this.times = times;
	}

	public List<String> getLights() {
		return lights;
	}

	public void setLights(List<String> lights) {
		this.lights = lights;
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public List<String> getPluralSubject() {
		return pluralSubjects;
	}

	public void setPluralSubjects(List<String> pluralSubjects) {
		this.pluralSubjects = pluralSubjects;
	}

}
