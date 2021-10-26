CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria
(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
tipo ENUM ("JAVA", "JAVASCRIPT", "PYTHON", "R", "C#"),
origem ENUM ("SPRING", "FRONT-END", "DATA SCIENCE", "ESTATÍSTICA", ".NET")
);

CREATE TABLE tb_produto
(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(30) NOT NULL,
preco DOUBLE,
modulos INT,
fk_categoria INT,
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, origem)
VALUES("JAVA", "SPRING"),
("JAVASCRIPT", "FRONT-END"),
("PYTHON", "DATA SCIENCE"),
("R", "ESTATÍSTICA"),
("C#", ".NET");

INSERT INTO tb_produto(nome, preco, modulos, fk_categoria)
VALUES("Java básico", 750, 5, 1),
("Javascript básico", 500, 3, 2),
("Análise de dados", 900, 8, 3),
("Análise estatística", 55, 2, 4),
("Desenvolvimento windows", 1000, 6, 5),
("Java avançado", 1000, 4, 1),
("Javascript avançado", 400, 2, 2),
("Criação de Aplicação ASP.Net", 1200, 3, 5);

SELECT * FROM tb_produto
WHERE preco > 50;

SELECT * FROM tb_produto
WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto
WHERE nome LIKE 'J%';

-- INNER
SELECT tb_categoria.tipo, tb_produto.nome
FROM tb_categoria -- COLUNA ESQUERDA 
INNER  JOIN tb_produto -- COLUNA DIREITA
ON tb_categoria.id = tb_produto.fk_categoria;

SELECT tb_categoria.tipo, tb_produto.nome
FROM tb_categoria -- COLUNA ESQUERDA 
INNER  JOIN tb_produto -- COLUNA DIREITA
ON tb_categoria.id = tb_produto.fk_categoria
WHERE tb_categoria.tipo = "JAVA";