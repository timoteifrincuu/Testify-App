package com.example.testifyapp

import android.R.attr.description
import android.R.attr.progress
import android.accessibilityservice.GestureDescription
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
    showsProgress: Boolean = true,
    title: String,
    description: String,
){



    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(
                width = 1.dp, // grosimea liniei
                colorResource(id = R.color.purple),
                shape = RoundedCornerShape(16.dp) //clip si shape nu i the same?
            ),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Column(
            modifier = Modifier
                .padding(all = 10.dp)
//                .fillMaxHeight(),
//            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Column(
                modifier = Modifier,
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

            if (showsProgress) {
                Spacer(modifier = Modifier.height(30.dp))

                LinearProgressIndicator(
                    progress = { progress.toFloat() },
                    modifier = Modifier
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = colorResource(id = R.color.green),
                    trackColor = Color.Red,
                    strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
                    gapSize = 20.dp,
                )
            }
            Spacer(modifier = Modifier.height(4.dp))

        }
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // replace with your image
            contentDescription = null,
            modifier = Modifier
                .size(110.dp),
            contentScale = ContentScale.Crop
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