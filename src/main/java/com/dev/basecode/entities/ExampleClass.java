package com.dev.basecode.entities;

import java.util.UUID;

import com.dev.basecode.entities.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@Table(name = "example")
public class ExampleClass extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(nullable = false, updatable = false)
	private UUID id;

	@Column
	private String title;
}
