# Calisthenics - Projeto de Boas Práticas com Spring Boot

Este projeto é um exemplo prático de aplicação dos **princípios de Object Calisthenics** em um sistema de gerenciamento de ofertas, utilizando **Java 17** e **Spring Boot 3.x**.

A ideia é estruturar um código limpo, modular e de fácil manutenção, respeitando princípios como:
- Um nível de indentação por método
- Sem abreviações
- Primitivos e strings encapsulados
- Sem getters/setters desnecessários
- Composição > Herança
- Entidades pequenas e com responsabilidades claras

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot 3.4.5
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Lombok
- Springdoc OpenAPI (Swagger)

## 📦 Estrutura de Pastas

src/main/java/com/example/Calisthenics/
├── controller/
│   └── OfertaController.java
├── model/
│   ├── Cliente.java
│   ├── Item.java
│   ├── Money.java
│   └── Oferta.java
├── service/
│   ├── NotificationService.java
│   └── OfertaService.java
└── CalisthenicsApplication.java

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   git clone https://github.com/odavid062/Calisthenics.git
   cd Calisthenics

2. Build do projeto:
   mvn clean install

3. Execute a aplicação:
   mvn spring-boot:run

4. Acesse no navegador:
   http://localhost:8080/swagger-ui/index.html

## 📝 Funcionalidades Disponíveis
- Criar uma oferta
- Adicionar itens à oferta
- Consultar relatório da oferta (total + desconto calculado)
- Confirmar uma oferta (com simulação de notificação)

## 🗃️ Observações
- O banco de dados H2 é usado apenas para testes em memória.
- O Swagger (Springdoc OpenAPI) documenta automaticamente todos os endpoints.
- Todas as entidades seguem os princípios de Object Calisthenics para garantir código limpo e coeso.

## 📄 Licença
Este projeto é de uso educacional e livre para estudos e aprimoramento profissional.
