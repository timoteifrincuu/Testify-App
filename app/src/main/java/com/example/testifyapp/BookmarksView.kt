package com.example.testifyapp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BookmarksScreen() {
    val items = listOf(
        // Fiecare element are titlu, text, și imagine
        BookmarkItem(
            title = "Ai evidențiat Psalmii 121",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting",
            imageRes = R.drawable.peisaj // înlocuiește cu imaginea ta
        ),
        BookmarkItem(
            title = "Ai evidențiat Marcu 2 : 3",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting.",
            imageRes = R.drawable.peisaj // înlocuiește cu imaginea ta
        ),
        BookmarkItem(
            title = "Ai evidențiat Matei 5 : 5",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting.",
            imageRes = R.drawable.peisaj // înlocuiește cu imaginea ta
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        // Titlul
        Text(
            text = "Bookmarks",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )

        // Lista de elemente
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(items) { item ->
                BookmarkCard(item)
            }
        }
    }
}

data class BookmarkItem(
    val title: String,
    val description: String,
    val imageRes: Int
)

@Composable
fun BookmarkCard(item: BookmarkItem) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .heightIn(min = 100.dp)
        ) {
            // Text și descriere
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = item.description,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Imaginea
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BookmarksScreenPreview() {
    MaterialTheme {
        BookmarksScreen()
    }
}