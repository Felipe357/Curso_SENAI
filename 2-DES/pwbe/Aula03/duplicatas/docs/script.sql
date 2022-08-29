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

create view vw_clinetes as
select clientes.cod_cli, clientes.nome, clientes.endereco, clientes.bairro, clientes.cidade, clientes.uf, telefones.tipo, telefones.telefone as telefones from clientes clientes
inner join telefones telefones
on clientes.cod_cli = telefones.cod_cli;

select * from vw_clinetes;