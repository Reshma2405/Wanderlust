package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class CapeTown : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne4()
                }
            }
        }
    }
}

@Composable
fun PlaceOne4() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_4),
        )
        Image(
            painterResource(id = R.drawable.capetown), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and City Orientation\n" +

                    "Arrive in Cape Town and check into your accommodation.\n" +
                    "Take a leisurely stroll along the V&A Waterfront to get familiar with the area.\n" +
                    "Enjoy a dinner at one of the waterfront's restaurants.\n" +
                    "\n" +

                    "Day 2: Cape Peninsula Tour\n" +

                    "Take a full-day guided tour along the Cape Peninsula.\n" +
                    "Visit Hout Bay, Chapman's Peak Drive, Cape Point, and the Cape of Good Hope.\n" +
                    "Stop at Boulders Beach to see the penguins.\n" +
                    "Return via Simon's Town and Kalk Bay.\n" +
                    "\n" +
                    "Day 3: Table Mountain and City Center\n" +

                    "Start the day with a visit to Table Mountain (weather permitting).\n" +
                    "Explore the Company's Garden, a historical park in the city center.\n" +
                    "Visit the Iziko South African Museum or the District Six Museum.\n" +
                    "Enjoy dinner in the city center or at a local restaurant.\n" +
                    "\n" +
                    "Day 4: Robben Island and Shopping\n" +

                    "Take a morning ferry to Robben Island, where Nelson Mandela was imprisoned.\n" +
                    "Explore the V&A Waterfront's shopping and dining options in the afternoon.\n" +
                    "Consider taking a sunset cruise from the waterfront.\n" +
                    "\n" +
                    "Day 5: Winelands Excursion\n" +

                    "Head to Stellenbosch or Franschhoek in the Cape Winelands region.\n" +
                    "Enjoy wine tastings at some of the renowned wineries.\n" +
                    "Explore the charming towns, art galleries, and local cuisine.\n" +
                    "\n" +
                    "Day 6: Kirstenbosch Gardens and Beaches\n" +
                    "Visit Kirstenbosch National Botanical Garden to experience indigenous flora.\n" +
                    "Spend the afternoon relaxing on one of Cape Town's beautiful beaches like Camps Bay or Clifton Beach.\n" +
                    "\n" +
                    "Day 7: Cultural Immersion and Departure\n" +
                    "Explore the Bo-Kaap neighborhood with its colorful houses and Cape Malay culture.\n" +
                    "Visit the Zeitz Museum of Contemporary Art Africa (MOCAA) at the V&A Waterfront.\n" +
                    "If time allows, do some last-minute shopping or relaxing.\n" +
                    "Depart from Cape Town."
        )


    }
}

