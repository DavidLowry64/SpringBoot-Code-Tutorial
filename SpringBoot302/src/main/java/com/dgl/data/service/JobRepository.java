package com.dgl.data.service;

import org.springframework.data.repository.CrudRepository;
import com.dgl.data.model.Job;

public interface JobRepository extends CrudRepository <Job, Long> {

	
}
