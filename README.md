# Projeto Java RMI - Seleção de Personagens e Golpes

Este projeto é uma demonstração de como usar o Java RMI (Remote Method Invocation) para criar uma aplicação distribuída que permite aos usuários selecionar personagens e golpes para um jogo fictício.

## Visão Geral

O projeto é dividido em três componentes principais:

1. **Cliente (Client.java):**
    - Responsável por interagir com o usuário.
    - Permite que os usuários insiram seus nomes, escolham personagens e golpes.
    - Comunica-se com o servidor RMI para obter informações sobre personagens e golpes disponíveis.

2. **Interface Remota (PersonSelect.java):**
    - Define a interface remota que os métodos devem seguir.
    - Inclui métodos como `setUserName`, `listarPersonagens`, `listarGolpesPersonagens` e `frasePhrase`.

3. **Servidor (Servidor.java e PersonSelectMethods.java):**
    - O servidor registra o serviço RMI e faz a ligação com a implementação `PersonSelectMethods`.
    - `PersonSelectMethods` é a implementação dos métodos definidos na interface `PersonSelect`.
    - Armazena informações sobre personagens e golpes disponíveis e fornece métodos para obter essas informações com base nas escolhas do cliente.

## Executando o Projeto

Siga estas etapas para executar o projeto:

1. Compile todas as classes no projeto.
2. Inicie o servidor executando a classe `Servidor`. Certifique-se de que o servidor esteja em execução antes de iniciar os clientes.
3. Inicie os clientes para que os jogadores possam fazer suas escolhas.

Certifique-se de que todas as classes e interfaces necessárias estão no classpath para garantir o funcionamento adequado do projeto.

---

Este README fornece uma visão geral do projeto e instruções para executá-lo .