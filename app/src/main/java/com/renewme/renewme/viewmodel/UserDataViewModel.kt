package com.renewme.renewme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class UserDataViewModel : ViewModel() {
    // State değişkenleri
    var addiction by mutableStateOf("")
    var age by mutableStateOf("")
    var weight by mutableStateOf("")
    var height by mutableStateOf("")
    var support by mutableStateOf("")

    // Ayırıcı `set` fonksiyonlarını kaldırıyoruz ve doğrudan özelliklere erişim sağlıyoruz.
}
