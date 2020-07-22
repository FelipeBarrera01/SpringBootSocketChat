package com.springboot.backend.sockets.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.sockets.app.models.dao.ChatRepository;
import com.springboot.backend.sockets.app.models.documents.Mensaje;

@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	private ChatRepository chatRepository;
	
	@Override
	public List<Mensaje> obtenerUltimos10Mensajes() {
	return chatRepository.findFirst10ByFechasDesc();
	}


	@Override
	public Mensaje guardar(Mensaje mensaje) {
		
		return chatRepository.save(mensaje);
	}

}
