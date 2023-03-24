package com.railway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trains")
public class Trains {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int train_id;

	@NotNull
	@Min(value = 1000)
	@Column(unique = true)
	private int train_number;

	@NotEmpty
	@Column(unique = true)
	@Size(min = 2, message = "name must be of minimum 2 characters!!")
	private String train_name;

	@NotEmpty
	@Size(min = 2, message = "train type must be of minimum 2 characters!!")
	private String train_type;

	@NotEmpty
	@Size(min = 2, message = "train status must be of minimum 2 characters!!")
	private String train_status;

//	@ManyToMany
//	private List<Stations> stations = new ArrayList<>();

	@ManyToOne
	private Stations station;

	@ManyToOne
	private TimeTable time;

	public int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public int getTrain_number() {
		return train_number;
	}

	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getTrain_type() {
		return train_type;
	}

	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}

	public String getTrain_status() {
		return train_status;
	}

	public void setTrain_status(String train_status) {
		this.train_status = train_status;
	}

	public Stations getStation() {
		return station;
	}

	public void setStation(Stations station) {
		this.station = station;
	}

	public TimeTable getTime() {
		return time;
	}

	public void setTime(TimeTable time) {
		this.time = time;
	}
	
	
}
