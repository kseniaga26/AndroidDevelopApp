package ru.kseniaga.androiddevelopapp.viewModels

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter

import ru.kseniaga.androiddevelopapp.models.Title

@Composable
fun TitleItem(title: Title, onClick: () -> Unit) {

    androidx.compose.material3.ListItem(
        modifier = Modifier
            .padding(8.dp).shadow(10.dp).clip(
                RoundedCornerShape(10.dp)
            ),
        headlineContent = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberAsyncImagePainter(title.imageUrl),
                    contentDescription = title.title_english,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(end = 8.dp)
                )
                Column(modifier = Modifier.weight(1f).clickable(onClick = onClick)) {
                    Text(text = title.title_english, style = MaterialTheme.typography.headlineSmall, fontFamily = FontFamily.Serif,fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,)
                    Text(text = "${title.score}", style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Serif)
                }
            }
        }
    )
}