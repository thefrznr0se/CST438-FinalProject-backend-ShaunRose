package com.cst438.domain;
import org.springframework.data.repository.CrudRepository;


public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {
    // Additional query methods, if needed
}