package dsk.altlombard.cabinet.android.compose.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dsk.altlombard.cabinet.android.compose.Greeting
import dsk.altlombard.cabinet.android.compose.ui.theme.CabinetComposeTheme

//выбор входа в приложение(по телефону или по номеру залогового билета)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CabinetComposeTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            EnteringResolve()
        }
    }
}

@Composable
fun EnteringResolve(){
    Column {
        TitleBlock()
        MainBlock()
    }
}

@Composable
fun TitleBlock(){
    Column {
        Text(
            text = "Авторизация"
        )
        Text(
            text = "Выберите способ для входа"
        )
    }
}

@Composable
fun MainBlock(){
    Column {
//        TextField(
//            value = "",
//            onValueChange = {}
//        )
        Button(
            onClick = { /* переход на страницу ввода залогового билета */ },
            modifier = Modifier.width(300.dp)
        )
        {
            Text("По номеру залогового билета")
        }
        Button(
            onClick = { /* переход на страницу ввода номера телефона */ },
            modifier = Modifier.width(300.dp)
        )
        {
            Text("По номеру телефона")
        }
    }

}