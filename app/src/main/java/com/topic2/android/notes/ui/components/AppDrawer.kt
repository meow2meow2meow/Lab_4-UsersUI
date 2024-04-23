package com.topic2.android.notes.ui.components



import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.theme.NotesTheme
import com.topic2.android.notes.routing.NotesRouter
import com.topic2.android.notes.routing.Screen
import com.topic2.android.notes.theme.NotesThemeSettings

@Composable
private fun AppDrawerHeader(){
    Row(modifier = Modifier.fillMaxWidth()){
        Image(imageVector = Icons.Filled.Menu,
            contentDescription = "Drawer Header Icon",
            colorFilter = ColorFilter
                .tint(MaterialTheme.colors.onSurface),
            modifier = Modifier.padding(16.dp)
        )
        Text(text = "Заметки",
            modifier = Modifier
                .align(alignment = Alignment.CenterVertically))
    }

}

@Preview
@Composable
fun AppDrawerHeaderPreview(){
    NotesTheme{
        AppDrawerHeader()
    }
}