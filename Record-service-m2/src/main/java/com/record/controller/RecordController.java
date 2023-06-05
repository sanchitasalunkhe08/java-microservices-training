package com.record.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.record.entity.Record;
import com.record.service.IRecordService;

@RestController
@RequestMapping("/record")
public class RecordController {

	@Autowired
	IRecordService iRecordService;
	
	@GetMapping("/{eId}")
	public Optional<Record> getRecordofEmployee(@PathVariable("eId") Long eId){
		Optional<Record> record = iRecordService.getRecordofEmployee(eId);
		return record;
	}
	
}
