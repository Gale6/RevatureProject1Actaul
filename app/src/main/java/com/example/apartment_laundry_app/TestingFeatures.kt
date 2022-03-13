package com.example.apartment_laundry_app

import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.apartment_laundry_app.ui.theme.ApartmentlaundryappTheme

class TestingFeatures : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChangeFont()
        }
    }
}

@Composable
fun ChangeFont()
{
//    val context = LocalContext.Current
//    Typeface typeface = ResourcesCompat.getFont(context, R.font.myfont);
//    textView.setTypeface(typeface);
}

@Preview
@Composable
fun PreviewChangeFont()
{
    ChangeFont()
}