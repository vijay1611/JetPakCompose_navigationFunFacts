package com.vijay.funfactsjpc.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.vijay.funfactsjpc.data.UserDataUIEvents
import com.vijay.funfactsjpc.data.UserInputScreenState

class UserInputViewModel:ViewModel() {

    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event : UserDataUIEvents){
        when(event){
            is UserDataUIEvents.UserNameEntered->{
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }
            is UserDataUIEvents.AnimalSelected->{
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }

        }
    }

    fun isValidState():Boolean{
        return !uiState.value.nameEntered.isNullOrEmpty() && !uiState.value.animalSelected.isNullOrEmpty()
    }
}