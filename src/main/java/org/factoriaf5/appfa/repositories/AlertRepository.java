package org.factoriaf5.appfa.repositories;

import org.factoriaf5.appfa.models.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<Alert,Long> {}
