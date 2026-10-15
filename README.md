# SorteioJusto (sorteio-times)

Uma aplicação de gerenciamento e geração equilibrada de times desenvolvida para organizar partidas esportivas ("peladas"), distribuindo atletas de forma justa entre as equipes com base em classificações individuais de habilidade e coeficientes individuais de rendimento (CIR).

---

## Sumário
- [Visão Geral](#visão-geral)
- [Stack Tecnológica](#stack-tecnológica)
- [Requisitos](#requisitos)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Primeiros Passos](#primeiros-passos)
  - [Build](#build)
  - [Executando a Aplicação](#executando-a-aplicação)
- [Scripts e Comandos Disponíveis](#scripts-e-comandos-disponíveis)
- [Testes](#testes)
- [Variáveis de Ambiente e Configuração](#variáveis-de-ambiente-e-configuração)
- [Licença](#licença)
- [TODOs e Roadmap](#todos-e-roadmap)

---

## Visão Geral

O **SorteioJusto** (`sorteio-times`) fornece um mecanismo de sorteio e balanceamento de times para partidas casuais:
- **Atleta**: Representa um jogador com nome e um ranking associado (`ERank`).
- **ERank**: Enum que define os níveis de habilidade dos jogadores (`A`, `B`, `C`, `D`) e seus respectivos Coeficientes Individuais de Rendimento (CIR: `A=1`, `B=2`, `C=3`, `D=4`).
- **Time**: Representa uma equipe formada, contendo atletas e calculando a soma dos coeficientes da equipe.
- **Pelada**: Gerencia a criação das equipes, lista de jogadores e o balanceamento dos times.

---

## Stack Tecnológica

- **Linguagem**: Java 25 (configurado na propriedade `java.version` do `pom.xml`)
- **Framework**: Spring Boot 4.1.1 (parent Maven `spring-boot-starter-parent`)
  - `spring-boot-starter-webmvc`
  - `spring-boot-starter-validation`
  - `spring-boot-devtools` (runtime)
- **Gerenciador de Pacotes & Ferramenta de Build**: Apache Maven (inclui Maven Wrapper `mvnw` / `mvnw.cmd`)
- **Testes**: JUnit 5 via starters de teste do Spring Boot (`spring-boot-starter-webmvc-test`, `spring-boot-starter-validation-test`)

---

## Requisitos

- **Java Development Kit (JDK)**: JDK 25 ou versão compatível
- **Maven**: Versão 3.8+ (opcional se utilizar o wrapper `./mvnw` / `mvnw.cmd` incluso)

---

## Estrutura do Projeto

```text
SorteioJusto/
├── README.md                                             # Documentação do repositório
└── sorteio-times/                                        # Módulo do projeto Spring Boot
    ├── HELP.md                                           # Guia de ajuda do Spring Boot
    ├── mvnw                                              # Script do Maven wrapper (Unix/Linux/macOS)
    ├── mvnw.cmd                                          # Script do Maven wrapper (Windows)
    ├── pom.xml                                           # Configuração de build e dependências do Maven
    └── src/
        ├── main/
        │   ├── java/
        │   │   └── com/devarthuraugusto/sorteiotimes/
        │   │       ├── SorteioTimesApplication.java      # Ponto de entrada principal da aplicação
        │   │       └── model/
        │   │           ├── Atleta.java                   # Modelo de Atleta
        │   │           ├── ERank.java                    # Enum de ranking de habilidade e mapeamento CIR
        │   │           ├── Pelada.java                   # Modelo da partida e gerenciamento de times
        │   │           └── Time.java                     # Modelo do time e cálculos da equipe
        │   └── resources/
        │       └── application.properties                # Arquivo de propriedades do Spring Boot
        └── test/
            └── java/
                └── com/devarthuraugusto/sorteiotimes/
                    └── SorteioTimesApplicationTests.java # Carregamento de contexto e testes unitários
```

---

## Primeiros Passos

Navegue até o diretório do módulo do projeto:
```bash
cd sorteio-times
```

### Build

Para compilar o projeto e empacotá-lo em um arquivo JAR:

- **Linux / macOS**:
  ```bash
  ./mvnw clean package
  ```

- **Windows**:
  ```cmd
  mvnw.cmd clean package
  ```

### Executando a Aplicação

#### Ponto de Entrada Principal
- Classe: `com.devarthuraugusto.sorteiotimes.SorteioTimesApplication`
- Caminho: `sorteio-times/src/main/java/com/devarthuraugusto/sorteiotimes/SorteioTimesApplication.java`

#### Executar via Maven Wrapper
- **Linux / macOS**:
  ```bash
  ./mvnw spring-boot:run
  ```

- **Windows**:
  ```cmd
  mvnw.cmd spring-boot:run
  ```

#### Executar via JAR Empacotado
```bash
java -jar target/sorteio-times-0.0.1-SNAPSHOT.jar
```

---

## Scripts e Comandos Disponíveis

Todos os comandos devem ser executados dentro da pasta `sorteio-times`:

| Comando (Linux/macOS) | Comando (Windows) | Descrição |
|---|---|---|
| `./mvnw clean compile` | `mvnw.cmd clean compile` | Compila os arquivos de código-fonte principais. |
| `./mvnw test` | `mvnw.cmd test` | Executa a suíte de testes. |
| `./mvnw clean package` | `mvnw.cmd clean package` | Empacota a aplicação em um artefato `.jar` em `target/`. |
| `./mvnw spring-boot:run` | `mvnw.cmd spring-boot:run` | Inicia a aplicação Spring Boot. |

---

## Testes

Execute os testes unitários utilizando o Maven wrapper:

- **Linux / macOS**:
  ```bash
  ./mvnw test
  ```

- **Windows**:
  ```cmd
  mvnw.cmd test
  ```

Localização da suíte de testes: `sorteio-times/src/test/java/com/devarthuraugusto/sorteiotimes/SorteioTimesApplicationTests.java`

---

## Variáveis de Ambiente e Configuração

A aplicação é configurada através de `sorteio-times/src/main/resources/application.properties`.

Configuração padrão atual:
```properties
spring.application.name=sorteio-times
```

- TODO: Documentar variáveis de ambiente personalizadas (ex.: credenciais de banco de dados, porta do servidor, chaves de APIs externas) conforme novas funcionalidades forem integradas.

---

## Licença

- TODO: Especificar a licença do projeto (ex.: MIT, Apache 2.0 ou Proprietária). Atualmente nenhuma licença está definida no `pom.xml`.

---

## TODOs e Roadmap

- [ ] Concluir o algoritmo de sorteio e balanceamento de times em `Pelada.java`.
- [ ] Adicionar endpoints/controllers REST para gerenciar atletas, times e sorteios.
- [ ] Implementar persistência de dados (ex.: Spring Data JPA com PostgreSQL / H2).
- [ ] Criar testes unitários e de integração abrangentes para a lógica de balanceamento dos times.
- [ ] Adicionar suporte a Dockerfile / conteinerização.