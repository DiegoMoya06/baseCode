package com.dev.basecode.dto.example;

import com.dev.basecode.dto.base.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// When creating an entity, is not mandatory to receive ID, created, updated... 

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateExampleDto implements Dto {

	private String title;
}
