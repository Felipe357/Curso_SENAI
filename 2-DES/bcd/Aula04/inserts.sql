drop database if exists clientes;
create database clientes charset=UTF8 collate utf8_general_ci;
use clientes;

create table clientes(
    id_cliente integer not null primary key auto_increment,
    nome varchar(50) not null,
    nascimento date not null,
    sexo varchar(1) not null,
    peso float(5,2)
);

create table telefones(
    id_cliente integer not null,
    numero varchar(15) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

describe telefones;
describe clientes;
show tables;

select * from clientes;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex1/telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from telefones;

--Exercicio 2


drop database if exists academia;
create database academia charset=UTF8 collate utf8_general_ci;
use academia;

create table telefones(
    id_aluno integer not null,
    numero varchar(15) not null
);

create table alunos(
    id_aluno integer not null primary key auto_increment,
    nome varchar(50) not null,
    nascimento date not null,
    sexo varchar(1) not null,
    peso float(5,2)
);

create table aparelhos(
    id_aparelho	integer not null primary key auto_increment,
    nome_aparelho varchar(50) not null
);

create table exercicios(
    id_exercicio integer not null primary key auto_increment,
    descricao varchar(50) not null,
    grupo_muscular varchar(20) not null,
    id_aparelho integer not null
);

create table fichas(
    id_aluno integer not null,
    id_exercicio integer not null,
    dia_semana varchar(20) not null,
    serie varchar(40) not null
);

alter table telefones add foreign key (id_aluno) references alunos(id_aluno);
alter table exercicios add foreign key (id_aparelho) references aparelhos(id_aparelho);
alter table fichas add foreign key (id_aluno) references alunos(id_aluno);
alter table fichas add foreign key (id_exercicio) references exercicios(id_exercicio);

describe alunos;
describe telefones;
describe aparelhos;
describe exercicios;
describe fichas;

show tables;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex2/ex2-alunos.csv'
INTO TABLE alunos
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex2/ex2-telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex2/ex2-exercicio.csv'
INTO TABLE exercicios
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex2/ex2-aparelhos .csv'
INTO TABLE aparelhos
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex2/ex2-ficha.csv'
INTO TABLE fichas
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

--Exercicio 3

-- Importação de arquivos CSV
LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex3/ex3-motoristas.csv'
INTO TABLE motoristas
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from motoristas;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex3/ex3-telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from telefones;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex3/ex3-linhas.csv'
INTO TABLE linhas
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from linhas;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex3/ex3-horarios.csv'
INTO TABLE horarios
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from horarios;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex3/ex3-mot_linha.csv'
INTO TABLE mot_linha
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from mot_linha;

--Exercicio 4

drop database if exists duplicatas;
create database duplicatas charset=UTF8 collate utf8_general_ci;
use duplicatas;

CREATE TABLE clientes (
    cod_cli INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    end VARCHAR(50) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    bairro VARCHAR(150) NOT NULL,
    cidade VARCHAR(150) NOT NULL,
    uf VARCHAR(20) NOT NULL,
    PRIMARY KEY (cod_cli)
);

CREATE TABLE telefones (
    cod_cli INT NOT NULL,
    tipo VARCHAR(100) NOT NULL,
    telefone VARCHAR(100) NOT NULL, 
    FOREIGN KEY (cod_cli) REFERENCES clientes(cod_cli)
);

CREATE TABLE duplicatas (
    num_dupli VARCHAR(100) NOT NULL,
    cod_cli INT NOT NULL,
    data_compra DATE NOT NULL,
    vencimento DATE NOT NULL,
    valor DOUBLE(3, 2) NOT NULL,
    diferenca DOUBLE(4 ,2) NOT NULL,
    v_final DOUBLE(4, 2) NOT NULL,
    status VARCHAR(50) NOT NULL,
    FOREIGN KEY (cod_cli) REFERENCES clientes(cod_cli)
);

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex4/ex4clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex4/ex4telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex4/ex4-duplicatas.csv'
INTO TABLE duplicatas
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

-- Exercicio 5

drop database if exists entregas;
create database entregas charset=UTF8 collate utf8_general_ci;
use entregas;

create table clientes(
    id_cliente integer not null primary key auto_increment,
    cpf varchar(11) not null,
    nome varchar(50) not null,
    cep varchar(8) not null,
    numero varchar(6) not null,
    complemento varchar(20)
);

create table telefones(
    id_cliente integer not null,
    numero varchar(15) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

create table entregadores(
    id_entregador integer not null primary key auto_increment,
    nome varchar(50) not null,
    veiculo varchar(20) not null
);

create table produtos(
    id_produto integer not null primary key auto_increment,
    nome varchar(50) not null,
    preco_unitario float(8,2) not null
);

create table pedidos(
    id_cliente integer not null,
    id_pedido integer not null primary key auto_increment,
    id_intregador integer not null,
    data date not null,
    hora_pedido time,
    hora_entrega time,
    hora_fim time,
    foreign key (id_cliente) references clientes(id_cliente),
    foreign key (id_intregador) references entregadores(id_entregador)
);

create table itens(
    id_pedido integer not null,
    quantidade integer not null,
    id_produto integer not null,
    foreign key (id_pedido) references pedidos(id_pedido),
    foreign key (id_produto) references produtos(id_produto)
);


LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex5/ex5-clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex5/ex5-telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex5/ex5-entregadores.csv'
INTO TABLE entregadores
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex5/ex5-produtos.csv'
INTO TABLE produtos
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex5/ex5-pedidos.csv'
INTO TABLE pedidos
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/DESENVOLVIMENTO/Desktop/Curso_SENAI/2-DES/bcd/Aula04/csv/ex5/ex5-itens.csv'
INTO TABLE itens
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;