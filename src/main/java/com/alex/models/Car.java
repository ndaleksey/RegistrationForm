package com.alex.models;

import javax.persistence.*;
import java.awt.*;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
@Entity
@Table(name = "car", catalog = "AutoShop")
public class Car {
	private UUID vin;
	private Color color;
	private int year;
	private String name;
	private Engine engine;
	private double weight;
	private double price;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vin")
	public UUID getVin() {
		return vin;
	}

	public void setVin(UUID id) {
		this.vin = id;
	}

	@Basic
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "color")
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Basic
	@Column(name = "year")
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "engine_id")
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Basic
	@Column(name = "wight")
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Basic
	@Column(name = "price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car() {
	}

	public Car(String name, Color color, int year, Engine engine, double weight, double price) {
		this(UUID.randomUUID(), name, color, year, engine, weight, price);
	}

	private Car(UUID vin, String name, Color color, int year, Engine engine, double weight, double price) {
		this.vin = vin;
		this.color = color;
		this.year = year;
		this.name = name;
		this.engine = engine;
		this.weight = weight;
		this.price = price;
	}
}
