package com.withjetpack.dashboard_jeptack_compose_android
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.withjetpack.dashboard_jeptack_compose_android.ui.theme.DashBoardJeptackComposeAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DashBoardJeptackComposeAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        // TopAppBar at the top
                        TopAppBar(
                            title = { Text("Vehicle Dashboard") },
                            navigationIcon = {
                                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                            },
                            actions = {
                                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                            }
                        )

                        // LazyGridWithImagesAndText below the TopAppBar
                        LazyGridWithImagesAndText()
                    }
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DashBoardJeptackComposeAndroidTheme {
        LazyGridWithImagesAndText()
    }
}