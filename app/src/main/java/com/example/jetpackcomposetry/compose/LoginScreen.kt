package com.example.jetpackcomposetry.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetry.R
import com.example.jetpackcomposetry.ui.theme.DeepPurple
import com.example.jetpackcomposetry.ui.theme.YellowPLN

@Composable
fun LoginScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = DeepPurple)
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            logoCompany()
        }
    }
}
@Composable
fun logoCompany(){
    Row( horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
        .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_logo_pln),
            contentDescription = "Logo PLN",
            modifier = Modifier
                .padding(16.dp)
                .height(100.dp)
                .width(100.dp)
                .background(YellowPLN)
                .clip(shape = CircleShape)
        )
    }

    

}

