package com.dev.basecode.repositories;

import com.dev.basecode.entities.ExampleClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExamplesRepository  extends JpaRepository<ExampleClass, UUID> {

}
