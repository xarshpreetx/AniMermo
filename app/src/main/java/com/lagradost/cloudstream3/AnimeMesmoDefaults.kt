package com.lagradost.cloudstream3

import android.content.Context
import android.content.SharedPreferences
import com.lagradost.cloudstream3.CloudStreamApp.Companion.getKey
import com.lagradost.cloudstream3.CloudStreamApp.Companion.setKey
import com.lagradost.cloudstream3.utils.DataStoreHelper

/**
 * Configurações padrão do AnimeMesmo
 * Define todas as configurações para um app dedicado ao AnimeFire
 */
object AnimeMesmoDefaults {
    
    private const val DEFAULTS_APPLIED_KEY = "ANIME_MESMO_DEFAULTS_APPLIED_V1"
    
    /**
     * Aplica as configurações padrão do AnimeMesmo
     * Chamado na primeira execução do app
     */
    fun applyDefaults(context: Context) {
        val settingsManager = context.getSharedPreferences("rebuild_preference", Context.MODE_PRIVATE)
        val editor = settingsManager.edit()
        
        // 1. Definir idioma como PT-BR
        editor.putString(context.getString(R.string.locale_key), "pt-br")
        
        // 2. Desabilitar auto-update de plugins
        editor.putBoolean(context.getString(R.string.auto_update_plugins_key), false)
        
        // 3. Desabilitar download automático de plugins
        editor.putInt(context.getString(R.string.auto_download_plugins_key), 0) // Disable
        
        // 4. Layout padrão: Auto
        editor.putInt(context.getString(R.string.app_layout_key), 0) // Auto
        
        // 5. Marcar setup como completo
        setKey("HAS_DONE_SETUP_KEY", true)
        
        // 6. Definir tipo de mídia preferido como Anime
        val tvTypeSet = setOf(TvType.Anime.ordinal.toString())
        editor.putStringSet(context.getString(R.string.prefer_media_type_key), tvTypeSet)
        
        // 7. Desabilitar notificações de atualização
        editor.putBoolean("show_update_notification", false)
        
        editor.apply()
        
        // 8. Garantir AnimeFire como provider padrão
        setAnimeFirAsDefault()
    }
    
    /**
     * Define AnimeFire como homepage padrão
     */
    fun setAnimeFirAsDefault() {
        setKey("USER_SELECTED_HOMEPAGE_API", "AnimeFire")
        DataStoreHelper.currentHomePage = "AnimeFire"
    }
}
