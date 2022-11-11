package ru.sferacar.commons.web.security.model

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

data class User(
    private val username: String,
    private val password: String,
    private val roles: MutableCollection<Role>,
    private val enabled: Boolean
) :
    UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return this.roles;
    }

    override fun getPassword(): String {
        return this.password;
    }

    override fun getUsername(): String {
        return this.username;
    }

    override fun isAccountNonExpired(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isAccountNonLocked(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isCredentialsNonExpired(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEnabled(): Boolean {
        return this.enabled;
    }
}
