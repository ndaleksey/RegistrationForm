package com.alex.models;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
@Entity
@Table(name = "User", catalog = "AutoShop")
public class User {

	@Id
	private UUID id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "country")
	private String country;

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public User() {
		this.id = UUID.randomUUID();
	}

	public User(String name, int age, String country) {
		this();
		this.name = name;
		this.age = age;
		this.country = country;
	}
}
