use word_synonym;
drop table word_synonyms;
create table word
 (	
	word varchar(255) not null,
	primary key (word)
);
create table ws_table 
(	word varchar(255) not null, 
	synonym varchar(255) not null,
    primary key (word, synonym)
);
select * from ws_table;
select * from word;
drop table word;
drop table ws_table; 