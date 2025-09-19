package com.pjsoft.libraryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pjsoft.libraryapp.models.Book
import com.pjsoft.libraryapp.ui.theme.AccentYellowDark

@Composable
fun BookCard(book: Book){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
    )
    {
        AsyncImage(
            model = book.image,
            contentDescription = book.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Magenta)
        )
        Column(
            modifier = Modifier
                .weight(2f)
                .padding(vertical = 10.dp)
        ) {
            Text(
                text = book.title,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = book.author,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.bodyMedium
            )

            Row(
                modifier = Modifier.border(
                    1.dp,
                    AccentYellowDark,
                    RoundedCornerShape(5.dp)
                )
                    .padding(horizontal = 12.dp, vertical = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = null,
                    tint = AccentYellowDark,
                    modifier = Modifier.padding(end = 5.dp)
                )
                Text(
                    text = "Leer",
                    style = MaterialTheme.typography.titleSmall
                )
            }

        }
    }
}