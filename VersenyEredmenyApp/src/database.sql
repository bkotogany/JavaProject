USE verseny_db;

CREATE TABLE IF NOT EXISTS versenyek 
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nev VARCHAR(100) NOT NULL,
    datum DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS versenyzok 
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nev VARCHAR(100) NOT NULL,
    orszag VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS eredmenyek 
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    versenyzo_id INT NOT NULL,
    verseny_id INT NOT NULL,
    pontszam INT,
    helyezes INT,
    FOREIGN KEY (versenyzo_id) REFERENCES versenyzok(id),
    FOREIGN KEY (verseny_id) REFERENCES versenyek(id)
);