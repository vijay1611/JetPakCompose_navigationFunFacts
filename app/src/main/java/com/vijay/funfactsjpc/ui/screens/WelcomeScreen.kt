package com.vijay.funfactsjpc.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vijay.funfactsjpc.FactViewModel
import com.vijay.funfactsjpc.ui.FactComposable
import com.vijay.funfactsjpc.ui.TextComponent
import com.vijay.funfactsjpc.ui.TextWithShadow
import com.vijay.funfactsjpc.ui.TopBar

@Composable
fun WelcomeScreen(username: String?, animalSelected: String?) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ){
            TopBar("Welcome $username \uD83D\uDE0D")
            TextComponent(textValue = "Thank you for sharing your data", textSize = 24.sp)

            Spacer(modifier = Modifier.size(60.dp))

            val finalText = if(animalSelected=="Cat") "You are a Cat Lover \uD83D\uDC36" else "You are a Dog Lover"

            TextWithShadow(value = finalText)

        val factViewModel:FactViewModel = viewModel()
            FactComposable(value =factViewModel.generateRandomFact(animalSelected!!) )

        }

    }
}