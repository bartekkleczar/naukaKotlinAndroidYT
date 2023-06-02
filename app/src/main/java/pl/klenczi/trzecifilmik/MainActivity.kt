package pl.klenczi.trzecifilmik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.klenczi.trzecifilmik.ui.theme.TrzeciFilmikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.5f)
                .width(600.dp)
                //.requiredWidth(600.dp) -> wywala poza ekran jak sie da za duza
                .padding(top = 15.dp)
            ) {
                Text("Hello", modifier = Modifier
                    .offset(0.dp, 20.dp)) // działa jak margin ale pozwala na nakładanie się elementów
                Spacer(modifier = Modifier.height(50.dp)) // pusty kontener
                Text("World")
            }
        }
    }
}
