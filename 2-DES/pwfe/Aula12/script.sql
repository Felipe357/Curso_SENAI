drop database if exists lojinha;
create database lojinha charset=UTF8 collate utf8_general_ci;
use lojinha;

create table produtos(
    id integer not null primary key auto_increment,
    cod VARCHAR(10) not null,
    nome VARCHAR(50) NOT NULL,
    qntd INTEGER NOT NULL,
    preco FLOAT(5, 2) NOT NULL
);

create table funcionario (
    id integer auto_increment not null primary key,
    matricula VARCHAR(10) not null unique,
    nome VARCHAR(153) not null,
    cargo VARCHAR(50) not null,
    salario FLOAT(6, 2) not null,
    cpf VARCHAR(11) not null
);

insert into produtos values (default, 'CJ1234', 'Calça Jeans Super Confortável', 10, 90.00);
insert into produtos values (default, 'MO5432', 'Moletom 1000 cedas de aranha', 5, 50.00);

insert into funcionario values (default, 'SP1234', 'José Astolfo', 'Gerente', 5300.00, '72704721068');