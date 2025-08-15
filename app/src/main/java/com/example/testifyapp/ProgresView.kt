package com.example.testifyapp

import android.R.attr.description
import android.R.attr.progress
import android.accessibilityservice.GestureDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testifyapp.ui.theme.TestifyAppTheme
//pt culoarile din xml
import androidx.compose.ui.res.colorResource
import com.example.testifyapp.R

@Composable
fun ProgresViewCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background), // replace with your image
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        LinearProgressIndicator(
            progress = { progress.toFloat() },
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .clip(RoundedCornerShape(3.dp)),
            color = colorResource(id = R.color.blue),
            trackColor = Color.Green,
            strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
            gapSize = 20.dp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ProgressViewCardPreview() {
    TestifyAppTheme {
        ProgresViewCard(modifier = Modifier, title = "title", description = "description" )
    }
}