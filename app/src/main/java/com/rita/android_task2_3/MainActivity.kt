package com.rita.android_task2_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rita.android_task2_3.ui.theme.Android_Task2_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_Task2_3Theme {
                FourRectangles(modifier = Modifier.padding(16.dp))
            }
        }
    }
}


@Composable
fun FourRectangles(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            ArticleBox(
                title = "Text composable",
                message = "Displays text and follows the recommended Material Design guidelines.",
                boxBackground = R.color.violet1,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            )
            ArticleBox(
                title = "Image composable",
                message = "Creates a composable that lays out and draws a given Painter class object.",
                boxBackground = R.color.violet2,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            ArticleBox(
                title = "Row composable",
                message = "A layout composable that places its children in a horizontal sequence.",
                boxBackground = R.color.violet3,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            )

            ArticleBox(
                title = "Column composable",
                message = "A layout composable that places its children in a vertical sequence.",
                boxBackground = R.color.violet4,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            )
        }
    }
}

@Composable
fun ArticleBox(
    title: String,
    message: String,
    @ColorRes boxBackground: Int,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
            .background(colorResource(boxBackground))
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = message,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_Task2_3Theme {
    }
}
