SHOW DATABASES;
CREATE DATABASE word_synonym;
USE word_synonym;

/*Creating and filling master table*/
CREATE TABLE word
(
	word_id INTEGER PRIMARY KEY,
    word VARCHAR(40) NOT NULL
);
INSERT INTO word VALUES (1,"competition");
INSERT INTO word VALUES (2,"complete");
INSERT INTO word VALUES (3,"rivalry");
INSERT INTO word VALUES (4,"sad");
INSERT INTO word VALUES (5,"contest");
INSERT INTO word VALUES (6,"gloomy");
INSERT INTO word VALUES (7,"full");
INSERT INTO word VALUES (8,"dejected");


/*Creating and filling child table*/
CREATE TABLE synonym
(
		word_id INTEGER ,
        synonym_id INTEGER,
        FOREIGN KEY (word_id) REFERENCES word(word_id),
        FOREIGN KEY (synonym_id) REFERENCES word(word_id)
);
INSERT INTO synonym VALUES (1,3);
INSERT INTO synonym VALUES (1,5);
INSERT INTO synonym VALUES (2,7);
INSERT INTO synonym VALUES (3,1);
INSERT INTO synonym VALUES (3,5);
INSERT INTO synonym VALUES (4,6);
INSERT INTO synonym VALUES (4,8);
INSERT INTO synonym VALUES (5,1);
INSERT INTO synonym VALUES (5,3);
INSERT INTO synonym VALUES (6,4);
INSERT INTO synonym VALUES (6,8);
INSERT INTO synonym VALUES (7,2);
INSERT INTO synonym VALUES (8,4);
INSERT INTO synonym VALUES (8,6);

select *from word;
select * from synonym;

/*Creating the join as a table*/
create table w_s as
(
	select T1.word as word,T2.word as synonym 
	from word as T1, word as T2, synonym
	where (synonym.word_id=T1.word_id) AND (synonym.synonym_id=T2.word_id)
	order by T1.word ASC
);

select * from w_s;

