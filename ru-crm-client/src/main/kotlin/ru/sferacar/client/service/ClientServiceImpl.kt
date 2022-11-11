package ru.sferacar.client.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import ru.sferacar.client.dto.ClientDto

@Service
class ClientServiceImpl : ClientService {

    override fun create(clientDto: ClientDto ) : ClientDto
    {
        return clientDto
    }

    override fun update(clientDto: ClientDto): ClientDto {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): ClientDto {
        return  ClientDto(id = id);
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getAll(pageable: Pageable): Page<ClientDto> {
        TODO("Not yet implemented")
    }
}