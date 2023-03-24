package com.railway.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "time_table")
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tmtb_id;

	@NotNull
	private String departure_time;

	@NotNull
	private String arrival_time;

	@NotNull
	@Size(min = 2, message = "running status must be of minimum 2 characters!!")
	private String running_status;

	@OneToMany
	private List<Trains> trains = new ArrayList<>();

	public Object getDeparture_time() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDeparture_time(Object departure_time2) {
		// TODO Auto-generated method stub
		
	}

	public Object getArrival_time() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getRunning_status() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setArrival_time(Object arrival_time2) {
		// TODO Auto-generated method stub
		
	}

	public void setRunning_status(Object running_status2) {
		// TODO Auto-generated method stub
		
	}

	public int getTmtb_id() {
		return tmtb_id;
	}

	public void setTmtb_id(int tmtb_id) {
		this.tmtb_id = tmtb_id;
	}

	public List<Trains> getTrains() {
		return trains;
	}

	public void setTrains(List<Trains> trains) {
		this.trains = trains;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setRunning_status(String running_status) {
		this.running_status = running_status;
	}
}
