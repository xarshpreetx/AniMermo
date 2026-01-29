package com.lagradost.cloudstream3.plugins

import com.lagradost.cloudstream3.ui.settings.extensions.RepositoryData

/**
 * Configuração de repositórios fixos para o AnimeMesmo
 * 
 * Estes repositórios são pré-configurados e sempre disponíveis no app.
 * Os usuários não podem removê-los através da interface.
 */
object FixedRepositories {
    
    /**
     * Lista de repositórios fixos que serão sempre carregados no app
     */
    val FIXED_REPOS = arrayOf(
        // Mega Repository - Contém múltiplos providers
        RepositoryData(
            iconUrl = "https://avatars.githubusercontent.com/u/69831008",
            name = "Mega Repository",
            url = "https://raw.githubusercontent.com/self-similarity/MegaRepo/builds/repo.json"
        ),
        
        // lietrepo - Repositório brasileiro com AnimeFire, AniTube, etc
        RepositoryData(
            iconUrl = "https://github.com/lawlietbr.png",
            name = "lietrepo",
            url = "https://raw.githubusercontent.com/lawlietbr/lietrepo/refs/heads/main/builds/repo.json"
        )
    )
    
    /**
     * Plugin fixo principal - AnimeFire
     * Este é o provider principal que será sempre habilitado
     */
    const val PRIMARY_PROVIDER = "AnimeFire"
    
    /**
     * URL do repositório que contém o provider principal
     */
    const val PRIMARY_PROVIDER_REPO = "https://raw.githubusercontent.com/lawlietbr/lietrepo/refs/heads/main/builds/repo.json"
    
    /**
     * Lista de providers que devem ser baixados automaticamente
     * Além do AnimeFire, você pode adicionar outros aqui
     */
    val AUTO_DOWNLOAD_PROVIDERS = listOf(
        PRIMARY_PROVIDER,
        // Adicione outros providers aqui se quiser, por exemplo:
        // "AniTube",
        // "Goyabu",
    )
}
