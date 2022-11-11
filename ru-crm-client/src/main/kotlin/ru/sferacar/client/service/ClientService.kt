package ru.sferacar.client.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import ru.sferacar.client.dto.ClientDto

interface ClientService {
    open fun create(clientDto: ClientDto) : ClientDto
    open fun update(clientDto: ClientDto) : ClientDto
    open fun getById(id: Long) : ClientDto
    open fun delete(id: Long)
    open fun getAll( pageable: Pageable): Page<ClientDto>
}