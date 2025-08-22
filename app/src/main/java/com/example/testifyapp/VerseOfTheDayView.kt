package com.example.testifyapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testifyapp.ui.theme.TestifyAppTheme

@Composable
fun VerseOfTheDayView(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier

            .clip(RoundedCornerShape(16.dp)) // colțuri rotunjite
            .padding(14.dp)
            .border(
                width = 1.dp, // grosimea liniei
                colorResource(id = R.color.purple),
                shape = RoundedCornerShape(16.dp) // să urmeze colțurile rotunjite
            )

    ) {
        //      PictureVerse
        Column() {
            Image(
                painter = painterResource(R.drawable.peisaj),
                contentDescription = "Peisaj",
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 13.dp, vertical = 26.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 13.dp, end = 13.dp, bottom = 26.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        width = 1.dp, // grosimea liniei
                        colorResource(id = R.color.purple),
                        shape = RoundedCornerShape(16.dp) // să urmeze colțurile rotunjite
                    )
                    .padding(horizontal = 32.dp, vertical = 8.dp)
                .background(Color.White),
                horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
//                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(id =  R.drawable.share),
                        contentDescription = "Distribuie",
                        tint = colorResource(id = R.color.burgundy),
                    )
                    Spacer(modifier = Modifier.height(13.dp))
                    Text(text = "Distribuie", fontWeight = FontWeight.Bold, color = colorResource(id = R.color.violet_300))

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id =  R.drawable.favorite),
                        contentDescription = "favorite",
                        tint = colorResource(id = R.color.burgundy),

                    )
                    Spacer(modifier = Modifier.height(13.dp))
                    Text(
                        text = "300",
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.violet_300)
                    )
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun VerseOfTheDayViewPreview() {
    TestifyAppTheme {
        VerseOfTheDayView()
    }
}