package com.pjsoft.libraryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BookCard(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
    )
    {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Magenta)
        ) {

        }
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Text(
                text = "Cien años de soledad"
            )
            Text(
                text = "Gabriel Garcia Marquez",
                modifier = Modifier.weight(1f)
            )

            Text(
                text = "Leer"
            )

        }
    }
}