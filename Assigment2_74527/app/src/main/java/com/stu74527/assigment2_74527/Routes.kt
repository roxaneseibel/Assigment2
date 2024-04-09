package com.stu74527.assigment2_74527


sealed class Routes(val route: String) {
    object FirstScreen : Routes("first_screen")
    object SecondScreen : Routes("second_screen")
    object ThirdScreen : Routes("third_screen")
    object MainScreen : Routes("main_screen")
    object InformationScreen : Routes("information_screen")
}