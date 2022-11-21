package ru.sferacar.client.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import ru.sferacar.client.convert.toClientDto
import ru.sferacar.client.convert.toClientEntity
import ru.sferacar.client.dto.ClientDto
import ru.sferacar.client.entity.ClientEntity
import ru.sferacar.client.repository.ClientRepository

@Service
class ClientServiceImpl( var  repositoryClient: ClientRepository) : ClientService {

    override fun create(clientDto: ClientDto ) : ClientDto
    {
        var clientEntity : ClientEntity =  repositoryClient.save(clientDto.toClientEntity());
        return clientEntity.toClientDto();
    }

    override fun update(id: Long, clientDto: ClientDto): ClientDto {
        var oldClientEntity : ClientEntity =  repositoryClient.getReferenceById(id);
        var newClientEntity : ClientEntity = clientDto.toClientEntity();
        oldClientEntity.apply {
            name = newClientEntity.name;
            firstName = newClientEntity.firstName;
            lastName = newClientEntity.lastName;
        }
        return repositoryClient.save(oldClientEntity).toClientDto();
    }

    override fun getById(id: Long): ClientDto {
        return  repositoryClient.getReferenceById(id).toClientDto();
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getAll(pageable: Pageable): Page<ClientDto> {
        TODO("Not yet implemented")
    }
}