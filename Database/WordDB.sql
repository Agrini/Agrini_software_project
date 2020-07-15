use word_synonym;
drop table word_synonyms;
drop table word;
drop table ws_table;
drop table word_synonym_has_synonyms;
create table word
 (	
	word_id integer ,
    word varchar(255) not null,
	primary key (word)
);
create table ws_table 
(	
	sw_id integer  auto_increment ,
    word varchar(255) not null, 
	synonyms varchar(255) not null,
    primary key(sw_id)
);
select * from ws_table;
select * from word;
drop table word;
drop table ws_table; 
select * from hibernate_sequence;
create table word (word varchar(255) not null, word_id integer, primary key (word));