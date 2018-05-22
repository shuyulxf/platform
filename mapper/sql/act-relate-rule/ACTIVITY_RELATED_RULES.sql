--Create Activity info table
create table ACTIVITY_RELATED_RULES
(
	relatedId NUMBER  NOT NULL,
	activityId NUMBER NOT NULL,
	ruleGroupId NUMBER NOT NULL,
	ruleIds VARCHAR2(2000) NOT NULL,
	activityFlowType NUMBER(1) default 0,
	constraint pk_arr PRIMARY KEY (activityId, ruleGroupId),
	constraint fk_arr_activityId foreign key (activityId) references ACTIVITY_ATTRIBUTES(activityId),
	constraint fk_arr_ruleGroupId foreign key (ruleGroupId) references ACTIVITY_RULE_GROUPS(ruleGroupId)
);

--Create Activity Info Sequence
create sequence ACTIVITY_RELATED_RULES_SEQ
increment by 1
start with 1      
nomaxvalue         
nocycle
cache 10;  


--Create Trigger for Table Activity Before Insert
create trigger ACTIVITY_RELATED_RULES_AUTO 
before insert 
	on ACTIVITY_RELATED_RULES 
	for each row
begin
	select ACTIVITY_RELATED_RULES_SEQ.nextval into:new.relatedId from dual;
end;   
