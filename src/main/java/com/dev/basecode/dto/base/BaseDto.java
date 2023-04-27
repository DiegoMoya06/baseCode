package com.dev.basecode.dto.base;

import java.time.Instant;

import org.modelmapper.ModelMapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseDto implements Dto {
	
	protected static final ModelMapper MAPPER = new ModelMapper();
	
	private Instant created;
	private Instant updated;
	private String createdBy;
	private String updatedBy;
}
