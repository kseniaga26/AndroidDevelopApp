package ru.kseniaga.androiddevelopapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import ru.kseniaga.androiddevelopapp.R
import ru.kseniaga.androiddevelopapp.models.Title
import ru.kseniaga.androiddevelopapp.ui.theme.Pink80

@Composable fun TitleDetailScreen(title: Title, navController: NavController) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.padding(16.dp).verticalScroll(rememberScrollState())) {
        val painter = rememberAsyncImagePainter(title.imageUrl)
        Image(
            painter = painter,
            contentDescription = title.title_english,
            modifier = Modifier.size(300.dp).align(Alignment.CenterHorizontally)
        )
        Text(
            text = title.title_english,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color.Gray,
            fontFamily = FontFamily.Serif,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,

        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title.title_japanese,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontFamily = FontFamily.Serif,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Год выхода: " + title.year, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Тип: " + title.type, style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Количество эпизодов: " + title.episodes, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Статус: " + title.status, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Рейтинг: " + title.rating, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text ="Популярность: " + title.score, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text ="Студия: " + title.studios, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text ="Жанры: " + title.genres, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Описание: " + title.description, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif,)

    }

    androidx.compose.material.Button(
        onClick = { navController.popBackStack() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Pink80
        )
    ) {
        androidx.compose.material.Text(
            text = "Назад",
            color = Color.Black
        )
    }
}

