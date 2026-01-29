<div align="center">

# 🌸 AniMermo

<img src="app/src/main/ic_launcher-playstore.png" width="200" height="200" alt="AniMermo"/>

### Aplicativo Android Open Source para Streaming de Animes

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](LICENSE)
[![Android](https://img.shields.io/badge/Android-6.0%2B-green.svg)](https://android.com)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)

**Um fork especializado do Cloudstream3 focado na comunidade brasileira de animes**

[📥 Download](#-instalação) • [🚀 Começar](#-início-rápido) • [🤝 Contribuir](#-contribuindo) • [📖 Wiki](../../wiki)

</div>

---

## 📱 Sobre o Projeto

AniMermo é uma interface de streaming de animes de código aberto, construída sobre o [Cloudstream3](https://github.com/recloudstream/cloudstream). Focado em proporcionar a melhor experiência para usuários brasileiros, com:

- 🎌 **Conteúdo Anime**: Interface otimizada exclusivamente para animes
- 🇧🇷 **PT-BR Nativo**: Totalmente em português brasileiro por padrão
- 🎨 **Design Único**: Visual personalizado com tema de flor de cerejeira
- 👥 **Perfis Múltiplos**: Sistema tipo Netflix para toda a família
- 🔐 **Privacidade**: PIN opcional por perfil
- 🚀 **Zero Config**: Funciona imediatamente após instalação

## ✨ Características

### 🎯 Principais
- **Provider Anime Integrado**: AnimeFire pré-configurado
- **Sistema de Perfis**: Múltiplos usuários com histórico independente
- **Proteção por PIN**: Segurança opcional de 4 dígitos por perfil
- **Interface Brasileira**: PT-BR como idioma padrão
- **Visual Personalizado**: Tema único com flor de cerejeira neon
- **Experiência Simplificada**: Sem configurações complicadas

### 🔧 Técnicas
- Baseado em Cloudstream3 (fork otimizado)
- Repositórios fixos para estabilidade
- Suporte Android 6.0+ (API 23)
- Arquitetura MVVM
- Kotlin nativo
- Material Design 3

### 🚫 Simplificações

Por design, algumas funcionalidades foram removidas para focar na experiência do usuário:

| Removido | Motivo |
|----------|--------|
| Setup Wizard | Configuração automática |
| Gerenciamento de Repos | Repos fixos e estáveis |
| Sistema de Updates | Controle manual via GitHub |
| Contas Externas (MAL/Kitsu) | Foco em watch history local |
| Múltiplos Providers | AnimeFire otimizado |

---

## 📥 Instalação

### Método 1: APK Pré-compilado (Recomendado)

1. **Baixe** a [última versão](../../releases/latest)
2. **Habilite** instalação de fontes desconhecidas:
   - Configurações → Segurança → Fontes Desconhecidas
3. **Instale** o APK baixado
4. **Abra** e crie seu perfil

### Método 2: Compilar do Código

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/AniMermo.git
cd AniMermo

# Configure Java 17
export JAVA_HOME=$(/usr/libexec/java_home -v 17)  # macOS
# ou defina JAVA_HOME manualmente no Linux/Windows

# Compile
./gradlew assembleDebug

# APK gerado em:
# app/build/outputs/apk/stable/debug/app-stable-debug.apk
```

### ⚙️ Requisitos

| Componente | Versão Mínima |
|------------|---------------|
| Android OS | 6.0 (API 23) |
| Espaço Livre | ~100MB |
| RAM | 2GB+ |

---

## � Início Rápido

### Para Usuários

1. Baixe e instale o APK
2. Abra o app
3. Clique em "+" para criar um perfil
4. (Opcional) Configure um PIN de 4 dígitos
5. Comece a assistir seus animes favoritos!

### Para Desenvolvedores

```bash
# 1. Fork e clone
git clone https://github.com/seu-usuario/AniMermo.git

# 2. Abra no Android Studio
# File → Open → Selecione a pasta do projeto

# 3. Sincronize o Gradle
# Aguarde o sync automático ou clique em "Sync Now"

# 4. Execute
# Run → Run 'app' ou Shift+F10
```

---

## 🛠️ Desenvolvimento

### Requisitos de Build

| Ferramenta | Versão |
|------------|--------|
| Java/JDK | 17 |
| Gradle | 9.2.1 |
| Android SDK | API 33+ |
| Kotlin | 1.9+ |

### Comandos Úteis

```bash
# Compilar debug
./gradlew assembleDebug

# Compilar release (requer keystore)
./gradlew assembleRelease

# Executar testes
./gradlew test

# Limpar build
./gradlew clean

# Instalar via ADB
adb install -r app/build/outputs/apk/stable/debug/app-stable-debug.apk
```

### Estrutura de Branches

- `main` - Produção estável
- `develop` - Desenvolvimento ativo
- `feature/*` - Novas funcionalidades
- `fix/*` - Correções de bugs

---

## 📂 Estrutura do Projeto

```
AniMermo/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/lagradost/cloudstream3/
│   │   │   │   ├── AnimeMesmoDefaults.kt      # Configurações padrão
│   │   │   │   ├── MainActivity.kt            # Activity principal
│   │   │   │   ├── plugins/
│   │   │   │   │   ├── FixedRepositories.kt   # Repositórios fixos
│   │   │   │   │   └── FirstRunManager.kt     # Primeira execução
│   │   │   │   └── ui/
│   │   │   │       └── account/
│   │   │   │           └── AccountSelectActivity.kt  # Perfis
│   │   │   └── res/                           # Recursos Android
│   │   ├── debug/                             # Variante debug
│   │   └── prerelease/                        # Variante prerelease
│   └── build.gradle.kts                       # Config do módulo app
├── library/                                    # Biblioteca core Cloudstream
├── gradle/                                     # Wrapper do Gradle
├── LICENSE                                     # GPL-3.0
└── README.md                                   # Este arquivo
```

### Arquivos Chave

| Arquivo | Propósito |
|---------|-----------|
| `AnimeMesmoDefaults.kt` | Aplica configurações padrão (PT-BR, AnimeFire, etc.) |
| `FixedRepositories.kt` | Define repositórios e providers fixos |
| `AccountSelectActivity.kt` | Gerencia sistema de perfis estilo Netflix |
| `MainActivity.kt` | Inicialização e configuração do app |

---

## 🤝 Contribuindo

Contribuições são muito bem-vindas! Veja como você pode ajudar:

### 🐛 Reportar Bugs

1. Verifique se o bug já foi reportado nas [Issues](../../issues)
2. Use o template de bug report
3. Inclua passos para reproduzir
4. Adicione screenshots se possível

### ✨ Sugerir Features

1. Abra uma [Issue](../../issues/new)
2. Descreva a funcionalidade detalhadamente
3. Explique por que seria útil
4. Adicione mockups se tiver

### 💻 Pull Requests

1. Fork o projeto
2. Crie uma branch (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Add: Minha feature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

### 📋 Diretrizes

- Siga o estilo de código Kotlin existente
- Adicione comentários em código complexo
- Teste suas mudanças
- Atualize a documentação se necessário
- Commits em português ou inglês

---

## 🗺️ Roadmap

### v1.0.0 (Atual)
- [x] Sistema de perfis
- [x] Provider AnimeFire
- [x] Interface em PT-BR
- [x] Design personalizado

### v1.1.0 (Próximo)
- [ ] Sistema de favoritos melhorado
- [ ] Notificações de novos episódios
- [ ] Modo offline/download
- [ ] Temas personalizáveis

### v1.2.0 (Futuro)
- [ ] Sincronização entre dispositivos
- [ ] Suporte a Chromecast
- [ ] Widget para tela inicial
- [ ] Modo picture-in-picture

---

## 🎨 Personalização

### Repositórios Fixos

Configurados em `app/src/main/java/.../plugins/FixedRepositories.kt`:

```kotlin
val FIXED_REPOS = listOf(
    RepositoryData("https://megarepo.cloud/cloudstream/repo/"),
    RepositoryData("https://raw.githubusercontent.com/lietrepo/lietrepo/main/")
)

val AUTO_DOWNLOAD_PROVIDERS = setOf("AnimeFire")
```

### Configurações Padrão

Definidas em `app/src/main/java/.../AnimeMesmoDefaults.kt`:

```kotlin
fun applyDefaults(context: Context) {
    setKey(AUTO_SELECT_SUBTITLES_SETTINGS_KEY, true)
    setKey(PREFER_MEDIA_TYPE_KEY, 1) // Anime
    setKey(LOCALE_KEY, "pt-BR")
    // ... mais configurações
}
```

---

## 🤝 Créditos e Agradecimentos

### Projeto Base
Este projeto é um fork do excelente [Cloudstream-3](https://github.com/recloudstream/cloudstream) desenvolvido pela equipe Cloudburst. Agradecemos imensamente pelo trabalho incrível que tornou este projeto possível.

### Contributors
Um obrigado especial a todos que contribuem com código, reportam bugs, e ajudam a melhorar o AniMermo.

### Comunidade
Agradecemos à comunidade brasileira de animes por testar e dar feedback contínuo.

---

## 📜 Licença

Este projeto está licenciado sob a GNU General Public License v3.0 - veja o arquivo [LICENSE](LICENSE) para detalhes.

```
AniMermo - Interface de Streaming de Animes
Copyright (C) 2026

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
```

---

## ⚠️ Disclaimer

**IMPORTANTE**: AniMermo é apenas uma interface de streaming que agrega links de terceiros. 

- ❌ **NÃO** hospedamos nenhum conteúdo
- ❌ **NÃO** distribuímos material protegido por direitos autorais
- ❌ **NÃO** somos responsáveis pelo conteúdo de provedores externos
- ✅ Somos apenas uma interface de código aberto

Use por sua conta e risco. Recomendamos o uso de serviços legais de streaming sempre que possível.

---

## 🙏 Apoie o Projeto

Se este projeto foi útil para você, considere:

- ⭐ Dar uma estrela no repositório
- 🐛 Reportar bugs e problemas
- 💡 Sugerir novas funcionalidades
- 🔀 Fazer um fork e contribuir
- 📢 Compartilhar com outros desenvolvedores

---

## 📞 Contato e Suporte

- **Issues**: [GitHub Issues](../../issues)
- **Discussões**: [GitHub Discussions](../../discussions)
- **Wiki**: [Documentação](../../wiki)

---

## 📊 Status do Projeto

<div align="center">

![GitHub stars](https://img.shields.io/github/stars/seu-usuario/AniMermo?style=social)
![GitHub forks](https://img.shields.io/github/forks/seu-usuario/AniMermo?style=social)
![GitHub issues](https://img.shields.io/github/issues/seu-usuario/AniMermo)
![GitHub pull requests](https://img.shields.io/github/issues-pr/seu-usuario/AniMermo)

</div>

---

<div align="center">

### 💜 Feito com amor para a comunidade anime brasileira

**[⬆ Voltar ao topo](#-animermo)**

</div>


1. **UI/UX**:
   - Ícone personalizado (flor de cerejeira neon)
   - Nome alterado para "AniMermo"
   - Interface simplificada
   - Remoção de opções avançadas

2. **Funcionalidades**:
   - Repositórios fixos (não editáveis pelo usuário)
   - Provider AnimeFire pré-configurado
   - Setup wizard desabilitado
   - Sistema de perfis implementado

3. **Limpeza**:
   - Removida documentação original
   - Removidos CI/CD configs
   - Removidas pastas não utilizadas

---

## 🤝 Créditos

Baseado no excelente [Cloudstream-3](https://github.com/recloudstream/cloudstream) desenvolvido pela equipe Cloudburst.

---

## 📜 Licença

Este projeto mantém a licença original do Cloudstream3:

```
GNU General Public License v3.0
```

Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## ⚠️ Aviso Legal

Este aplicativo é apenas uma interface de streaming. O conteúdo é fornecido por provedores de terceiros. Os desenvolvedores não hospedam nem distribuem conteúdo e não são responsáveis pelo conteúdo disponível através da aplicação.

---

<div align="center">
  <p>Feito com 💜 para a comunidade anime brasileira</p>
</div>
