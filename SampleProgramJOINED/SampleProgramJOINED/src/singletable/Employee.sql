Drop TABLE Employee2;
CREATE TABLE Employee2 (id NUMBER PRIMARY KEY, 
        type VARCHAR2(5),
	name VARCHAR2(40), 
	startDate VARCHAR2(20), 
	cproject VARCHAR2(30), 
        expertise VARCHAR2(30) 
        
);

INSERT INTO Employee2 VALUES (1,'PM','Peter', '23/JAN/2015 ,'Roads',NULL);
INSERT INTO Employee2 VALUES (2,'PM','John', '13/FEB/2015','Roads',NULL);
INSERT INTO Employee2 VALUES (3,'PM','Mary', '16/MAR/2014','Buildings',NULL);
INSERT INTO Employee2 VALUES (4,'T','Pat', '29/APR/2014',NULL,'Networking');
INSERT INTO Employee2 VALUES (5,'T','Karen', '06/MAY/2014',NULL,'Networking');

