DROP TABLE IF EXISTS solvedcaches;
CREATE TABLE solvedcaches (id serial PRIMARY KEY, string description, double price, string imageUrl);
INSERT INTO solvedcaches (description, price, imageUrl) VALUES ('description 1', 12.00, 'image 1');
INSERT INTO solvedcaches (description, price, imageUrl) VALUES ('description 2', 13.00, 'image 2');
INSERT INTO solvedcaches (description, price, imageUrl) VALUES ('description 3', 15.00, 'image 3');
INSERT INTO solvedcaches (description, price, imageUrl) VALUES ('description 4', 14.00, 'image 5');
