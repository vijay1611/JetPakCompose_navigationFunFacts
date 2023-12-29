package com.vijay.funfactsjpc.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vijay.funfactsjpc.R
import com.vijay.funfactsjpc.data.UserDataUIEvents
import com.vijay.funfactsjpc.ui.AnimalCard
import com.vijay.funfactsjpc.ui.ButtonComponent
import com.vijay.funfactsjpc.ui.TextComponent
import com.vijay.funfactsjpc.ui.TextFieldComponent
import com.vijay.funfactsjpc.ui.TopBar
import com.vijay.funfactsjpc.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel,
                    showWelcomeScreen:(valuesPair:Pair<String,String>) -> Unit
                    ){

    Surface(
        modifier = Modifier.fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi there \uD83D\uDE0A")

            TextComponent(textValue = "Vijay Fun Facts", textSize = 24.sp)

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = "This app is created for practice the jetpack compose modules and functionalities",
                textSize = 18.sp)
         //   Spacer(modifier = Modifier.size(60.dp))
            TextComponent(textValue = "Name", textSize = 18.sp)
            TextFieldComponent(onTextChanged ={
                userInputViewModel.onEvent(
                    UserDataUIEvents.UserNameEntered(it)
                )
            } )
           // Spacer(modifier = Modifier.size(20.dp))
            TextComponent(textValue = "What do yo like", textSize = 18.sp)
            Row(modifier = Modifier.fillMaxWidth()) {
                AnimalCard(
                    image = R.drawable.ic_launcher_background,
                    animalSelected = {
                        userInputViewModel.onEvent(
                            UserDataUIEvents.AnimalSelected(it)
                        )
                    }, selected = userInputViewModel.uiState.value.animalSelected=="Dog"
                    )
                AnimalCard(image = R.drawable.ic_launcher_foreground,
                    animalSelected = {
                        userInputViewModel.onEvent(
                            UserDataUIEvents.AnimalSelected(it)
                        )
                    }, selected = userInputViewModel.uiState.value.animalSelected=="Cat"
                    )
            }
            Spacer(modifier = Modifier.weight(1f))

           if(userInputViewModel.isValidState()){
               ButtonComponent(
                   goToDetailScreen = {
                       showWelcomeScreen(
                           Pair(
                               userInputViewModel.uiState.value.nameEntered,
                               userInputViewModel.uiState.value.animalSelected
                           )
                       )
                       }

               )
           }


        }

    }

}
