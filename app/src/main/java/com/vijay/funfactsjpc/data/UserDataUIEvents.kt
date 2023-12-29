package com.vijay.funfactsjpc.data

import android.service.autofill.UserData

sealed class UserDataUIEvents{
    data class UserNameEntered(val name:String) : UserDataUIEvents()
    data class AnimalSelected(val animalValue:String) : UserDataUIEvents()
}
