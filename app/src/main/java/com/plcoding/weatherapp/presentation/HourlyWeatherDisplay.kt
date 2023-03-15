package com.plcoding.weatherapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.plcoding.weatherapp.domain.weather.WeatheraData
import java.time.format.DateTimeFormatter

@Composable
fun HourlyWeatherDisplay(
    weatheraData: WeatheraData,
    modifier: Modifier= Modifier,
    textColor: Color = Color.White
) {
    val formattedTime = remember(weatheraData) {
        weatheraData.time.format(
            DateTimeFormatter.ofPattern("HH:mm")
        )
    }
    Column(
        modifier = modifier, 
        horizontalAlignment = Alignment.CenterHorizontally, 
        verticalArrangement = Arrangement.SpaceAround) {
    Text(text = formattedTime, color = Color.LightGray)     
        Image(painter = painterResource(id = weatheraData.weatherType.iconRes),
            contentDescription = null, modifier=Modifier.width(40.dp))
        Text(text = "${weatheraData.temperatureCelsius}'C", color = textColor, fontWeight = FontWeight.Bold)
        
    }
}