package com.example.courtierservice.Repositories;

import com.example.courtierservice.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository  extends JpaRepository<Location,Integer> {
}
