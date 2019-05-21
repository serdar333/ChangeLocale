package com.example.changelocale

import android.content.Context
import android.content.res.Configuration
import android.os.Build
import java.util.*

object ActivityController {

    fun createUpdateLocaleContext(c: Context, languageCode: String): Context {
        val locale = Locale(languageCode)

        return updateResources(c, locale)
    }

    private fun updateResources(context: Context, locale: Locale): Context {
        var newcontext = context
        Locale.setDefault(locale)

        val res = context.resources
        val config = Configuration(res.configuration)

        config.setLocale(locale)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            newcontext = context.createConfigurationContext(config)
        } else {
            res.updateConfiguration(config, res.displayMetrics)
        }

        return newcontext
    }
}