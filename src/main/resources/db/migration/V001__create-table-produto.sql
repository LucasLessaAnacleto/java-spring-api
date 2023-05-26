CREATE TABLE produto(
    id varchar(255) not null unique primary key,
    nome text not null,
    preco_centavos int not null
);