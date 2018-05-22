-- Insert Into ACTIVITY_ATTRIBUTES table
insert into ACTIVITY_RELATED_RULES(
			activityId,
			ruleGroupId,
			ruleIds)
            values(1,1,"1"); 
            


-- Drop Triger
drop trigger ACTIVITY_RELATED_RULES_AUTO;

-- Drop Sequence
drop sequence ACTIVITY_RELATED_RULES_SEQ;

-- Drop Table
drop table ACTIVITY_RELATED_RULES;


          
