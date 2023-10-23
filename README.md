# Desafio GitHub Search

## Introdução

O "Desafio GitHub Search" é um projeto Android que visa criar um aplicativo simples para armazenar o nome de usuário do GitHub e listar todos os seus repositórios públicos. Além disso, ele permite a redefinição do nome de usuário para facilitar a busca de diferentes perfis do GitHub.

## Objetivo

O objetivo deste desafio é criar um aplicativo Android que demonstra a capacidade de interagir com a API do GitHub, armazenar informações do usuário localmente e listar os repositórios públicos associados a esse usuário.

## Funcionalidades Principais

- **Armazenar o Nome de Usuário:** O aplicativo permite ao usuário inserir o nome de usuário do GitHub em uma tela inicial.

- **Persistência de Dados:** O nome de usuário inserido é armazenado localmente, de forma que seja preservado mesmo quando o aplicativo é fechado.

- **Listagem de Repositórios:** O aplicativo faz uma chamada à API do GitHub para recuperar todos os repositórios públicos associados ao nome de usuário fornecido.

- **Compartilhar Repositório:** Os repositórios são exibidos em uma lista e, ao tocar em um deles, o usuário pode compartilhar o link do repositório com outras pessoas.

- **Abrir no Navegador:** Além de compartilhar, o usuário também pode clicar em um repositório para abri-lo diretamente no navegador.

- **Redefinir Nome de Usuário:** Existe a opção de redefinir o nome de usuário, o que permite buscar por diferentes perfis do GitHub.

## Tecnologias Utilizadas

- **Android:** O aplicativo é desenvolvido para a plataforma Android.

- **Retrofit:** É utilizado para realizar as chamadas à API do GitHub.

- **RecyclerView:** É usado para exibir a lista de repositórios em uma interface de rolagem.

- **SharedPreferences:** É empregado para armazenar o nome de usuário localmente.

## Instruções de Uso

1. Ao iniciar o aplicativo, o usuário pode inserir seu nome de usuário do GitHub na tela inicial.

2. O nome de usuário fornecido será armazenado localmente e persistido, permitindo que o usuário acesse facilmente seu perfil em futuras sessões.

3. Ao confirmar o nome de usuário, o aplicativo fará uma chamada à API do GitHub para recuperar todos os repositórios públicos associados a esse perfil.

4. Os repositórios são exibidos em uma lista, onde o usuário pode tocar em um repositório para compartilhar seu link ou abrir o repositório no navegador.

5. Caso deseje buscar por um perfil diferente, o usuário tem a opção de redefinir o nome de usuário a qualquer momento.

## Conclusão

O "Desafio GitHub Search" é um projeto Android simples, mas funcional, que demonstra a capacidade de interagir com uma API externa, armazenar dados localmente e proporcionar uma experiência de usuário amigável. Ele pode ser usado como uma base para a expansão de recursos ou como um exercício de aprendizado em desenvolvimento Android.
