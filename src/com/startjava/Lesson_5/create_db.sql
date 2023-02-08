DROP DATABASE Jaegers;

DROP TABLE Jaegers;

CREATE DATABASE Jaegers;

CREATE TABLE Jaegers (
    id          SERIAL PRIMARY KEY,
    modelName   TEXT,
    mark        TEXT,
    height      INTEGER,
    weight      REAL,
    status      TEXT,
    origin      TEXT,
    launch      DATE,
    kaijuKill   INTEGER
);

\ir init_db.sql;

\ir queries.sql;