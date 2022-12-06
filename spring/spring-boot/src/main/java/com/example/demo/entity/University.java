package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "university")
public class University {
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	@NotBlank(message = "Name is required")
	private String name;
	
	@Column(name = "code")
	@NotBlank(message = "Code is required")
	private String code;
	
	@Column(name = "establishment_year")
	@Min(value = 0, message = "Establishment year can not be less than zero")
	private Integer establishmentYear;
	
	@NotBlank(message = "Address is required")
	@Column(name = "address")
	private String address;
	
	@Column(name = "rating")
	private Integer rating;
	
	@Email
	@Email(message = "Neteisingas emailo formatas")
	private String email;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "university")
	private List<Student> students;
	

}
