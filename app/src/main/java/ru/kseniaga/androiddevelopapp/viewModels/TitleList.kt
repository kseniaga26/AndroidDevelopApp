package ru.kseniaga.androiddevelopapp.viewModels

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import ru.kseniaga.androiddevelopapp.models.Title

@Composable
fun TitleList(titleList: List<Title>, onTitleClick: (Title) -> Unit) {
    LazyColumn {
        items(titleList) { title ->
            TitleItem(title = title, onClick = { onTitleClick(title) });
        }
    }
}



