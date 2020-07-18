package com.actions.emislabbackend.specifications;

import com.actions.emislabbackend.model.OperationTeeth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationTeethRepo extends JpaRepository<OperationTeeth,Long> {
}
