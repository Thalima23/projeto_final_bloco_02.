# Farmácia API

API RESTful desenvolvida com **Spring Boot**, **Java**, **JPA/Hibernate** e **MySQL**, para gerenciamento de produtos e usuários de uma farmácia.  
O projeto inclui autenticação JWT e segurança com Spring Security.

---

## 🔹 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3+
- Spring Security
- JWT (JSON Web Tokens)
- Spring Data JPA / Hibernate
- MySQL
- Maven
- Validation com Jakarta Bean Validation
- Swagger (opcional para documentação)
- Postman (para testes de API)

---

## 🔹 Funcionalidades

### Usuários
- Cadastro de usuários
- Login com autenticação JWT
- Atualização de dados de usuário
- Proteção de rotas privadas

### Produtos
- Cadastro de produtos com:
  - Nome
  - Marca
  - Descrição
  - Preço
  - Foto
  - Categoria
- Listagem de produtos
- Atualização de produtos
- Validação de campos obrigatórios (ex: marca não pode ser nula)

### Categorias
- CRUD de categorias
- Relacionamento com produtos (1:N)

---

