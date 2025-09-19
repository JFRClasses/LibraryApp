package com.pjsoft.libraryapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pjsoft.libraryapp.models.Book
import com.pjsoft.libraryapp.models.books
import com.pjsoft.libraryapp.ui.theme.LibraryAppTheme

@Composable
fun BookDetailScreen(bookId : Int){
    val book = books.firstOrNull { it.id == bookId }


    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("BookDetailScreen: ${book?.description}")
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