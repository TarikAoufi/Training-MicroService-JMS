package org.sid.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = { Student.class })
public interface StudentProjection1 {
	
	public Long getId();
	public String getLastName();
	public Training getTraining();
}
