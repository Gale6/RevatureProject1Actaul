package revatureproject1actual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import revatureproject1actual.ui.theme.RevatureProject1ActualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RevatureProject1ActualTheme {

            }
        }
    }
}