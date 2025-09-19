package com.pjsoft.libraryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pjsoft.libraryapp.models.books

@Composable
fun PopularBooks(){
    Column(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(
            text = "Libros Populares",
            style = MaterialTheme.typography.titleLarge
        )
        LazyRow(
            modifier = Modifier.fillMaxSize()
        ) {
            items(books){ book ->
                Column(
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .fillMaxHeight()
                        .width(120.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(Color.DarkGray)
                    ) {  }
                    Text(
                        text = book.title,
                        style = MaterialTheme.typography.bodySmall,
                        maxLines = 1,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = book.author.uppercase(),
                        style = MaterialTheme.typography.bodySmall,
                        maxLines = 1,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

