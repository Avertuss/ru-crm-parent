package ru.sferacar.commons.web.security.model

import org.springframework.security.core.GrantedAuthority
import java.util.*

data class Role(
    private var id: UUID, private val name: String, private val description: String
) : GrantedAuthority {
    override fun getAuthority(): String {
        return this.name;
    }

}
