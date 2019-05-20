DROP SCHEMA GreenHouse;
Create schema GreenHouse;
use GreenHouse;

create table if not exists Usuario(
	id_user int auto_increment, 
    tp_user varchar(1), 
    user_name varchar(30), 
    user_pass varchar(18) not null unique, 
    user_email varchar(50), 
    primary key(id_user)
);

create table if not exists Juridico(
	id_userJuridico int auto_increment,
    id_user int,
    nome_fantasia varchar(50),
    cnpj varchar(50) not null unique,
	primary key(id_userJuridico),
    Foreign key(id_user) references Usuario(id_user) on delete cascade
);

create table if not exists Fisico(
	id_fisico int auto_increment,
    id_user int,
    nome varchar(50),
    data_nascimento date,
    sexo char,
    cpf varchar(11) not null unique,
    Foreign key(id_user) references Usuario(id_user) on delete cascade,
    primary key(id_fisico)
);

create table if not exists Endereco(
	id_ende int auto_increment,
    id_user int,
    rua varchar(25),
    num int,
    comple varchar(100),
    tel_1 varchar(11),
    tel_2 varchar(11),
    cep varchar(8),
    Foreign key(id_user) references Usuario(id_user) on delete cascade,
    primary key(id_ende)
);

create table if not exists Pedido(
	id_pedido int auto_increment,
    id_user int,
    valTotal double,
    descri varchar(300),
    pedP_data date,
	Foreign key(id_user) references Usuario(id_user) on delete cascade,
    primary key(id_pedido)
);

create table if not exists Produto(
	id_produto int auto_increment,
    preco double,
    tipo int,
    primary key(id_produto)
);

create table if not exists Servico(
	id_servico int auto_increment,
    tipo int,
    preco double,
    primary key(id_servico)
);

create table if not exists Pedido_produto(
	id_pedido_produto int auto_increment,
    id_produto int,
    id_pedido int,
    quant int,
    Foreign Key (id_produto) references Produto(id_produto) on delete cascade,
    Foreign Key (id_pedido) references Pedido(id_pedido) on delete cascade,
    primary key(id_pedido_produto)
);

create table if not exists Pedido_Servico(
	id_pedido_servico int auto_increment,
    quant int,
    id_produto int,
    id_servico int,
    Foreign Key (id_produto) references Produto(id_produto) on delete cascade,
    Foreign Key (id_servico) references Servico(id_servico) on delete cascade,
	primary key(id_pedido_servico)
);

create table if not exists Forma_pagamento(
	id_forma_pagamento int auto_increment,
    nome varchar(20),
    primary key(id_forma_pagamento)
);

create table if not exists Pagamento(
	id_pagamento int auto_increment,
    valor double,
    id_pedido int,
    id_forma_pagamento int,
    pag_data date,
    Foreign Key (id_pedido) references Pedido(id_pedido) on delete cascade,
    foreign key (id_forma_pagamento) references Forma_pagamento(id_forma_pagamento),
    primary key (id_pagamento)
);