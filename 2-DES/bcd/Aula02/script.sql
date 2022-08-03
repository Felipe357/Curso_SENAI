-- Exclui o banco se existir e cria um novo com o padrao utf8 de caracteres
drop database if exists pedidos;
create database pedidos charset=UTF8 collate utf8_general_ci;
use pedidos;
-- DDL Craiacao da estrutura do banco de dados
create table clientes(
    id_clientes integer not null primary key auto_increment,
    pri_nome varchar(20) not null,
    sobrenome varchar(20) not null,
    endereco varchar(100) not null
);

create table telefones(
    id_clientes integer not null,
    telefone varchar(15) not null,
    foreign key (id_clientes) references clientes(id_clientes)
);

create table pedidos(
    num_pedido integer not null primary key auto_increment,
    id_cliseentes integer not null,
    data timestamp not null,
    valor decimal(8,2) not null,
    descricao varchar(50) not null,
    quantidade integer not null,
    foreign key (id_clientes) references clientes(id_clientes)
);

insert into clientes values
(null,"Jorge","Silva","Rua Coisa Bueno - Jaguariuna - SP"),
(null,"Vanessa","Silva","Rua Amâncio Dias - Pedreira -SP");

insert into telefones values
(1,"(19)-97517-7301"),
(2,"(19)-97550-2280");


insert into pedidos values
(null, 1,null,10,"Pastel de flango", 2);

select * from clientes;
select * from telefones;
select * from pedidos;

describe clientes;
describe telefones;
describe pedidos;
show tables;