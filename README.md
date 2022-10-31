# Tunr2CTeste
Projeto back-end responsavel por criar um CRUD para vendedor,cliente e estabelece uma relação entre eles. 


### Stack

| Tecnologia     | Versão   |
|----------------|----------|
| Java           | 1.8      |
| SpringBoot     | 2.7.5    |


### Executando a Aplicação

    # Clone o projeto
    git clone https://github.com/Sidnei1987/Tunr2CTeste.git

    # Para subir a aplicação
      Configura um banco local MySql confirma: URL, userName, password
      Start o projeto atravez da class main
    
      # Exemplo configuração de banbo MySql:
        spring.jpa.hibernate.ddl-auto=update
        spring.datasource.url=jdbc:mysql://localhost:3306/db_turn2c?createDatabaseIfNotExist=true&serverTimezone=UTC&useSSL=false
        spring.datasource.username=root
        spring.datasource.password=root
        spring.jpa.show-sql=true
        
### Testar o projeto
  Ultilize o postman
  
    Para listar os vendedor curl --location --request GET 'http://localhost:8080/vendedor' \
    --data-raw ''

    Para criar os vendedor curl --location --request POST 'http://localhost:8080/vendedor' \
    --data-raw ''

    para atualizar os vendedor curl --location --request PUT 'http://localhost:8080/vendedor' \
    --data-raw ''

    para deletar o vendedor (passe o id que deseja excluir depois "vendedor/") => curl --location --request DELETE 'http://localhost:8080/vendedor' \
    --data-raw '' 

    Para listar os cliente curl --location --request GET 'http://localhost:8080/cliente' \
    --data-raw ''

    Para criar os cliente curl --location --request POST 'http://localhost:8080/cliente' \
    --data-raw ''

    Para atualizar os cliente curl --location --request PUT 'http://localhost:8080/cliente' \
    --data-raw ''
    
    Para deletar o cliente (passe o id que deseja excluir depois "cliente/") => curl --location --request DELETE 'http://localhost:8080/cliente' \
    --data-raw '' 

    Para listar os cliente_vendedor curl --location --request GET 'http://localhost:8080/cliente_vendedor' \
    --data-raw ''
    
    Para criar os cliente_vendedor curl --location --request POST 'http://localhost:8080/cliente_vendedor' \
    --data-raw ''
    
    para atualizar os cliente_vendedor curl --location --request PUT 'http://localhost:8080/cliente_vendedor' \
    --data-raw ''
    
    para deletar o cliente_vendedor (passe o id que deseja excluir depois "cliente_vendedor/") => curl --location --request DELETE 'http://localhost:8080/cliente_vendedor' \
    --data-raw '' 

### OBSEVAÇÃO
  Para excluir vendedor e cliente eles não podem estar relacionados, deverá excluir primeiro eles da tabela cliente_vendedor.

  

