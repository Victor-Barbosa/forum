create table usuario(
                      id bigint not null auto_increment,
                      nome varchar(100) not null,
                      email varchar(100) not null,

                      primary key(id)
);

insert into usuario values (1, 'ana', 'ana@email.com');
insert into usuario values (2, 'jose', 'jose@email.com');
insert into usuario values (3, 'joao', 'joao@email.com');

