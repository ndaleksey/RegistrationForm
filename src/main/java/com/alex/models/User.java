package com.alex.models;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 12.04.18.
 */
@Entity
@Table(name = "User", schema = "AutoShop")
public class User {
	private UUID id;
	private Integer age;
	private String country;
	private String name;

	@Id
	@Column(name = "id")
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	@Basic
	@Column(name = "age")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Basic
	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Basic
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		id = UUID.randomUUID();
	}

	public User(String name, Integer age, String country) {
		this();
		this.age = age;
		this.country = country;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User that = (User) o;
		return id == that.id &&
				Objects.equals(age, that.age) &&
				Objects.equals(country, that.country) &&
				Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {

		int result = Objects.hash(age, country, name);
		result = 31 * result + id.hashCode();
		return result;
	}
}
