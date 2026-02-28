package com.coderroots.mbatchcompose

import android.R.style.Theme
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.coderroots.mbatchcompose.ui.theme.MbatchComposeTheme

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                SignUpScreen()

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text = "Welcome to SignUp Screen",
                modifier = Modifier.padding(24.dp),
                fontWeight = Bold,
                fontSize = 30.sp)
            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                placeholder = {
                    Text(text = "Enter name")
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                placeholder = {
                    Text(text = "Enter Phone Number")
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                placeholder = {
                    Text(text = "Enter Email")
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                placeholder = {
                    Text(text = "Enter Password")
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                placeholder = {
                    Text(text = "Confirm Password")
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {

                }
            ) {
                Text(text = "Signup")
            }

        }
    }
}
