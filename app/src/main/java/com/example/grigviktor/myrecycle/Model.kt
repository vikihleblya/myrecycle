package com.example.grigviktor.myrecycle

data class PersonNeed (var title: String)

object Supplier {
    val titles = listOf<PersonNeed>(PersonNeed("Help with router"),
            PersonNeed("Cook the dish"),
            PersonNeed("Go to PY"),
            PersonNeed("Eating Toast"),
            PersonNeed("Fuck you Debbie"),
            PersonNeed("Now this looks like")
            )
}