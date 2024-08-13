package com.simonsvoss.jetpackcompose.navigation

import kotlinx.serialization.Serializable

sealed class Destination {
    @Serializable
    data object Main : Destination()
    @Serializable
    data class Setting(val username: String, val emailAddress: String) : Destination()
}
