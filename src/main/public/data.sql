INSERT INTO book (id, name) VALUES (0, 'Book1');

INSERT INTO users(id,name,email,role) VALUES(0,'Jeff','tom@gmail.com','admin');

INSERT INTO bookUser (bookid,userid) VALUES(0,0);

INSERT INTO counterparty (id,name) VALUES(0,'Birla');

INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status) VALUES(0,'US9128283C60','9128283C6','United States Department of the Treasury','2023-08-07',1.3,'Goverment Bond',1000,'active');

INSERT INTO trade (id,bookid,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(0,0,0,0,10,'Pending',12,1,'2023-08-01','2023-08-08');

