package com.coderroots.mbatchcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertDialog : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       setContent {
           alertDialog()
       }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun alertDialog(){
    val context = LocalContext.current
    var showDialog by remember {mutableStateOf(false)}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { showDialog = true },
        ) {
            Text("Open Dialog")
        }
    }

    if(showDialog){
        AlertDialog(
            onDismissRequest = {
                showDialog = false
            },
            title = {
                Text(text = "Dialog Box")
            },

            text = { Text(text = "Are you sure you want to proceed?")},

            confirmButton = {
                TextButton(onClick = {
                    showDialog = false
                    
                    Toast.makeText(context, "Confirm Button Clicked", Toast.LENGTH_SHORT).show()
                }) {
                    Text("Confirm")
                }
            },

            dismissButton = {
                TextButton(onClick = {
                    showDialog = false
                    Toast.makeText(context, "Dismiss Button Clicked", Toast.LENGTH_SHORT).show()

                }) {
                    Text("Dismiss")
                }
            }


        )
    }
}