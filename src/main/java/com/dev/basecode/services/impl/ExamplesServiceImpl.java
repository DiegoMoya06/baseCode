package com.dev.basecode.services.impl;

import com.dev.basecode.entities.ExampleClass;
import com.dev.basecode.exceptions.InvalidDataException;
import com.dev.basecode.repositories.ExamplesRepository;
import com.dev.basecode.services.ExamplesService;
import com.dev.basecode.services.impl.base.BaseServiceImpl;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExamplesServiceImpl extends BaseServiceImpl<ExamplesRepository> implements ExamplesService {

    protected ExamplesServiceImpl(ExamplesRepository repository) {
        super(repository);
    }

    @Override
    public ExampleClass getExampleById(@NonNull UUID exampleId) {
        logger.info("Method getExampleById was called with id {}", exampleId);

        return repository.findById(exampleId).orElseThrow(
                () -> new InvalidDataException("No example found with id {}", exampleId));
    }
}
