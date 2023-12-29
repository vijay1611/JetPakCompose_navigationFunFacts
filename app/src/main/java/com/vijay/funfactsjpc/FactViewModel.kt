package com.vijay.funfactsjpc

import androidx.lifecycle.ViewModel

class FactViewModel:ViewModel() {

    fun generateRandomFact(selectedAnimal:String):String{
      return  if(selectedAnimal=="Dog"){
            getDogFacts().random()
        }else{
            getCatFacts().random()
        }
    }

    fun getDogFacts():List<String> {
        val dogFacts = listOf(

            "Dogs have a ruff time understanding why squirrel dont want to play fetch",
            "if dogs could text, their message would br mostly 'food' and 'walk'",
            "Dogs have secret meeting points , every night they discuss about their life",
            "Dogs have positive life of in the world"
        )
        return  dogFacts
    }
    fun getCatFacts():List<String> {
        val dcatFacts = listOf(

            "Cats have a ruff time understanding why squirrel dont want to play fetch",
            "if cats could text, their message would br mostly 'food' and 'walk'",
            "Cats have secret meeting points , every night they discuss about their life",
            "Cats have positive life of in the world"
        )
        return  dcatFacts
    }


}