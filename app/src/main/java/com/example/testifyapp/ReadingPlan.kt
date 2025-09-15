// Fișierul complet, fără importuri inutile, doar cele necesare
import com.example.testifyapp.R





import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color


data class Chapter(
    val name: String,
    val imageRes: Int,
    val chapterNumber: Int,
    val termLimit: String,
    val dailyTime: String,
    val progress: String
)

@Composable
fun ReadingPlan() {
    val chapters = listOf(
        Chapter(
            name = "Daniel",
            imageRes = R.drawable.peisaj,
            chapterNumber = 24,
            termLimit = "0 lună",
            dailyTime = "20 - 40 min.",
            progress = "Ai citit 2 capitole"
        ),
        Chapter(
            name = "Iov",
            imageRes = R.drawable.peisaj,
            chapterNumber = 24,
            termLimit = "0 lună",
            dailyTime = "20 - 40 min.",
            progress = "Ai citit 2 capitole"
        ),
        Chapter(
            name = "Proverbe",
            imageRes = R.drawable.peisaj,
            chapterNumber = 24,
            termLimit = "0 lună",
            dailyTime = "20 - 40 min.",
            progress = "Ai citit 2 capitole"
        )
    )

    Column(modifier = Modifier.padding(16.dp)) {
        for (chapter in chapters) {
            ChapterItem(chapter)
            Divider(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}

@Composable
fun ChapterItem(chapter: Chapter) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* acțiune la click, dacă e nevoie */ },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Afișează imaginea
        Image(
            painter = painterResource(id = chapter.imageRes),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 8.dp)
        )

        // Titlul sub imagine
        Text(
            text = chapter.name,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Alte informații
        Text(text = "Număr de capitole: ${chapter.chapterNumber}")
        Text(text = "Termen limită: ${chapter.termLimit}")
        Text(text = "Timp zilnic recomandat: ${chapter.dailyTime}")
        Text(
            text = chapter.progress,
            color = Color.Gray,
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewReadingPlan() {
    MaterialTheme {
        ReadingPlan()
    }
}