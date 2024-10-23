package ru.kseniaga.androiddevelopapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import ru.kseniaga.androiddevelopapp.viewModels.TitleList
import ru.kseniaga.androiddevelopapp.viewModels.getDataBase


@Composable
fun TitlesListScreen(modifier: Modifier, navController: NavHostController) {
    val titleList = getDataBase();

    androidx.compose.material.Surface(modifier = modifier.fillMaxSize()) {
        TitleList(titleList = titleList) { selectedTitle ->
            navController.navigate("TitleDetail/${selectedTitle.id}")
        }
    }
    }
