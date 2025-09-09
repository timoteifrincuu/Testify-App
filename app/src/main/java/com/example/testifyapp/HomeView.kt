package com.example.testifyapp

import SegmentedControlDemo
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testifyapp.ui.theme.TestifyAppTheme

// Assuming ProgresViewCardData is a data class like this:
// data class ProgresViewCardData(val title: String, val description: String, val showsProgress: Boolean = true)

@Composable
fun HomeView(modifier: Modifier = Modifier) {




    // Sample data for the ProgresViewCards
    val progresViewCardItems = listOf(
        ProgresViewCardData("Moment de rugaciune", "noteaza idei", false),
        ProgresViewCardData("Devotional", "noteaza idei"),
        ProgresViewCardData("Predici", "noteaza idei")
    )

    LazyColumn(modifier = modifier, verticalArrangement = Arrangement.spacedBy(7.dp)) {

        item{
            SegmentedControlDemo()
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 30.dp, bottom = 16.dp),
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
        }

        item {
            ExpandableBookItem(title = "Geneza", chapters = 50)
        }
        item {
            ExpandableBookItem(title = "Exodul", chapters = 40)
        }
        item {
            ExpandableBookItem(title = "Levitic", chapters = 27)
        }

        item {
                VerseOfTheDayView()
        }

        item{
            VerseBottomBarView()
        }

        items(progresViewCardItems) { cardData ->
            ProgresViewCard(
                title = cardData.title,
                description = cardData.description,
                showsProgress = cardData.showsProgress
            )
        }


    }
}

// You'll need to define this data class, or adjust as per your actual ProgresViewCardData structure
data class ProgresViewCardData(val title: String, val description: String, val showsProgress: Boolean = true)

@Preview(showBackground = true)
@Composable
fun HomeViewPreview() {
    TestifyAppTheme {
        HomeView()
    }
}