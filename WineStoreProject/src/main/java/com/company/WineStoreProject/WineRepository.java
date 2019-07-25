package com.company.WineStoreProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Integer> {
}
