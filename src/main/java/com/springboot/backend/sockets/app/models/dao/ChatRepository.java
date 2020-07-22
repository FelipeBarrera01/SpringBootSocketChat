package com.springboot.backend.sockets.app.models.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.backend.sockets.app.models.documents.Mensaje;

public interface ChatRepository extends MongoRepository<Mensaje, String>{
	public List<Mensaje> findFirst10ByFechasDesc();
}
