package com.pjsoft.libraryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pjsoft.libraryapp.models.books
import com.pjsoft.libraryapp.ui.theme.HeaderGreen

@Composable
fun Header(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .clip(RoundedCornerShape(bottomStart = 70.dp))
            .background(HeaderGreen)
            .padding(20.dp)
            .padding(top = 20.dp)
    )
    {
        HeaderInfo()

        // Texto de comenzar a leer
        Text(
            text = "Continuar Leyendo",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        // Tarjeta de lectura de libro
        BookCard(book = books[2])
    }
}