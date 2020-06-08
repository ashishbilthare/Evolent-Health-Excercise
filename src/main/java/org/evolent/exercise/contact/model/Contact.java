package org.evolent.exercise.contact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contact {

	@Id
    @GeneratedValue
    private Long id;
	
	@NotEmpty(message = "First name is required")
    private String firstName;
	
	@NotEmpty(message = "Last name is required")
    private String lastName;
	
	@NotEmpty(message = "Email is required")
    @Email
    private String email;
	
	@NotEmpty(message = "Phone number is required")
    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
             message="Mobile number is invalid")
    private String phoneNo;
	
	
    private String status;
	
}
