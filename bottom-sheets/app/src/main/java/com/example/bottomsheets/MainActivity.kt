package com.example.bottomsheets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.bottomsheets.ui.theme.BottomSheetsTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomSheetsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val sheetState = rememberModalBottomSheetState()
                    var isSheetOpened by rememberSaveable {
                        mutableStateOf(false)
                    }
                    val scaffoldState = rememberBottomSheetScaffoldState()
                    val scope = rememberCoroutineScope()
                    /*Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        TextButton(onClick = {
                            isSheetOpened = true
                        }) {
                            Text(text = "Open sheet")
                        }
                    }*/
                    BottomSheetScaffold(
                        scaffoldState = scaffoldState,
                        sheetContent = {
                            SheetContent()
                        }
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            TextButton(onClick = {
                                scope.launch{ scaffoldState.bottomSheetState.expand() }
                            }) {
                                Text(text = "Open sheet")
                            }
                        }
                    }
                    /*if(isSheetOpened){
                        ModalBottomSheet(
                            sheetState = sheetState,
                            onDismissRequest = { isSheetOpened = false }
                        ) {
                            SheetContent()
                        }
                    }*/

                }
            }
        }
    }
}

@Composable
fun SheetContent(){
    Checkbox(checked = false, onCheckedChange = {})
    Text(text = "smth")
}