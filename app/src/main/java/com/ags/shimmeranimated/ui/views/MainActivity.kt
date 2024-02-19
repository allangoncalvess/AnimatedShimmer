package com.ags.shimmeranimated.ui.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.ags.shimmeranimated.ui.theme.ShimmerAnimatedTheme
import com.ags.shimmeranimated.ui.views.shimmer.CardItem
import com.ags.shimmeranimated.ui.views.shimmer.animatedBrush

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val brush: Brush = animatedBrush()
            ShimmerAnimatedTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                       repeat(5) { CardItem(brush) }
                    }
                }
            }
        }
    }
}