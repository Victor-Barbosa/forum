create table curso(
    id bigint not null auto_increment,
    nome varchar(50) not null,
    categoria varchar(50) not null,
    primary key(id)
);

insert into curso values (1, 'kotlin', 'PROGRAMACAO');
insert into curso values (2, 'java', 'PROGRAMACAO');
insert into curso values (3, 'python', 'PROGRAMACAO');
