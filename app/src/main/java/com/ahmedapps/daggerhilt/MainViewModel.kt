package com.ahmedapps.daggerhilt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmedapps.daggerhilt.domain.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("api1") private val repository: Repository,
    @Named("api2") private val repository2: Repository
) : ViewModel() {

    init {
        viewModelScope.launch {
            repository.makeAPICall()
        }

        viewModelScope.launch {
            repository2.makeAPICall()
        }
    }

}