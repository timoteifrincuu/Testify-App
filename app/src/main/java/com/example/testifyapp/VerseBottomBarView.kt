package com.example.testifyapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun VerseBottomBarView() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        IconButton(onClick = { /* do something */ }) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_left_circle),
                contentDescription = "Previous Chapter",
                tint = colorResource(id = R.color.burgundy),
            )
        }

        IconButton(onClick = { /* do something */ }) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_right_circle),
                contentDescription = "Next Chapter",
                tint = colorResource(id = R.color.burgundy),
            )
        }
    }
}