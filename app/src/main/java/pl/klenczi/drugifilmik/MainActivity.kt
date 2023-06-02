package pl.klenczi.drugifilmik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import pl.klenczi.drugifilmik.ui.theme.DrugiFilmikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green),
                verticalAlignment = Alignment.CenterVertically, // centruje elementy z kolumny w wyznaczonym obszarze
                horizontalArrangement = Arrangement.SpaceAround
                    // .SpaceBetween - rozdziela elementy na poziome granice
                    // .SpaceEvenly - dzieli na rowne czesc i daje elementy na granicach tych czesci
                    // .SpaceAround - przestrzen miedzy lementami jest taka sama ale miedzy elementem a granica polowe mniejsza
            ){
                Text("Hello")
                Text("World")
                Text("Hello")
            }
        }
    }
}