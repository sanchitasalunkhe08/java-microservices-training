package com.record.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.record.entity.Record;

@Repository
public interface IRecordRepository extends JpaRepository<Record, Long> {

}
