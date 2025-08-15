package com.example.testifyapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeView(modifier: Modifier){
    Column(modifier = modifier) {
        ProgresViewCard(title="Moment de rugaciune", description = "noteaza idei")
        ProgresViewCard(title="Devotional", description = "noteaza idei")
        ProgresViewCard(title="Predici", description = "noteaza idei")
    }
}