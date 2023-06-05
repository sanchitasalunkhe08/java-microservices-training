package com.record.service;

import java.util.Optional;

import com.record.entity.Record;
public interface IRecordService {

//	public List<Record> getRecordofEmployee (Long eId);
	Optional<Record> getRecordofEmployee(Long eId);
	
}
