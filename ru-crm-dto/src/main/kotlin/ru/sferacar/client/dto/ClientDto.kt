package ru.sferacar.client.dto

data class ClientDto(
    var id: Long?,
    var name: String ="",
    var firstName: String = "",
    var lastName:String ="",
    var middleName: String="",
    var email : String ="",
    var phone : String ="",
    var comment: String ="",
)
