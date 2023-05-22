package com.reza.pokeapiandroid.di

import com.chuckerteam.chucker.api.ChuckerInterceptor
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

object InjectionModules {

    fun getModules() = listOf(network, dataSource, repository, useCases, viewModels)

    private val network = module {
        single { ChuckerInterceptor.Builder(androidContext()).build() }
        //single { PulsaApiService.invoke(get()) }
    }
    private val dataSource = module {
        //single<PulsaNetworkDataSource> { PulsaNetworkDataSourceImpl(get()) }
    }
    private val repository = module {
        //single<PulsaRepository> { PulsaRepositoryImpl(get()) }
    }
    private val useCases = module {
        /*single { GetPulsaUseCase(get(), dispatcher = Dispatchers.IO) }
        single { GetVoucherUseCase(get(), dispatcher = Dispatchers.IO) }
        single { GetStatusUseCase(get(), dispatcher = Dispatchers.IO) }*/
    }
    private val viewModels = module {
        /*viewModelOf(::PulsaViewModel)
        viewModelOf(::VoucherViewModel)
        viewModelOf(::StatusViewModel)*/
    }
}