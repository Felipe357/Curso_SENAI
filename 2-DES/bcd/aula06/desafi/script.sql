drop database if exists emprestimos;
create database emprestimos charset=UTF8 collate utf8_general_ci;
use emprestimos;

create table cliente(
    cpf varchar(12) not null primary key,
    pri_nome varchar(30) not null,
    sobrenome varchar(30) not null,
    cep varchar(20) not null,
    complemento varchar(50)
);

create table telefones(
    cpf_cli varchar(12) not null,
    tipo varchar(12) not null,
    numero varchar(18) not null,
    FOREIGN KEY (cpf_cli) REFERENCES cliente(cpf)
);

create table emprestimos(
    id integer not null primary key auto_increment,
    cpf_cli varchar(12) not null,
    id_parcela integer not null,
    data date not null,
    capital float(8,2) not null,
    n_parcelas varchar(20) not null,
    taxa_juros varchar(20) not null,
    impostos float(7,2) not null,
    FOREIGN KEY (cpf_cli) REFERENCES cliente(cpf),
);

create table parcelas(
    id integer not null primary key auto_increment,
    vencimento date not null,
    pagamento date,
    valor float(5,2) not null,
    val_recebido float(5,2),
    id_emp integer not null,
    FOREIGN KEY (id_emp) REFERENCES emprestimos(id)
);
