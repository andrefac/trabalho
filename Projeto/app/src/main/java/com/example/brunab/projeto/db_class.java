package com.example.brunab.projeto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db_class extends SQLiteOpenHelper {
    public db_class(Context context) {
        super(context, "locadb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder db_locadora = new StringBuilder();
        db_locadora.append("CREATE TABLE Cliente (\n" +
                "    id            INTEGER       PRIMARY KEY AUTOINCREMENT\n" +
                "                                UNIQUE,\n" +
                "    cpf           VARCHAR (14)  UNIQUE\n" +
                "                                NOT NULL,\n" +
                "    nome          VARCHAR (50)  NOT NULL,\n" +
                "    rg            VARCHAR (10)  NOT NULL\n" +
                "                                UNIQUE,\n" +
                "    cnh           VARCHAR (15)  UNIQUE\n" +
                "                                NOT NULL,\n" +
                "    endereco      VARCHAR (100) NOT NULL,\n" +
                "    n_dependentes INTEGER       NOT NULL\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Funcionario (\n" +
                "    id       INTEGER       PRIMARY KEY AUTOINCREMENT\n" +
                "                           NOT NULL,\n" +
                "    cpf      VARCHAR (14)  UNIQUE\n" +
                "                           NOT NULL,\n" +
                "    nome     VARCHAR (100) NOT NULL,\n" +
                "    rg       VARCHAR (15)  NOT NULL\n" +
                "                           UNIQUE,\n" +
                "    endereco VARCHAR (100) NOT NULL,\n" +
                "    cargo    VARCHAR (60)  NOT NULL,\n" +
                "    dt_adm   DATE          NOT NULL,\n" +
                "    dt_contr DATE,\n" +
                "    dt_demi  DATE\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Carro (\n" +
                "    id     INTEGER      PRIMARY KEY AUTOINCREMENT\n" +
                "                        NOT NULL,\n" +
                "    placa  VARCHAR (8)  UNIQUE\n" +
                "                        NOT NULL,\n" +
                "    modelo VARCHAR (30) NOT NULL,\n" +
                "    marca  VARCHAR (20) NOT NULL,\n" +
                "    vl_seg VARCHAR (8)  NOT NULL,\n" +
                "    cor    VARCHAR (20) NOT NULL,\n" +
                "    vl_loc VARCHAR (8)  NOT NULL\n" +
                ");\n" +
                "\n" +
                "PRAGMA foreign_keys = 0;\n" +
                "\n" +
                "CREATE TABLE sqlitestudio_temp_table AS SELECT *\n" +
                "                                          FROM Locacao;\n" +
                "\n" +
                "DROP TABLE Locacao;\n" +
                "\n" +
                "CREATE TABLE Locacao (\n" +
                "    id          INTEGER     PRIMARY KEY AUTOINCREMENT\n" +
                "                            UNIQUE,\n" +
                "    n_cliente   INTEGER     NOT NULL\n" +
                "                            REFERENCES Cliente (id),\n" +
                "    placa_carro VARCHAR (8) NOT NULL,\n" +
                "    dt_loca     DATE        NOT NULL,\n" +
                "    km_ini      VARCHAR (8) NOT NULL,\n" +
                "    dt_devo     DATE,\n" +
                "    km_fim      VARCHAR (8),\n" +
                "    valor_total VARCHAR (8) \n" +
                ");\n" +
                "\n" +
                "INSERT INTO Locacao (\n" +
                "                        id,\n" +
                "                        n_cliente,\n" +
                "                        placa_carro,\n" +
                "                        dt_loca,\n" +
                "                        km_ini\n" +
                "                    )\n" +
                "                    SELECT id,\n" +
                "                           n_cliente,\n" +
                "                           placa_carro,\n" +
                "                           dt_loca,\n" +
                "                           km_ini\n" +
                "                      FROM sqlitestudio_temp_table;\n" +
                "\n" +
                "DROP TABLE sqlitestudio_temp_table;\n" +
                "\n" +
                "PRAGMA foreign_keys = 1;");
        db.execSQL(db_locadora.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
