package pl.klenczi.jcomposeanimations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sizeState by remember{ mutableStateOf(200.dp) }
            val size by animateDpAsState(
                targetValue = sizeState,
                keyframes {
                    durationMillis = 5000
                    sizeState at 0 with LinearEasing
                    sizeState *1.5f at 1000 with FastOutLinearInEasing
                    sizeState * 2f at 5000
                }
            )
            Box(modifier = Modifier
                .size(size)
                .background(Color.Red),
                contentAlignment = Alignment.Center
            )
            {
                Button(onClick = {
                    sizeState += 50.dp
                }) {
                    Text(text = "Increase size")
                }
            }
        }
    }
}