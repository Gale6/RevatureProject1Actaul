package com.revature.revatureproject1actual

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.revature.revatureproject1actual.ui.theme.RevatureProject1ActualTheme

class WalletActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RevatureProject1ActualTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    walletComponent()
                }
            }
        }
    }
}

@Composable
fun walletComponent() {
    val context = LocalContext.current
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Balance: ", fontWeight = FontWeight.Bold, fontSize = 40.sp)
        Text(text = "$500.00 ",fontSize = 20.sp)

        Spacer(modifier = Modifier.height(40.dp))

        Box(
            Modifier
                .border(1.dp, color = Color.Black)
                .size(300.dp)
        ){
            Column(Modifier.padding(20.dp)) {
                Text(text = "Washer 2: -$ 5.00 ",Modifier.padding(5.dp))
                Text(text = "Dryer 4: -$ 4.00 ",Modifier.padding(5.dp))
                Text(text = "Washer 3: -$ 5.00 ",Modifier.padding(5.dp))
                Text(text = "Washer 5: -$ 5.00 ",Modifier.padding(5.dp))
                Text(text = "Dryer 7: -$ 5.00 ",Modifier.padding(5.dp))
            }

        }

        Button(onClick = {/*todo*/}) {
            Text(text = "Add funds")
        }

        Button(onClick = { context.startActivity(Intent(context, MainMenuActivity::class.java)) }) {
            Text(text = "back to main")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    RevatureProject1ActualTheme {
        walletComponent()
    }
}