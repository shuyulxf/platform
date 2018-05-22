--Create User Earn Award Info
create table ACTIVITY_RULES
(
	ruleId NUMBER NOT NULL primary key,
	ruleName VARCHAR2(100) NOT NULL,
	ruleGroupId NUMBER NOT NULL,
	ruleCondition VARCHAR2(4000) NULL,
	ruleAction VARCHAR2(4000) NOT NULL,
	ruleFuncs BLOB,
	ruleWeight NUMBER(1) DEFAULT 9,
	constraint fk_ruleGroupId foreign key (ruleGroupId) references ACTIVITY_RULE_GROUPS(ruleGroupId)
);

--Create User Earn Award Info Sequence
create sequence ACTIVITY_RULES_SEQ
increment by 1
start with 1      
nomaxvalue         
nocycle
cache 10;  

--Create Trigger for Table User Earn Award Info Before Insert
create trigger ACTIVITY_RULES_AUTO 
before insert 
	on ACTIVITY_RULES 
	for each row
begin
	select ACTIVITY_RULES_SEQ.nextval into:new.ruleId from dual;
end;   

--Create Index for Table  User Earn Award Info on ruleGroupId and ruleWeight
create index ACTIVITY_RULES_INDEX
  on ACTIVITY_RULES(ruleGroupId, ruleWeight);
