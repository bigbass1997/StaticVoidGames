package com.StaticVoidGames.spring.util;

/**
 * Encapsulation of a single form field to be presented to the user.
 */
public class FormField {

	/**
	 * The label of this FormField. Should be short but understandable. Displayed before the form field.
	 */
	private String label;
	
	/**
	 * A full description of this FormField. Displayed above the form field.
	 */
	private String description;
	
	/**
	 * The variable name in a command class (such as GameForm) that this FormField maps to.
	 * This mapping is handled by Spring's form backing object feature.
	 */
	private String command;
	
	/**
	 * This FormField's type: input, textarea, file, etc.
	 */
	private String type;
	
	/**
	 * Constructs a new FormField.
	 * 
	 * @param label The label to show the user before the actual form field.
	 * @param description A longer description displayed under the actual form field.
	 * @param command
	 * @param type
	 */
	public FormField(String label, String description, String command, String type) {
		this.label = label;
		this.description = description;
		this.command = command;
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public String getDescription() {
		return description;
	}

	public String getCommand() {
		return command;
	}
	
	public String getType(){
		return type;
	}
}
