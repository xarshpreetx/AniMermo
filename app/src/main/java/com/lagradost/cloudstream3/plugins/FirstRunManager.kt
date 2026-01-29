package com.lagradost.cloudstream3.plugins

import android.content.Context
import android.util.Log
import com.lagradost.cloudstream3.CloudStreamApp.Companion.getKey
import com.lagradost.cloudstream3.CloudStreamApp.Companion.setKey

/**
 * Gerenciador de primeira inicialização do AnimeMesmo
 * 
 * Garante que na primeira execução do app, os repositórios e providers
 * fixos sejam automaticamente instalados.
 */
object FirstRunManager {
    private const val TAG = "FirstRunManager"
    private const val FIRST_RUN_COMPLETED_KEY = "ANIME_MESMO_FIRST_RUN_COMPLETED"
    private const val FIXED_REPOS_ADDED_KEY = "ANIME_MESMO_FIXED_REPOS_ADDED_V1"
    
    /**
     * Verifica se é a primeira execução do app
     */
    fun isFirstRun(): Boolean {
        return getKey(FIRST_RUN_COMPLETED_KEY, false) != true
    }
    
    /**
     * Marca a primeira execução como completa
     */
    fun markFirstRunCompleted() {
        setKey(FIRST_RUN_COMPLETED_KEY, true)
        Log.i(TAG, "First run completed and marked")
    }
    
    /**
     * Verifica se os repositórios fixos já foram adicionados
     */
    fun hasAddedFixedRepos(): Boolean {
        return getKey(FIXED_REPOS_ADDED_KEY, false) == true
    }
    
    /**
     * Marca os repositórios fixos como adicionados
     */
    fun markFixedReposAdded() {
        setKey(FIXED_REPOS_ADDED_KEY, true)
        Log.i(TAG, "Fixed repositories marked as added")
    }
    
    /**
     * Adiciona os repositórios fixos ao app
     * Esta função é chamada automaticamente na primeira execução
     */
    suspend fun ensureFixedRepositoriesAdded(context: Context) {
        if (hasAddedFixedRepos()) {
            Log.d(TAG, "Fixed repositories already added, skipping...")
            return
        }
        
        try {
            Log.i(TAG, "Adding fixed repositories for the first time...")
            
            // Os repositórios fixos agora são retornados automaticamente
            // pelo RepositoryManager.getRepositories()
            // Apenas marcamos como adicionados
            
            markFixedReposAdded()
            Log.i(TAG, "Fixed repositories successfully added")
        } catch (e: Exception) {
            Log.e(TAG, "Error adding fixed repositories: ${e.message}", e)
        }
    }
}
