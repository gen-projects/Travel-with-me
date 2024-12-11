# Aplicativo de Caronas Compartilhadas

### Introdução
- Plataforma de intermediação entre motoristas e passageiros, focada em mobilidade sustentável e redução de custos de deslocamento.
- O aplicativo de caronas compartilhadas é uma solução digital que conecta motoristas com vagas disponíveis em seus veículos a passageiros
que desejam compartilhar uma rota em comum.<br>
- O objetivo principal é promover a mobilidade sustentável, reduzir custos de deslocamento e 
minimizar o impacto ambiental ao diminuir o número de veículos em circulação.
<br>

<h2><strong>Estrutura do Projeto</strong></h2>
<table>
  <thead>
    <tr>
      <th>Camada</th>
      <th>Elementos</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Model</strong></td>
      <td>Usuário, ViagemModel, CategoriaModel</td>
    </tr>
    <tr>
      <td><strong>Repository</strong></td>
      <td>UsuarioRepository, ViagemRepository, CategoriaRepository</td>
    </tr>
    <tr>
      <td><strong>Service</strong></td>
      <td>UsuarioService, ViagemService, CategoriaService</td>
    </tr>
    <tr>
      <td><strong>Controller</strong></td>
      <td>UsuarioController, ViagemController, CategoriaController, </td>
    </tr>
  </tbody>
</table>

<br>

## Documentação de Testes de API - Sistema de Viagens

Este repositório contém os testes realizados para a API de gerenciamento de viagens. A API oferece diversas funcionalidades para gerenciar viagens, como visualizar viagens por destino, por ID, criar novas viagens, atualizar e cancelar viagens. Abaixo estão os testes realizados para garantir que cada endpoint da API esteja funcionando corretamente.

## Testes Realizados

### 1. Visualizar Viagens por Destino (GET)

<table>
  <thead>
    <tr>
      <th>Teste</th>
      <th>Descrição</th>
      <th>Resultado Esperado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Destino válido</td>
      <td>Verificar se o sistema retorna viagens válidas para um destino válido.</td>
      <td>Status HTTP 200 e lista de viagens para o destino.</td>
    </tr>
    <tr>
      <td>Destino inválido</td>
      <td>Verificar se o sistema retorna erro quando o destino não existe.</td>
      <td>Status HTTP 404 e mensagem de erro adequada.</td>
    </tr>
    <tr>
      <td>Destino sem viagens</td>
      <td>Verificar se o sistema retorna uma lista vazia quando o destino não tem viagens.</td>
      <td>Status HTTP 200 e lista vazia de viagens.</td>
    </tr>
  </tbody>
</table>

### 2. Visualizar Todas as Viagens (GET)

<table>
  <thead>
    <tr>
      <th>Teste</th>
      <th>Descrição</th>
      <th>Resultado Esperado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Ver todas as viagens</td>
      <td>Verificar se o sistema retorna todas as viagens cadastradas.</td>
      <td>Status HTTP 200 e lista completa de viagens.</td>
    </tr>
    <tr>
      <td>Formato da lista de viagens</td>
      <td>Verificar se a lista de viagens é retornada no formato correto.</td>
      <td>Status HTTP 200 e formato JSON adequado.</td>
    </tr>
  </tbody>
</table>

### 3. Visualizar Viagem por ID (GET)

<table>
  <thead>
    <tr>
      <th>Teste</th>
      <th>Descrição</th>
      <th>Resultado Esperado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>ID válido</td>
      <td>Verificar se a viagem é retornada corretamente quando um ID válido é fornecido.</td>
      <td>Status HTTP 200 e dados da viagem correspondentes ao ID fornecido.</td>
    </tr>
    <tr>
      <td>ID inválido</td>
      <td>Verificar se o sistema retorna erro quando o ID não existe.</td>
      <td>Status HTTP 404 e mensagem de erro adequada.</td>
    </tr>
  </tbody>
</table>

### 4. Nova Viagem (POST)

<table>
  <thead>
    <tr>
      <th>Teste</th>
      <th>Descrição</th>
      <th>Resultado Esperado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Viagem válida</td>
      <td>Verificar se o sistema cria uma viagem com dados válidos.</td>
      <td>Status HTTP 201 (Criado) e dados da viagem criada.</td>
    </tr>
    <tr>
      <td>Dados inválidos</td>
      <td>Verificar se o sistema retorna erro quando dados inválidos são fornecidos.</td>
      <td>Status HTTP 400 (Bad Request) e mensagem de erro adequada.</td>
    </tr>
  </tbody>
</table>

### 5. Atualizar Viagem (PUT)

<table>
  <thead>
    <tr>
      <th>Teste</th>
      <th>Descrição</th>
      <th>Resultado Esperado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Atualização válida</td>
      <td>Verificar se o sistema atualiza corretamente os dados de uma viagem existente.</td>
      <td>Status HTTP 200 (OK) e dados atualizados da viagem.</td>
    </tr>
    <tr>
      <td>ID não encontrado</td>
      <td>Verificar se o sistema retorna erro quando o ID da viagem não existe.</td>
      <td>Status HTTP 404 (Not Found) e mensagem de erro adequada.</td>
    </tr>
  </tbody>
</table>

### 6. Cancelar Viagem (DELETE)

<table>
  <thead>
    <tr>
      <th>Teste</th>
      <th>Descrição</th>
      <th>Resultado Esperado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Cancelamento válido</td>
      <td>Verificar se a viagem é cancelada corretamente com ID válido.</td>
      <td>Status HTTP 200 (OK) e confirmação de cancelamento.</td>
    </tr>
    <tr>
      <td>ID não encontrado</td>
      <td>Verificar se o sistema retorna erro quando o ID da viagem não existe.</td>
      <td>Status HTTP 404 (Not Found) e mensagem de erro adequada.</td>
    </tr>
  </tbody>
</table>

<br>

## UML - Diagrama de Classes

<img src="https://cdn.discordapp.com/attachments/1313148607553077261/1316080941201883165/Diagrama_carona_-_atualizado.jpg?ex=6759bf63&is=67586de3&hm=bc20af5785aeeae0d11424929f2ec1467d056cf18619f9e8c3df67aa80807499&" alt="Descrição da Imagem" width="1300">

<br>

## Stack utilizada

**Back-end:**
- Java 17
- Spring Boot API REST
- Spring Web
- Spring Boot Dev Tools
- Validation
- Spring Data JPA
- MySQL Driver

<br>

## Autores

- [@Martinelii](https://www.github.com/Martinelii)
- [@biancasuarz](https://www.github.com/biancasuarz)
- [@Kagradiel](https://www.github.com/Kagradiel)
- [@DandaraaAfroo](https://www.github.com/DandaraaAfroo)
- [@GabrielJonatas](https://www.github.com/GabrielJonatas)
