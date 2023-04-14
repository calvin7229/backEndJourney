package com.calvin.backend.repository;

import com.calvin.backend.model.CredentialDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrendentialsRepository extends JpaRepository<CredentialDO, Long> {
}
