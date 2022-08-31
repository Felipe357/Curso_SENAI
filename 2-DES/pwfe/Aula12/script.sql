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

insert into produtos values (default, 'CJ1234', 'Calça Jeans Super Confortável', 10, 90.00);
insert into produtos values (default, 'MO5432', 'Moletom 1000 cedas de aranha', 5, 50.00);