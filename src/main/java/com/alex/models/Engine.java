package com.alex.models;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */

@Entity
@Table(name = "engine", catalog = "AutoShop")
public class Engine {
	private Long id;
	private UUID vin;
	private double power;
	private double volume;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "vin")
	public UUID getVin() {
		return vin;
	}

	public void setVin(UUID vin) {
		this.vin = vin;
	}

	@Basic
	@Column(name = "power")
	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Basic
	@Column(name = "volume")
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Engine() {
	}

	public Engine(double power, double volume) {
		this(UUID.randomUUID(), power, volume);
	}

	private Engine(UUID vin, double power, double volume) {
		this.vin = vin;
		this.power = power;
		this.volume = volume;
	}
}
