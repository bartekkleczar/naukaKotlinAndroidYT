package com.example.buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttons.ui.theme.ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button( // Główne
                            onClick = { /*TODO*/ }

                        ) {
                            Text(text = "Create new account")
                        }

                        OutlinedButton( // Dla mniej ważnej akcji
                            onClick = { /*TODO*/ }

                        ) {
                            Text(text = "I have existing account")
                        }

                        ElevatedButton( // Przeważnie na zdjęciu
                            onClick = { /*TODO*/ }

                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add to cart",
                                modifier = Modifier.size(18.dp) // material3 guideline
                            )
                            Spacer(modifier = Modifier.width(18.dp)) // material3 guideline
                            Text(text = "Add to cart")
                        }

                        FilledTonalButton( // Niegłówne
                            onClick = { /*TODO*/ }

                        ) {
                            Text(text = "Open in browser")
                        }

                        TextButton( // Dla rzadkich akcji
                            onClick = { /*TODO*/ }

                        ) {
                            Text(text = "Learn more")
                        }
                    }
                }
            }
        }
    }
}