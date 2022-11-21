package ru.sferacar.client.convert

import ru.sferacar.client.dto.ClientDto
import ru.sferacar.client.entity.ClientEntity

class ClientConvert {
}

fun ClientDto.toClientEntity() :ClientEntity
{
    return ClientEntity(id=this.id
    ,name = this.name
    ,firstName = this.firstName
    ,lastName = this.lastName
    );
}
fun ClientEntity.toClientDto() :ClientDto
{
    return  ClientDto(id = this.id
    ,firstName = this.firstName
    ,lastName = this.lastName
    );
}