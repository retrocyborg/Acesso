package com.acesso60

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.acesso60.ui.screens.AssistanceScreen
import com.acesso60.ui.theme.Acesso60Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Acesso60Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AssistanceScreen()
                }
            }
        }
    }
}
