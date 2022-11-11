package ru.sferacar.client.dto

data class ClientDto(
    var id: Long?,
    var firsName: String = "", var lastName:String ="",
    var middleName: String="", var comment: String ="",
)
