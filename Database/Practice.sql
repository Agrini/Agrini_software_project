
insert into emp values (2222, 'Bhavesh','M','B',4000);

select * from emp;
create table project_manager
(	manager_id varchar(3) ,
	manager_name varchar(55) not null,
    dept varchar(15) not null,
    emp_code integer, 
    foreign key(emp_code) references emp(ecode) on delete cascade ,
	check (manager_id<>emp_code)	);
    
//////delete from emp where gross=230;
insert into project_manager
values(758, 'Jigna','IT',301);    

insert into project_manager
values(768, 'Jyotsna','HR',304);    

insert into project_manager
values(718, 'Hetal','Mrktng',303); 

select * from project_manager;
delete from project_manager where emp_code=301;

insert into project_manager
values(738, 'Asha','Accounts',354); 

insert into project_manager
values(658, 'Jenny','Legal',373); 

insert into project_manager
values(738, 'Asha','Accounts',303); 

insert into project_manager
values(658, 'Jenny','Legal',2222);

insert into project_manager
values(758, 'Jigna','IT',303);   
 insert into project_manager
values(758, 'Jigna','IT',304);   
 insert into project_manager
values(758, 'Jigna','IT',351);    
select * from project_manager;

select manager_name, ename from project_manager as pm,emp where emp.ecode=pm.emp_code and emp.gross>2500;

delete from project_manager  where emp_code<>0;
drop table project_manager;

delete from project_manager where emp_code=351;
delete from emp where ecode=351;
