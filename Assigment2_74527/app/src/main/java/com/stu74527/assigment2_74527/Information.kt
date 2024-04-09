package com.stu74527.assigment2_74527



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Info(navController: NavController,film : Movie) {
    val uncharted = painterResource(R.drawable.uncharted)
    var select by remember { mutableIntStateOf(film.seats_selected)}
    var remain by remember { mutableIntStateOf(film.seats_remaining)}
    var retiens = film.seats_remaining
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color(255,87,51),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text("Information")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color(255,87,51),
                contentColor = Color.White,
                modifier = Modifier.clickable { navController.navigate(Routes.MainScreen.route) }
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Go Back",
                )
            }
        },

        ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.Black),

            verticalArrangement = Arrangement.Center,

        ) {
            Box(
                modifier = Modifier
                    .height(20.dp)
                    .width(70.dp)
            )
            {
                Text(
                    text = "Go Back",
                    color = Color.Black,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 5.dp)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .height(500.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .height(480.dp)
                            .width(390.dp)
                            .padding(start = 5.dp),

                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally


                    ) {


                        Box(modifier = Modifier.padding(top = 20.dp)) {

                            /*AsyncImage(
                                model = film.image,
                                contentDescription = null,
                            )*/
                            Image(
                                painter = painterResource(film.image),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(Color.White)
                                    .height(130.dp)
                                    .width(88.dp)
                            )
                        }



                        Row {
                            Text(
                                color = Color.White,
                                modifier = Modifier
                                    .padding(bottom = 5.dp, top = 30.dp),
                                text = film.name
                            )
                            Text(
                                color = Color.LightGray,
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .padding(bottom = 5.dp, top = 33.dp, start=7.dp),
                                text = "(${film.certification})"
                            )
                        }


                        Row(modifier =Modifier.padding()) {
                            Text(
                                color = Color.White,
                                modifier = Modifier
                                    .padding(bottom = 10.dp, top = 30.dp),
                                fontWeight = FontWeight.Bold,

                                fontSize = 13.sp,
                                text = "Starring "
                            )
                            for (i in 0 until film.starring.size) {
                                Text(
                                    color = Color.LightGray,
                                    modifier = Modifier
                                        .padding(bottom = 10.dp, top = 30.dp),
                                    fontSize = 13.sp,
                                    text = "${film.starring[i]}, "
                                )
                            }

                        }
                        Row{
                            Text(
                                color = Color.White,
                                modifier = Modifier
                                    .padding(bottom = 10.dp, top = 10.dp),
                                fontWeight = FontWeight.Bold,

                                fontSize = 13.sp,
                                text = "Running time "
                            )
                            Text(
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(bottom = 10.dp, top = 10.dp,end=210.dp),
                                fontSize = 13.sp,
                                text = "${film.running_time_mins.toString()} mins"
                            )
                        }

                        Text(
                            color = Color.White,
                            modifier = Modifier
                                .padding(bottom = 10.dp, top = 15.dp),
                            fontSize = 10.sp,
                            text = film.description
                        )

                        Row(modifier = Modifier.padding(top = 20.dp)) {
                            Row {
                                Text(
                                    color = Color.White,
                                    modifier = Modifier
                                        .padding(end =10.dp),
                                    text = "Select Seats"
                                )
                                Image(painter = painterResource(R.drawable.minus__1_),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(15.dp)
                                        .width(15.dp)
                                        .clickable {
                                            if (select > 0)
                                                film.seats_selected--;
                                            if (select > 0)
                                                select--;
                                            if (select >= 0)
                                                film.seats_remaining++;
                                            if (select >= 0)
                                                remain++;
                                        }
                                )
                                Text(
                                    color = Color.White,
                                    modifier = Modifier
                                        .padding(end = 10.dp),
                                    text = "  ${select}"
                                )
                                Image(painter = painterResource(R.drawable.plus__1_),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(15.dp)
                                        .width(15.dp)

                                        .clickable {
                                            if (select < retiens)
                                                film.seats_selected++;
                                            if (select < retiens)
                                                select++
                                            if (select < retiens)
                                                film.seats_remaining--
                                            if (select < retiens)
                                                remain--

                                        }
                                )
                            }
                            Row (
                                modifier = Modifier
                                    .padding(start = 40.dp)
                            ){
                                Image(painter = painterResource(R.drawable.sofa),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    color = Color.White,
                                    modifier = Modifier
                                        .padding(start=5.dp),
                                    text = "${film.seats_remaining} Seats Remained"
                                )
                            }

                        }


                    }

                }
            }


        }
    }
}

