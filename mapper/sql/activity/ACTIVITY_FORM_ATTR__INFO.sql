--Create Activity Form Attrs
/*
* formAttrNameType: 
* 1 代表 activityGeneralSetting
* 2 代表  activityAwardSetting
* 3 代表  activityReplySetting
* 4 代表   activityExtendSetting
*
* formAttrNameFillType: 
* 1 代表 input
* 2 代表  select
* 3 代表  multiselect
* 4 待补充
*/
create table ACTIVITY_FORM_ATTR_INFO
(
	formAttrInfoId NUMBER NOT NULL primary key,
	formAttrName VARCHAR2(40) NOT NULL UNIQUE,
	formAttrNameLabel VARCHAR2(100) NOT NULL,
	formAttrNameDefaultValue VARCHAR2(100),
	formAttrNameValueMaxLength NUMBER,
	formAttrNameType NUMBER NOT NULL,
	formAttrNameFillType NUMBER NOT NULL
);

--Create Activity Form Attrs Sequence
create sequence ACTIVITY_FORM_ATTR_INFO_SEQ
increment by 1
start with 1      
nomaxvalue         
nocycle
cache 10;  

--Create Trigger for Table Activity Form Attrs Before Insert
create trigger ACTIVITY_FORM_ATTR_INFO_AUTO 
before insert 
	on ACTIVITY_FORM_ATTR_INFO 
	for each row
begin
	select ACTIVITY_FORM_ATTR_INFO_SEQ.nextval into:new.formAttrInfoId from dual;
end;   

--Create Index for Table Activity Form Attrs on formAttrNameType and formAttrName
create index ACTIVITY_FORM_ATTR_INFO_INDEX
  on ACTIVITY_FORM_ATTR_INFO (formAttrNameType, formAttrName);