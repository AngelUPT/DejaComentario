package com.angelcorrea.dejacomentario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angelcorrea.dejacomentario.ui.theme.DejaComentarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DejaComentarioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text("Deja un comentario", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.align(
            Alignment.CenterHorizontally))
        Text("Nombre")
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth())
        Text("Email")
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth())
        Text("Comentario")
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().height(150.dp), singleLine = false, maxLines = 4)
        Button(onClick = {}, modifier = Modifier.align(
            Alignment.CenterHorizontally)) {
            Text("Enviar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DejaComentarioTheme {
        Greeting("Android")
    }
}