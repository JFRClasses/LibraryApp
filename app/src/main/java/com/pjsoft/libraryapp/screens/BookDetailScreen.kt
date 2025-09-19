package com.pjsoft.libraryapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pjsoft.libraryapp.models.Book
import com.pjsoft.libraryapp.models.books
import com.pjsoft.libraryapp.ui.theme.AccentYellow
import com.pjsoft.libraryapp.ui.theme.AccentYellowDark
import com.pjsoft.libraryapp.ui.theme.BackgroundLight
import com.pjsoft.libraryapp.ui.theme.ChipBg
import com.pjsoft.libraryapp.ui.theme.HeaderGreen
import com.pjsoft.libraryapp.ui.theme.Headphones
import com.pjsoft.libraryapp.ui.theme.LibraryAppTheme

@Composable
fun BookDetailScreen(bookId : Int){
    val book = books.firstOrNull { it.id == bookId }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight),
    ) {
        // Imagen y Tags de Rating, Paginas, Duracion y Lenguaje
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .clip(RoundedCornerShape(bottomStart = 70.dp))
                .background(HeaderGreen)
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            AsyncImage(
                model = book?.image,
                contentDescription = book?.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(180.dp)
                    .weight(2f)
                    .shadow(16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    book?.title ?: "Desconocido",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
                Text(
                    book?.author ?: "Sin autor",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    StatTag(title = "RATING", value = book?.rating.toString())
                    StatTag(title = "PAG", value = book?.pages ?: "")
                    StatTag(title = "AUDIO", value = book?.audio ?: "0h 0m")
                    StatTag(title = "LENG", value = book?.language?.take(3)?.uppercase() ?: "ENG")
                }
            }

        }

        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp)
                    .padding(top = 10.dp)
            )
            {
                // Texto
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AccentYellowDark
                    ),
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                ) {
                    Text(
                        text = "Leer ahora"
                    )
                }
                // Icono
                Icon(
                    imageVector = Headphones,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(AccentYellowDark)
                        .padding(8.dp),
                    tint = Color.White
                )
            }

            // COntenido
            Text(
                text = "Descripcion"
            )
            Text(
                text = book?.description ?: ""
            )
        }

    }
}

@Preview
@Composable
fun BookDetailPreview(){
    LibraryAppTheme {
        BookDetailScreen(
            bookId = 4
        )
    }
}

@Composable
fun StatTag(title: String, value: String){
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(ChipBg)
            .padding(horizontal = 14.dp, vertical = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(title,
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            value,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}