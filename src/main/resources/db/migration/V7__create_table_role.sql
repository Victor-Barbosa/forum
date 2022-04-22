CREATE TABLE role(
    id    bigint       not null auto_increment,
    nome  varchar(100) not null,
    primary key (id)
);

INSERT INTO role values(1, 'LEITURA_ESCRITA');