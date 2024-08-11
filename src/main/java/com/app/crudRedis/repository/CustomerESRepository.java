package com.app.crudRedis.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.app.crudRedis.model.ESCustomer;

public interface CustomerESRepository extends ElasticsearchRepository<ESCustomer, Long> {
}
