package com.pjsoft.libraryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgs
import androidx.navigation.navArgument
import com.pjsoft.libraryapp.screens.BookDetailScreen
import com.pjsoft.libraryapp.screens.BooksScreen
import com.pjsoft.libraryapp.screens.FavoritesScreen
import com.pjsoft.libraryapp.ui.theme.AccentYellow
import com.pjsoft.libraryapp.ui.theme.BackgroundLight
import com.pjsoft.libraryapp.ui.theme.BottomBarBackground
import com.pjsoft.libraryapp.ui.theme.LibraryAppTheme
// Intent
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LibraryAppTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        NavigationBar(
                            modifier = Modifier
                                .background(BackgroundLight)
                                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
                            containerColor = BottomBarBackground
                        ) {
                            NavigationBarItem(
                                selected = false,
                                onClick = {
                                    navController.navigate("books")
                                },
                                icon = {
                                    Icon(
                                        imageVector = Icons.Default.Menu,
                                        contentDescription = "home",
                                        modifier = Modifier.size(35.dp),
                                        tint = AccentYellow
                                    )
                                },
                            )
                            NavigationBarItem(
                                selected = false,
                                onClick = {
                                    navController.navigate("favorites")
                                },
                                icon = {
                                    Icon(
                                        imageVector = Icons.Default.Favorite,
                                        contentDescription = "favorites",
                                        modifier = Modifier.size(35.dp),
                                        tint = AccentYellow
                                    )
                                }
                            )
                        }
                    }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "books"
                    ) {
                        composable(route = "books") {
                            BooksScreen(
                                navController = navController,
                                innerPadding = innerPadding
                            )
                        }
                        composable(route = "favorites") {
                            FavoritesScreen()
                        }
                        composable(
                            route = "books/{id}",
                            arguments = listOf(
                                navArgument("id"){
                                    type = NavType.IntType
                                }
                            )
                        ) { backStackEntry ->
                            val id = backStackEntry.arguments?.getInt("id") ?: 0
                            BookDetailScreen(
                                bookId = id
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibraryAppTheme {
        Greeting("Android")
    }
}