package com.stu74527.assigment2_74527

import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.stu74527.assigment2_74527.ui.theme.Assigment2_74527Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assigment2_74527Theme {
                AppNavigation()

            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun First(navController: NavController) {
    val uncharted = painterResource(R.drawable.uncharted)
    val dune = painterResource(R.drawable.dune)
    val poor = painterResource(R.drawable.poor)
    val wicked = painterResource(R.drawable.wicked)
    Scaffold(
        topBar = {
            TopAppBar(

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(255,87,51),
                    titleContentColor = Color.White

                ),
                title = {

                    Text("Menu", textAlign = TextAlign.Center)
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color(255,87,51),
                contentColor = Color.White,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "App bar",
                )
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(paddingValues)
                    .background(Color.Black),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                BoxMovie(film = AllMovie[0] ,na = navController, mov="/movie1")
                BoxMovie(film = AllMovie[1],na = navController, mov="/movie2")
                BoxMovie(film = AllMovie[2],na = navController, mov="/movie3")
                BoxMovie(film = AllMovie[3],na = navController, mov="/movie4")

            }
        }
         )




}

@Composable
fun BoxMovie(film : Movie,na: NavController,mov : String){
    Column(modifier = Modifier
        .clickable { na.navigate("${Routes.InformationScreen.route}${mov}")})
    {
        Box(modifier = Modifier
            .background(Color.LightGray)
            .height(15.dp))


        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                .height(150.dp)
                .width(400.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 10.dp),

                verticalAlignment = Alignment.CenterVertically,


                ) {
                Image(
                    painter = painterResource(film.image),
                    contentDescription = null,
                    modifier = Modifier
                        .background(Color.White)
                        .height(129.dp)
                        .width(87.dp)
                )



                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                )
                {
                    Text(
                        color = Color.White,
                        modifier = Modifier
                            .padding(bottom = 5.dp, top = 5.dp),
                        text = film.name
                    )
                    Text(
                        color = Color.White,
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                            .height(70.dp),
                        fontSize = 10.sp,
                        text = film.description
                    )
                    Row {
                        if (film.seats_selected ==0)
                        {
                            Image(
                                painter = painterResource(R.drawable.sofa),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(start=80.dp)
                                    .height(20.dp)
                                    .width(20.dp)
                            )
                            Text(
                                color = Color.White,
                                modifier = Modifier
                                    .padding(start = 10.dp),
                                text = "${film.seats_remaining} SEATS REMAINING"
                            )
                        }
                        else
                        {
                            Image(
                                painter = painterResource(R.drawable.sofa__1_),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(start=80.dp)
                                    .height(20.dp)
                                    .width(20.dp)
                            )
                            Text(
                                color = Color.Green,
                                modifier = Modifier
                                    .padding(start = 10.dp),
                                text = "${film.seats_selected} SEATS SELECTED"
                            )
                        }

                    }

                }

            }
        }
    }




}
