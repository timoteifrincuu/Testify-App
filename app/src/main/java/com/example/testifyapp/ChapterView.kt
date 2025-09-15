package com.example.testifyapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testifyapp.ui.theme.TestifyAppTheme

@Composable
fun ChapterView(modifier: Modifier = Modifier) {

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 40.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(50) { index ->
            Surface(
                modifier = Modifier.size(40.dp),
                color = Color(0xFFFFEBEB),
                shape = RoundedCornerShape(8.dp),
                onClick = {
                    // aici pui logica pentru click pe pătrățelul curent
                }
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "${index + 1}",
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ChapterViewPreview(){
    TestifyAppTheme {
        ChapterView(Modifier)
    }
}