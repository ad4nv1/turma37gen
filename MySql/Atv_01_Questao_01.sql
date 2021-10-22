CREATE DATABASE rh;

USE rh;

CREATE TABLE funcionario
(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(100) NOT NULL,
endereco_funcionario VARCHAR(10),
data_aniversario DATE,
salario INT
);

INSERT INTO funcionario(nome, endereco_funcionario, data_aniversario, salario)
VALUES("maria" , "150b", "1998-01-05", 2500),
("paulo" , "250", "1996-10-12", 2000),
("joao" , "470", "2000-02-11", 1800),
("douglas" , "850a", "2001-01-09", 1300),
("joana" , "100a", "1997-10-03", 5000);

SELECT * FROM funcionario
WHERE salario > 2000;

SELECT * FROM funcionario
WHERE salario < 2000;

UPDATE funcionario SET salario=1950 WHERE id = 2;
