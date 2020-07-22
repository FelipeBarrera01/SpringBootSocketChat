package com.springboot.backend.sockets.app.models.services;

import java.util.List;

import com.springboot.backend.sockets.app.models.documents.Mensaje;

public interface ChatService {
	public List<Mensaje> obtenerUltimos10Mensajes();
	public Mensaje guardar (Mensaje mensaje);
}
