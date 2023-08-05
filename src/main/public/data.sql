INSERT INTO book (id, name) VALUES (0, 'Book1');

INSERT INTO users(id,name,email,role) VALUES(0,'Jeff','tom@gmail.com','admin');

INSERT INTO bookUser (bookid,userid) VALUES(0,0);

INSERT INTO counterparty (id,name) VALUES(0,'Birla');

INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status) VALUES(0,1,1,'Bny','2023-09-10',10,'Buy',1000,'Done');

INSERT INTO trade (id,bookid,counterpartyid,securityid,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(0,0,0,0,10,'Done',12,1,'2023-08-01','2023-08-01');

