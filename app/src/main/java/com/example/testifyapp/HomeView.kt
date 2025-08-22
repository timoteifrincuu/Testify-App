package com.example.testifyapp

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Start
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testifyapp.ui.theme.TestifyAppTheme

@Composable
fun HomeView(modifier: Modifier){

    Column(modifier = modifier

    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp,  end = 20.dp, top = 30.dp, bottom = 26.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Versetul de azi",
                textAlign = TextAlign.Start,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "Isaia 15 : 3",
                textAlign = TextAlign.End,
                modifier = Modifier.weight(1f)
            )
        }

        VerseOfTheDayView()

        ProgresViewCard(title="Moment de rugaciune", description = "noteaza idei", showsProgress = false)
        ProgresViewCard(title="Devotional", description = "noteaza idei")
        ProgresViewCard(title="Predici", description = "noteaza idei")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeViewPreview() {
    TestifyAppTheme {
        HomeView(modifier = Modifier)
    }
}