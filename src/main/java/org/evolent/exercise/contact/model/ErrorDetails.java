package org.evolent.exercise.contact.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorDetails {
	 private Date timestamp;
	 private String message;
	 private String details;
}
