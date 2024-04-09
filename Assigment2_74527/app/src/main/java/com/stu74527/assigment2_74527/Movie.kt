package com.stu74527.assigment2_74527

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

class Movie(
    val name: String,
    val image: Int,
    val certification: String,
    val description: String,
    val starring: Array<String>,
    val running_time_mins: Int,
    var seats_remaining: Int,
    var seats_selected: Int


)
val diceRange: IntRange = 1..15
val AllMovie = arrayOf(
    Movie(
        name = "UNCHARTED",
        image = R.drawable.uncharted,
        certification="12A",
        description="The premise of the film sees a young" +
                " man getting recruited to go on a hunt for" +
                " a long lost treasure. Tom Holland plays " +
                "Nathan Drake and I can't help myself he is " +
                "really entertaining to watch and I think this is" +
                " just because of Holland's natural charm and charisma" +
                " manages to drag him through.",
        starring= arrayOf("Tom Holland","Mark Wahlberg","Antonio Banderas"),
        running_time_mins=116,
        seats_remaining= diceRange.random(),
        seats_selected=0
    ),
    Movie(
        name = "DUNE: PART TWO",
        image = R.drawable.dune,
        certification="12A",
        description="\"Dune: Part Two\" will explore the mythic " +
                "journey of Paul Atreides as he unites with Chani " +
                "and the Fremen while on a warpath of revenge against" +
                " the conspirators who destroyed his family. Facing a " +
                "choice between the love of his life and the fate of the" +
                " known universe, he endeavors to prevent a terrible future" +
                " only he can foresee.",
        starring= arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" ),
        running_time_mins=205,
        seats_remaining= diceRange.random(),
        seats_selected=0
    ),
    Movie(
        name = "POOR THING",
        image = R.drawable.poor,
        certification="18A",
        description="Bella is a young woman brought back to life by the " +
                "brilliant and unorthodox Dr. Godwin Baxter. Eager to discover" +
                " the world about which she knows nothing, she runs away" +
                " with Duncan Wedderburn. " +
                "Impervious to the prejudices of her time, Bella is determined " +
                "not to give in on the principles of equality and liberation.",
        starring= arrayOf("Willem Dafoe", "Emma Stone", "Christopher Abbott"),
        running_time_mins=142,
        seats_remaining= diceRange.random(),
        seats_selected=0
    ),
    Movie(
        name = "WICKED LITTLE LETTERS",
        image = R.drawable.wicked,
        certification="15A",
        description="When people in Littlehampton--including conservative " +
                "local Edith--begin to receive letters full of hilarious" +
                " profanities, rowdy Irish migrant Rose is charged with" +
                " the crime. Suspecting that something is amiss, the" +
                " town's women investigate.",
        starring= arrayOf("Olivia Colman", "Jessie Buckley", "Anjana Vasan"),
        running_time_mins=100,
        seats_remaining= diceRange.random(),
        seats_selected=0
    )

)