/* Partie USERS */
INSERT INTO USERS (id, firstname, name, login, password) VALUES(1, 'Vrenn', 'Indrani', 'vrenn@gmail.com', 'vrenn');
INSERT INTO USERS (id, firstname, name, login, password) VALUES(2, 'Ivara', 'Streyk', 'ivara@gmail.com', 'ivara');
INSERT INTO USERS (id, firstname, name, login, password) VALUES(3, 'Nikolaos', 'Lehnsherr', 'nikolaos@gmail.com', 'nikolaos');
INSERT INTO USERS (id, firstname, name, login, password) VALUES(4, 'Klarion', 'Brando', 'klarion@gmail.com', 'klarion');
INSERT INTO USERS (id, firstname, name, login, password) VALUES(5, 'Hryfin', 'Danvil', 'hryfin@gmail.com', 'hryfin');
INSERT INTO USERS (id, firstname, name, login, password) VALUES(6, 'Aord', 'Svenn', 'aord@gmail.com', 'aord');

/* Partie ITEMS */
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(1, 'Dragon', 7, '2010-03-31');
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(2, 'Matrix', 5, '1999-06-23');
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(3, 'Harry Potter', 12, '2001-12-01');

INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(4, 'Spirituality and Distortion', 3, '2020-03-27');
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(5, 'Meteora', 6, '2003-03-25');
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(6, '21st Century Breakdown', 5, '2009-05-15');

INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(7, 'Le Nom du vent', 3, '2007-03-27');
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(8, 'La Peste et la Vigne', 4, '2018-10-03');
INSERT INTO ITEM (id, title, nbr_Copies, release_Date) VALUES(9, 'La Compagnie noire', 1, '1984-05-15');

/* Partie DVD, CD et BOOK */
INSERT INTO DVD (id, director, dvd_duration, type) VALUES(1, 'Chris Sanders', 98, 'NORMAL');
INSERT INTO DVD (id, director, dvd_duration, type) VALUES(2, 'Lana Wachowski', 136, 'BLUE_RAY');
INSERT INTO DVD (id, director, dvd_duration, type) VALUES(3, 'Chris Columbus', 152, 'NORMAL');

INSERT INTO CD (id, artist, cd_duration, nbr_titles) VALUES(4, 'Igorrr', 55, 14);
INSERT INTO CD (id, artist, cd_duration, nbr_titles) VALUES(5, 'Linkin Park', 36, 13);
INSERT INTO CD (id, artist, cd_duration, nbr_titles) VALUES(6, 'Green Day', 80, 18);

INSERT INTO BOOK (id, author, num_isbn) VALUES(7, 'Patrick Rothfuss', 9780756404741);
INSERT INTO BOOK (id, author, num_isbn) VALUES(8, 'Patrick K. Dewdney', 1030702128);
INSERT INTO BOOK (id, author, num_isbn) VALUES(9, 'Glen Cook', 2290330582);

/* Partie EMPRUNTS */
INSERT INTO BORROW(id, start_date, end_date, users_id) VALUES(1, '2022-01-06', '2022-06-25', 1);

INSERT INTO BORROW_ITEMS(borrow_id, items_id) VALUES(1, 4);
INSERT INTO BORROW_ITEMS(borrow_id, items_id) VALUES(1, 9);

INSERT INTO BORROW(id, start_date, end_date, users_id) VALUES(2, '2021-11-04', '2021-12-14', 3);

INSERT INTO BORROW_ITEMS(borrow_id, items_id) VALUES(2, 7);

