package ru.sferacar.commons.web.security.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@ConfigurationProperties(prefix = "sphere.web-security")
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
open class WebSecurityConfig : WebSecurityConfigurerAdapter() {

     private lateinit var permitAll : Array<String> ;



    @Bean
    open fun authConfig(): AuthConfigProperties {
        return AuthConfigProperties()
    }



    override fun configure(auth: AuthenticationManagerBuilder) {

    }

    override fun configure(http: HttpSecurity) {

    }
    open fun getPermitAll(): Array<String> {
        return permitAll
    }

    open fun setPermitAll(vararg permitAll: String) {
        this.permitAll = permitAll as Array<String>
    }
}