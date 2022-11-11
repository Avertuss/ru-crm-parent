package ru.sferacar.commons.web.security.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "sphere.auth")
data class AuthConfigProperties( val publicKeyPath: String ="",
                                 val jwtHeader: String ="",
                                 val jwtTokenMatcher: String ="",
                                 val jwtPrincipalNameKey: String ="")
