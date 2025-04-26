# Verseny Eredményhirdető Rendszer

## Leírás
Ez a konzolos Java alkalmazás lehetővé teszi sportversenyek adatainak kezelését. A program MySQL adatbázist használ, amely három táblából áll: versenyzok, versenyek és eredmenyek.

## Funkciók
- Versenyzők rögzítése (név, ország)
- Versenyek rögzítése (név, dátum)
- Eredmények rögzítése (versenyző, verseny, pontszám, helyezés)
- Eredmények listázása helyezés szerint

## Adatbázis telepítése
1. Nyisd meg a MySQL szervert.
2. Importáld a `database.sql` fájlt:
   - Terminálból: `mysql -u root -p < database.sql`
   - Vagy MySQL Workbench segítségével importáld
3. Az adatbázis neve: `verseny_db`

## Használat
1. Állítsd be a `.env` fájlt a megfelelő adatbázis adatokkal.
2. Futtasd a `Main.java` programot.
3. Kövesd a konzolos menüt.

## Adatbázis kapcsolat
A `Database.java` osztály a `.env` fájlból olvassa az adatokat

## Követelmények
- Java 17+
- MySQL szerver
- Maven (projektfüggőségek kezelése)
- JDBC Driver: mysql-connector-j
- dotenv-java könyvtár

## Szerző
Készítette: Kotogány Bettina
Dátum: 2025. április 10.