package com.reza.pokeapiandroid

import android.app.Application
import com.reza.pokeapiandroid.di.InjectionModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@Application)
            modules(InjectionModules.getModules())
        }
    }
}