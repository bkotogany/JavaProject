# JavaProject
GDE/Alkalmazasfejlesztes technologia

# Verseny Eredményhirdető Rendszer

## Leírás
Ez a konzolos Java alkalmazás lehetővé teszi sportversenyek adatainak kezelését. A program MySQL adatbázist használ, amely három táblából áll: versenyzok, versenyek, és eredmenyek.

## Funkciók
- Versenyzők rögzítése (név, ország)
- Versenyek rögzítése (név, dátum)
- Eredmények rögzítése (versenyző, verseny, pontszám, helyezés)
- Eredmények listázása helyezés szerint

## Használat
1. Győződj meg róla, hogy a MySQL szerver fut.
2. Importáld a `verseny_db` adatbázist az `SQL fájl` alapján.
3. Indítsd el a programot: `Main.java`
4. Kövesd a konzolos menüt.

## Adatbázis kapcsolat
A `Database.java` osztályban található:

jdbc:mysql://localhost:3306/verseny_db

Felhasználónév: `root`  
Jelszó: (állítsd be szükség szerint)

## Követelmények
- Java 17+
- MySQL
- JDBC Driver: `mysql-connector-j` (v8.0+)

## Szerző
Készítette: Kotogány Bettina
Dátum: 2025. április 10.