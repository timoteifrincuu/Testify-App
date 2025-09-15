import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SegmentedControlView(
    items: List<String>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(Color(0xFFF7F7F7))
            .padding(4.dp)
//        horizontalArrangement  = Arrangement.SpaceBetween,
//        verticalAlignment = Alingment.CenterVertically
    ) {
        items.forEachIndexed { index, item ->
            val isSelected = index == selectedIndex

            Text(
                text = item,
                color = if (isSelected) Color.White else Color(0xFF6A2E56),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(
                        if (isSelected) Color(0xFF6A2E56) else Color.Transparent
                    )
                    .clickable { onItemSelected(index) }
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}

@Composable
fun SegmentedControlDemo() {
    var selectedIndex by remember {mutableStateOf(2) }

    SegmentedControlView(
        items = listOf("Versete", "Predici", "Momente", "Progres"),
        selectedIndex = selectedIndex,
        onItemSelected = {selectedIndex  = it}
    )
}