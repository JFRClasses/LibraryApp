package com.pjsoft.libraryapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pjsoft.libraryapp.components.Header
import com.pjsoft.libraryapp.components.PopularBooks
import com.pjsoft.libraryapp.models.books
import com.pjsoft.libraryapp.ui.theme.LibraryAppTheme

@Composable
fun BooksScreen(
    navController : NavController
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        item{
            Header()
        }

        item {
            PopularBooks()
        }

        items(books){ book ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .clickable{
                        navController.navigate("books/${book}")
                    }
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                )
                ////////////////////
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp)
                ) {
                    Text(
                        text = book.title,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = book.author,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                ////////////
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "navigate"
                )
            }
        }
    }
}

@Preview
@Composable
fun BooksScreenPreview(){
    LibraryAppTheme {
        BooksScreen(
            navController = rememberNavController()
        )
    }
}