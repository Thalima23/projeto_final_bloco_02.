# Projeto - Farmácia API

🧩 API RESTful desenvolvida com Spring Boot, Java, JPA/Hibernate e MySQL, voltada para o gerenciamento de produtos e usuários de uma farmácia.

Funcionalidades principais:

📦 Gerenciamento de produtos: CRUD completo de produtos, incluindo categorias e estoque.

👥 Gerenciamento de usuários: cadastro, atualização e autenticação de usuários.

🔒 Segurança: autenticação via JWT e proteção de rotas com Spring Security.

🔄 Fluxo de operações claro: o fluxograma abaixo demonstra o fluxo de cadastro, login e gerenciamento de produtos/usuários.

---

## 🧰 Tecnologias Utilizadas ️

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

## ⚙ Funcionalidades

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

![Fluxograma do Projeto](https://ik.imagekit.io/Thalima23/ChatGPT%20Image%2027%20de%20out.%20de%202025,%2015_25_58.png?updatedAt=1761589697718)

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
---
##  Segurança

JWT Authentication: Rotas privadas exigem token JWT no header Authorization: Bearer <token>.
Spring Security protege endpoints sensíveis.
Senhas são criptografadas com BCrypt antes de persistir no banco.

---

## 💾 Banco de Dados

**Banco utilizado:** MySQL  

| Tabela         | Descrição                                   |
|----------------|---------------------------------------------|
| `tb_produtos`  | Armazena as informações dos produtos da farmácia (nome, preço, quantidade, categoria, etc.) |
| `tb_categorias`| Classifica os produtos por tipo (medicamentos, cosméticos, suplementos, etc.) |
| `tb_usuarios`  | Contém dados dos usuários, incluindo login, senha e permissões de acesso |


---

## 👩‍💻 7. Desenvolvido por

Desenvolvido por [**Thalita**](https://github.com/rafaelq80) 💜
Como parte do Bootcamp Generation Brasil – Full Stack Java 83.

📫 Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue! 🚀

