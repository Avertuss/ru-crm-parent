package ru.sferacar.client.controller


import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import ru.sferacar.client.dto.ClientDto
import  org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import ru.sferacar.client.service.ClientService


@Tag(
    name = " API",
    description = ""
)
@RestController
@RequestMapping
class ClientController(var service: ClientService) {

    @Operation(summary = "Создать", operationId = "client#Create")
    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun create(@PathVariable id: Long, clientDto: ClientDto): ClientDto {
        return service.create(clientDto);
    }

    @Operation(summary = "Найти по ИД", operationId = "client#getById")
    @GetMapping(path = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun getById(@PathVariable id: Long): ClientDto {
        return service.getById(id);
    }

    @Operation(summary = "Обновить по ИД", operationId = "client#updateById")
    @PutMapping(path = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun updateById(@PathVariable id: Long, clientDto: ClientDto): ClientDto {
        clientDto.apply { this.id = id }
        return clientDto;
    }


    @Operation(summary = "Найти по ИД", operationId = "client#getById")
    @GetMapping( produces = [MediaType.APPLICATION_JSON_VALUE])
    open fun getAll(@Parameter(hidden = true)  pageable: Pageable): Page<ClientDto> {
        return Page.empty();
    }

}