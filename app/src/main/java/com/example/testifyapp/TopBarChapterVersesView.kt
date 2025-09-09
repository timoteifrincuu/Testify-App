import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testifyapp.R
import com.example.testifyapp.ui.theme.TestifyAppTheme

@Composable
fun TopBarChapterVersesView(
    title: String = "Geneza 7",
    leftButtonText: String = "Capitole",
    onLeftButtonClick: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Buton cu icon și text clicabil pe partea stângă
        Row(
            modifier = Modifier
                .clickable { onLeftButtonClick() }
                .padding(end = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.left_arrow),
                contentDescription = "Inapoi",
                tint = colorResource(id = R.color.burgundy),
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = leftButtonText,
                fontSize = 18.sp,
                color = colorResource(id = R.color.burgundy)
            )
        }
        Spacer(modifier = Modifier.weight(0.5f))
        // Titlul centrat
        Text(
            text = title,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarChapterVersesViewPreview() {
    TestifyAppTheme {
        TopBarChapterVersesView()
    }
}