package org.sid.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P2", types = { Student.class })
public interface StudentProjection2 {
	@Value("#{target.lastName} #{target.firstName}")
	public String getFullName();
}
