DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT primary key ,
    name VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    role VARCHAR(20) NOT NULL,
    password VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS book;

CREATE TABLE book (
    id INT primary key ,
    name VARCHAR(250) NOT NULL,
    user_id INT,
    FOREIGN key (user_id) REFERENCES users (id) ON DELETE SET NULL
);

DROP TABLE IF EXISTS bookUser;

CREATE TABLE bookUser (
    bookId INT,
    FOREIGN key (bookId) REFERENCES book (id) ON DELETE SET NULL,
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
    isin VARCHAR(12) NOT NULL,
    cusip VARCHAR(9) NOT NULL,
    issuer VARCHAR(225) NOT NULL,
    maturitydate DATE NOT NULL,
    coupon DOUBLE NOT NULL,
    type VARCHAR(220) NOT NULL,
    facevalue DOUBLE NOT NULL,
    status VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS trade;

CREATE TABLE trade (
    id INT NOT NULL primary key,
    book_id INT,
    counterpartyId INT ,
    security_id INT,
    quantity INT NOT NULL,
    status VARCHAR(200) NOT NULL,
    price DOUBLE NOT NULL,
    buy_sell INT NOT NULL,
    tradeDate DATE NOT NULL,
    settlementDate DATE NOT NULL,
    FOREIGN key (security_id) REFERENCES security (id) ON DELETE SET NULL,
    FOREIGN key (book_id) REFERENCES book (id) ON DELETE SET NULL,
    FOREIGN key (counterpartyId) REFERENCES counterparty (id)
);