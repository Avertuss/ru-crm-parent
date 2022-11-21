package ru.sferacar.client.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.sferacar.client.entity.ClientEntity

@Repository
interface ClientRepository : JpaRepository<ClientEntity, Long> {
}