package ru.sferacar.client.entity

import java.io.Serializable
import javax.persistence.*

@Entity
open class ClientEntity  (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    open var id: Long?,

    @Column(name = "name")
    open var name: String,

    @Column(name = "first_name")
    open var firstName: String,

    @Column(name = "last_name")
    open var lastName: String,

    @Column(name = "email")
    open var email: String? = null,

    @Column(name = "phone")
    open var phone: String? = null,

    @Column(name = "comment")
    open var comment: String? = null,
) : Serializable