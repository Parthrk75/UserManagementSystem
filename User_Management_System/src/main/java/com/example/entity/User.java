package com.example.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is mandatory")
    @Size(min = 2, max = 30)
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @Size(min = 2, max = 30)
    private String lastName;

    @NotBlank(message = "Phone number is mandatory")
    @Size(min = 10, max = 15)
    private String phoneNumber;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is mandatory")
    @Size(max = 100)
    private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, @NotBlank(message = "First name is mandatory") @Size(min = 2, max = 30) String firstName,
			@NotBlank(message = "Last name is mandatory") @Size(min = 2, max = 30) String lastName,
			@NotBlank(message = "Phone number is mandatory") @Size(min = 10, max = 15) String phoneNumber,
			@NotBlank(message = "Email is mandatory") @Email(message = "Email should be valid") String email,
			@NotBlank(message = "Address is mandatory") @Size(max = 100) String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public User(@NotBlank(message = "First name is mandatory") @Size(min = 2, max = 30) String firstName,
			@NotBlank(message = "Last name is mandatory") @Size(min = 2, max = 30) String lastName,
			@NotBlank(message = "Phone number is mandatory") @Size(min = 10, max = 15) String phoneNumber,
			@NotBlank(message = "Email is mandatory") @Email(message = "Email should be valid") String email,
			@NotBlank(message = "Address is mandatory") @Size(max = 100) String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    // Getters and Setters
    // Constructor
    
}

