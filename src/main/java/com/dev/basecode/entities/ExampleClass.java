package com.dev.basecode.entities;

import java.util.UUID;

import com.dev.basecode.entities.base.BaseEntity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "example")
public class ExampleClass extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(nullable = false, updatable = false)
	private UUID id;

	@Column
	private String title;
}
