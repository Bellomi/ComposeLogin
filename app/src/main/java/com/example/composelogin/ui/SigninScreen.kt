package com.example.composelogin.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelogin.R

@Preview(showSystemUi = true)
@Composable
fun SigninScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(60.dp)
    ) {
        Title()
        Title2()
        Hash()
        SigninButton()

    }

}

@Composable
fun Title() {
    Text(
        text = stringResource(id = R.string.sign_in_text),
        style = MaterialTheme.typography.h1
    )
}

@Composable
fun Title2() {
    Text(
        text = stringResource(id = R.string.sign_in_tip),
        style = MaterialTheme.typography.h2

    )
}

@Composable
fun Hash() {
    val hashState = remember { mutableStateOf(TextFieldValue()) }
    TextField(
        value = hashState.value,
        onValueChange = { hashState.value = it },
        label = { Text(text = stringResource(R.string.hash_hint)) },
        shape = RoundedCornerShape(20.dp)
    )
}

@Composable
fun SigninButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Blue,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(20.dp),
    )
    {
        Text(
            text = stringResource(R.string.go)
        )
    }
}


