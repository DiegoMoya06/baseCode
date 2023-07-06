package com.dev.basecode.services;

import com.dev.basecode.entities.ExampleClass;
import com.dev.basecode.services.base.BaseService;
import lombok.NonNull;

import java.util.UUID;

public interface ExamplesService extends BaseService {
    ExampleClass getExampleById(@NonNull UUID exampleId);
}
