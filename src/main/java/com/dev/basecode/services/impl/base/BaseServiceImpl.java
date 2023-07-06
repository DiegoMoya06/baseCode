package com.dev.basecode.services.impl.base;

import com.dev.basecode.utils.LoggerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("rawtypes")
@Transactional
public abstract class BaseServiceImpl<R extends JpaRepository> extends LoggerUtil {

    protected final R repository;

    @PersistenceContext
    protected EntityManager entityManager;

    protected BaseServiceImpl(R repository) {
        this.repository = repository;
    }
}
