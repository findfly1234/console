#### oracle ####
#### �û��� ####
create table bpos_user(
id number(11) not null primary key,
name varchar2(30) not null,
passwd varchar2(100) not null,
create_date date default sysdate,
last_login_date date ,
locked char(1) default 0,
constraint bpos_user_name unique(name)
)
comment on table bpos_user is '�û���';
comment on column  bpos_user.name is '�û���';
comment on column  bpos_user.passwd is '����';
comment on column  bpos_user.create_date  is '����ʱ��';
comment on column  bpos_user.last_login_date  is '�ϴε���ʱ��';
comment on column  bpos_user.locked is '�Ƿ�������0 ��������0 ����';

create sequence bpos_user_id_sequence 
minvalue 1                                  
maxvalue 999999999                
start with 1                                 
increment by 1                         
nocache;

create or replace trigger bpos_user_id_sequence_autoup
before insert on bpos_user                                          
for each row 
begin 
select bpos_user_id_sequence.nextval into :new.id from dual;   
end;


#### ��ɫ�� ####
create table bpos_role(
id number(11) not null primary key,
name varchar2(30) not null,
status char(1) default 0,
constraint bpos_role_name unique(name)
)

comment on table bpos_role is '��ɫ��';
comment on column  bpos_role.name is '��ɫ��';
comment on column  bpos_role.status is '�Ƿ���ã�0 ��������0 ������';

create sequence bpos_role_id_sequence 
minvalue 1                                  
maxvalue 999999999                
start with 1                                 
increment by 1                         
nocache;

create or replace trigger bpos_role_id_sequence_autoup
before insert on bpos_role                                          
for each row 
begin 
select bpos_role_id_sequence.nextval into :new.id from dual;   
end;

#### Ȩ�ޱ� ####
create table bpos_auth(
id number(11) not null primary key,
name varchar2(30) not null,
value varchar2(50) not null,
status char(1) default 0,
constraint bpos_auth_name unique(name),
constraint bpos_auth_value unique(value)
)

comment on table bpos_auth is 'Ȩ�ޱ�';
comment on column  bpos_auth.name is 'Ȩ����';
comment on column  bpos_auth.value is 'Ȩ��ֵ';
comment on column  bpos_auth.status is '�Ƿ���ã�0 ��������0 ������';

create sequence bpos_auth_id_sequence 
minvalue 1                                  
maxvalue 999999999                
start with 1                                 
increment by 1                         
nocache;

create or replace trigger bpos_auth_id_sequence_autoup
before insert on bpos_auth                                          
for each row 
begin 
select bpos_auth_id_sequence.nextval into :new.id from dual;   
end;

#### �û���ɫ������ ####
create table bpos_user_role(
user_id number(11) not null,
role_id number(11) not null
)

#### ��ɫȨ�޹����� ####
create table bpos_role_auth(
auth_id number(11) not null,
role_id number(11) not null
)