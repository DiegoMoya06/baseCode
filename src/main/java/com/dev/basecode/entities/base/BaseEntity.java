package com.dev.basecode.entities.base;

import static com.dev.basecode.BasecodeApplication.EXAMPLE_USER;

import java.time.Instant;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	/**
	 * Point in time when this entry has been created.
	 */
	@CreatedDate
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@Column(nullable = false, updatable = false)
	protected Instant created;
	
	/**
	 * Point in time when this entry has been last updated.
	 */
	@UpdateTimestamp
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@Column(nullable = false)
	protected Instant updated;
	
	/**
	 * ID of the person/process which created the entry.
	 */
	@CreatedBy
	@Column(nullable = false, updatable = false)
	private String createdBy;
	
	/**
	 * ID of the person/process which last modified the entry.
	 */
	@LastModifiedBy
	@Column(nullable = false)
	private String updatedBy;
	
	@PrePersist
	protected void beforeCreate() {
		this.created = Instant.now();
		this.updated = Instant.now();
		this.createdBy = EXAMPLE_USER;
		this.updatedBy = EXAMPLE_USER;
	}
	
	@PreUpdate
	protected void beforeUpdate() {
		this.updated = Instant.now();
		this.updatedBy = EXAMPLE_USER;
	}
}
