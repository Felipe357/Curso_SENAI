drop database if exists blobs;
create database blobs charset = UTF8 collate = utf8_general_ci;
use blobs;

create table cadastros(
    id integer primary key not null auto_increment,
    nome varchar(100) not null,
    foto mediumblob
);

select * from cadastros;
