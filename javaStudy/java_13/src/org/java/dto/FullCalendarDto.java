package org.java.dto;

import java.time.LocalDateTime;

public class FullCalendarDto {
	private LocalDateTime startDay;
	private LocalDateTime endDay;
	
	public FullCalendarDto(LocalDateTime startDay, LocalDateTime endDay) {
		super();
		this.startDay = startDay;
		this.endDay = endDay;
	}

	public FullCalendarDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getStartDay() {
		return startDay;
	}

	public void setStartDay(LocalDateTime startDay) {
		this.startDay = startDay;
	}

	public LocalDateTime getEndDay() {
		return endDay;
	}

	public void setEndDay(LocalDateTime endDay) {
		this.endDay = endDay;
	}

	
}
