package com.example.textfields

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfields.ui.theme.TextFieldsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldsTheme {
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
                        var filledText by remember {
                            mutableStateOf("")
                        }
                        TextField(
                            value = filledText,
                            onValueChange = {
                                filledText = it
                            },
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            /*label*/ placeholder = { //label widać cały czas
                                Text(text = "Enter your weight")
                            },
                            /*trailingIcon*/ leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight"
                                )
                            },
                            /*prefix*/ suffix = {
                                Text(text = "kg")
                            },
                            supportingText = { //text pod polem
                                Text(text = "*required")
                            },
                            //isError = true
                            //visualTransformation = PasswordVisualTransformation()
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next //przycisk akcji w prawym dolnym klawiatury
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {

                                }
                            )
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        var outlinedText by remember {
                            mutableStateOf("")
                        }
                        OutlinedTextField(
                            value = outlinedText,
                            onValueChange = {
                                outlinedText = it
                            },
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            /*label*/ placeholder = { //label widać cały czas
                                Text(text = "Enter your weight")
                            },
                            /*trailingIcon*/ leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight"
                                )
                            },
                            /*prefix*/ suffix = {
                                Text(text = "kg")
                            },
                            supportingText = { //text pod polem
                                Text(text = "*required")
                            },
                            //isError = true
                            //visualTransformation = PasswordVisualTransformation()
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next //przycisk akcji w prawym dolnym klawiatury
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {

                                }
                            )
                        )
                    }
                }
            }
        }
    }
}