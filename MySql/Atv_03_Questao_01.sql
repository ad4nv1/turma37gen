CREATE DATABASE db_blog_pessoal;

USE db_blog_pessoal;

CREATE TABLE temas
(
id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
descricao VARCHAR(255) NOT NULL
);

CREATE TABLE usuarios
(
id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(255) NOT NULL,
usuario VARCHAR(255) NOT NULL,
senha VARCHAR(255) NOT NULL
);

CREATE TABLE Postagem
(
id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
titulo VARCHAR(255) NOT NULL,
texto VARCHAR(1000) NOT NULL,
`data` TIMESTAMP NOT NULL,
tema_id BIGINT,
usuario_id BIGINT,
FOREIGN KEY (tema_id) REFERENCES temas(id),
FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);


