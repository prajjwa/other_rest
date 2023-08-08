INSERT INTO users(id,name,email,role,password) VALUES(0,'Jeff','tom@gmail.com','admin','wordpass');

INSERT INTO book (id, name,user_id) VALUES (0, 'Book1',0);

INSERT INTO bookUser (bookid,userid) VALUES(0,0);

INSERT INTO counterparty (id,name) VALUES(0,'Birla');

INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status,isfav) VALUES(0,'US9128283C60','9128283C6','United States Department of the Treasury','2023-08-07',1.3,'Goverment Bond',1000,'active',0);

INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(0,0,0,0,10,'Pending',12,1,'2023-08-01','2023-08-08');

INSERT INTO users(id,name,email,role,password) VALUES(1,'John Doe','john@gmail.com','user','pass');
INSERT INTO users(id,name,email,role,password) VALUES(2,'Jane Smith','jane@gmail.com','admin','pass');
INSERT INTO users(id,name,email,role,password) VALUES(3,'Michael Lee','michael@gmail.com','user','pass');
INSERT INTO users(id,name,email,role,password) VALUES(4,'Emily','emily@gmail.com','admin','pass');
INSERT INTO users(id,name,email,role,password) VALUES(5,'Sarah Johnson','sarah@gmail.com','user','pass');
INSERT INTO users(id,name,email,role,password) VALUES(6,'Robert White','robert@gmail.com','user','pass');
INSERT INTO users(id,name,email,role,password) VALUES(7,'Lisa Adams','lisa@gmail.com','admin','pass');
INSERT INTO users(id,name,email,role,password) VALUES(8,'David Miller','david@gmail.com','admin','pass');


INSERT INTO book (id, name,user_id) VALUES (1, 'Introduction',1);
INSERT INTO book (id, name,user_id) VALUES (2, 'Advanced Finance',1);
INSERT INTO book (id, name,user_id) VALUES (3,'Portfolio Manegament',3);
INSERT INTO book (id, name,user_id) VALUES (4, 'Options Trading',2);
INSERT INTO book (id, name,user_id) VALUES (5, 'Fixed Income',1);
INSERT INTO book (id, name,user_id) VALUES (6, 'Options Strategies',3);
INSERT INTO book (id, name,user_id) VALUES (7, 'Risk Management',4);
INSERT INTO book (id, name,user_id) VALUES (8, 'Technical Analysis',1);
--INSERT INTO book (id, name,user_id) VALUES (9, 'Algorithmic Trading');
--INSERT INTO book (id, name,user_id) VALUES (10, 'Bonds and Derivatives');

INSERT INTO bookUser (bookid,userid) VALUES(1,1);
--INSERT INTO bookUser (bookid,userid) VALUES(1,2);
INSERT INTO bookUser (bookid,userid) VALUES(2,1);
INSERT INTO bookUser (bookid,userid) VALUES(3,3);
--INSERT INTO bookUser (bookid,userid) VALUES(3,4);
INSERT INTO bookUser (bookid,userid) VALUES(4,2);
INSERT INTO bookUser (bookid,userid) VALUES(5,1);
INSERT INTO bookUser (bookid,userid) VALUES(6,3);
INSERT INTO bookUser (bookid,userid) VALUES(7,4);
INSERT INTO bookUser (bookid,userid) VALUES(8,1);

INSERT INTO counterparty (id,name) VALUES(1,'XYZ Tranding');
INSERT INTO counterparty (id,name) VALUES(2,'ABC Finance');
INSERT INTO counterparty (id,name) VALUES(3,'DEF Securities');
INSERT INTO counterparty (id,name) VALUES(4,'GHI Investments');
INSERT INTO counterparty (id,name) VALUES(5,'JKL Investments');
INSERT INTO counterparty (id,name) VALUES(6,'MNO Securities');
INSERT INTO counterparty (id,name) VALUES(7,'PQR Holdings');
INSERT INTO counterparty (id,name) VALUES(8,'STU Capital');

INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status,isfav) VALUES(1,'ISIN12345678','CUSIP1234','Apas pvt. ltd.','2025-12-31',0.05,'Corporate Bond',1000,'active',0);
INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status,isfav) VALUES(2,'ISIN87654321','CUSIP4321','Goverment Bond','2030-06-30',0.03,'Goverment Bond',1000,'active',0);
INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status,isfav) VALUES(3,'ISIN55555555','CUSIP7890','pop pvt. ltd.','2028-08-15',0.04,'Corporate Bond',1000,'active',0);
INSERT INTO security (id,isin,cusip,issuer,maturitydate,coupon,type,facevalue,status,isfav) VALUES(4,'ISIN88888888','CUSIP1010','Goverment Bond','2032-03-20',0.025,'Goverment Bond',1000,'active',0);


INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(1,1,1,1,100,'Completed',105.0,1,'2023-07-15','2023-07-20');
INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(2,2,2,2,50,'Pending',98.5,2,'2023-07-16','2023-07-22');
INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(3,3,3,1,75,'Completed',103.2,1,'2023-07-17','2023-07-23');
INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(4,4,1,2,30,'Pending',97.0,2,'2023-07-18','2023-07-24');
--INSERT INTO trade (id,bookid,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(5,9,3,3,60,'Completed',110.0,1,'2023-07-20','2023-07-25');
--INSERT INTO trade (id,bookid,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(6,10,2,4,40,'Pending',95.5,2,'2023-07-21','2023-07-26');
INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(7,6,4,3,90,'Completed',102.7,1,'2023-07-22','2023-07-27');
INSERT INTO trade (id,book_id,counterpartyid,security_id,quantity,status,price,buy_sell,tradedate,settlementdate) VALUES(8,5,1,4,20,'Pending',96.8,2,'2023-07-23','2023-07-28');













