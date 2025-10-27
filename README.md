# Projeto - Farmácia API

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

## 🔹 Estrutura do Projeto

src/main/java/com/generation/farmacia
│
├─ model
│ ├─ Produto.java
│ ├─ Categoria.java
│ ├─ Usuario.java
│ └─ UsuarioLogin.java
│
├─ repository
│ ├─ ProdutoRepository.java
│ ├─ CategoriaRepository.java
│ └─ UsuarioRepository.java
│
├─ service
│ ├─ ProdutoService.java
│ └─ UsuarioService.java
│
├─ controller
│ ├─ ProdutoController.java
│ └─ UsuarioController.java
│
└─ security
├─ JwtService.java
├─ JwtAuthFilter.java
├─ UserDetailsImpl.java
├─ UserDetailsServiceImpl.java
└─ SecurityConfig.java

---

## 🔹 Endpoints da API

### Usuários

| Método | Endpoint               | Descrição                        | Autenticação |
|--------|------------------------|---------------------------------|--------------|
| GET    | /usuarios/all          | Lista todos os usuários         | ❌            |
| GET    | /usuarios/{id}         | Busca usuário por ID            | ❌            |
| POST   | /usuarios/cadastrar    | Cadastra um novo usuário        | ❌            |
| PUT    | /usuarios/atualizar    | Atualiza dados de usuário       | ✅            |
| POST   | /usuarios/logar        | Login e obtenção do token JWT   | ❌            |

### Produtos

| Método | Endpoint             | Descrição                        | Autenticação |
|--------|--------------------|---------------------------------|--------------|
| GET    | /produtos           | Lista todos os produtos         | ❌            |
| GET    | /produtos/{id}      | Busca produto por ID            | ❌            |
| POST   | /produtos           | Cadastra um novo produto        | ✅            |
| PUT    | /produtos           | Atualiza dados do produto       | ✅            |

---
## 🔹 Exemplo de Requisição 

**Cadastro de Produto:**
```
{
  "nome": "Paracetamol",
  "descricao": "Analgésico e antipirético",
  "preco": 12.50,
  "marca": "Genérico",
  "foto": "https://ik.imagekit.io/Thalima23/produto_08.png",
  "categoria": {
    "id": 1
  }
}

---
```
## 🔹 Segurança

JWT Authentication: Rotas privadas exigem token JWT no header Authorization: Bearer <token>.
Spring Security protege endpoints sensíveis.
Senhas são criptografadas com BCrypt antes de persistir no banco.

## 🔹 Banco de Dados

MySQL
Tabelas principais:
tb_produtos
tb_categorias
tb_usuarios

