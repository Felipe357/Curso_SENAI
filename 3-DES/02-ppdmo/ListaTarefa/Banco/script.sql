drop database if exists listaTarefa;

create database listaTarefa charset = UTF8 collate utf8_general_ci;

USE listaTarefa;

CREATE TABLE tarefa (
    id INT NOT NULL primary key AUTO_INCREMENT,
    descricao VARCHAR(300) NOT NULL,
    horarioInicio VARCHAR(30) NOT NULL,
    horarioFim VARCHAR(30) NULL,
    status INT NOT NULL
);