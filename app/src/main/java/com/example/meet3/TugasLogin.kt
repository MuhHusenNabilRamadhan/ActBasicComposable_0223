package com.example.meet3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    // ===== GAMBAR 1: Background (foto masjid, memenuhi layar) =====
    // Simpan di res/drawable dengan nama: bg_masjid.jpg
    val gambarBackground = painterResource(id = R.drawable.images)

    // ===== GAMBAR 2: Logo kampus (UMY) =====
    // Simpan di res/drawable dengan nama: logo_umy.png
    val gambarLogo = painterResource(id = R.drawable.logo_umy)

    // ===== GAMBAR 3: Foto Kabah (di dalam lingkaran bawah) =====
    // Simpan di res/drawable dengan nama: foto_kabah.jpg
    val gambarKementrian = painterResource(id = R.drawable.logo_kementrian)


}