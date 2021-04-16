/** 
* Agenda de contatos
* @author Matheus cesarini
*/

/* Banco de dados */
-- verificar banco de dados disponiveis 
show databases;
-- criar um novo banco de dados 
create database dbagenda;
-- selecionar o banco de dados;
use dbagenda;

/* Tabelas */
-- verificar tabela do banco de dados 
show tables;
-- criar uma nova tabela 
create table contatos (
idcon int primary key auto_increment,
nome varchar(50) not null,
fone varchar(15) not null,
email varchar(50)
);
-- descrave a estrutura da tabela 
describe contatos;
-- remover uma tabela 
drop table contatos;

/* CRUD (create read update delete) */
-- CRUD create cria contatos 
insert into contatos(nome,fone,email)
values('matheus cesarini','99999-1234','ma@email.com');
insert into contatos(nome,fone,email)
values('gabriel l','99999-4321','ga@email.com');
insert into contatos(nome,fone,email)
values('jose de assis','99999-4569','jo@email.com');

-- CRUD read
-- abaixo o comando seleciona tudo e mostra os contatos cadastrados  
select * from contatos;
-- abaixo o comando abre em ordem alfabetica
select * from contatos order by nome;
-- abaixo o comando busca um contato especifico
select * from contatos where idcon = 2;

-- CRUD update 
-- o comando abaixo altera um item especifico
update contatos set email='gabriel@email.com' where idcon = 2;
-- o comando abaixo altera todo o cadastro do cliente
update contatos set nome= 'jose de assis filho', fone='99999-7894', email='jose@email.com' where idcon = 3;

-- CRUD delete 
-- comando que apaga os contatos 
delete from contatos where idcon = 2;
