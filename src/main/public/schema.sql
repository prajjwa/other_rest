DROP TABLE IF EXISTS book;

CREATE TABLE book (
    id INT primary key ,
    name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT primary key ,
    name VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    role VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS bookUser;

CREATE TABLE bookUser (
    bookId INT NOT NULL,
    FOREIGN key (bookId) REFERENCES book (id),
    userId INT NOT NULL,
    FOREIGN key (userId) REFERENCES users (id)
);

DROP TABLE IF EXISTS counterparty;

CREATE TABLE counterparty (
    id INT NOT NULL primary key,
    name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS security;

CREATE TABLE security (
    id INT NOT NULL primary key,
    isin INT NOT NULL,
    cusip INT NOT NULL,
    issuer VARCHAR(20) NOT NULL,
    maturitydate DATE NOT NULL,
    coupon INT NOT NULL,
    type VARCHAR(20) NOT NULL,
    facevalue INT NOT NULL,
    status VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS trade;

CREATE TABLE trade (
    id INT NOT NULL primary key,
    bookId INT NOT NULL,
    counterpartyId INT NOT NULL,
    securityId INT NOT NULL,
    quantity INT NOT NULL,
    status VARCHAR(20) NOT NULL,
    price INT NOT NULL,
    buy_sell INT NOT NULL,
    tradeDate DATE NOT NULL,
    settlementDate DATE NOT NULL,
    FOREIGN key (securityId) REFERENCES security (id),
    FOREIGN key (bookId) REFERENCES book (id),
    FOREIGN key (counterpartyId) REFERENCES counterparty (id)
);