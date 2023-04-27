package com.dev.basecode.dto.example;

import java.util.UUID;

import com.dev.basecode.dto.base.BaseDto;
import com.dev.basecode.entities.ExampleClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class ExampleDto extends BaseDto {
	
	private UUID id;
	private String title;
	
	public static ExampleDto fromEntity(ExampleClass entity) {
		return MAPPER.map(entity, ExampleDto.class);
	}
	
	public ExampleClass toEntity() {
		return MAPPER.map(this, ExampleClass.class);
	}
}
