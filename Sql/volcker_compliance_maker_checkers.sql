create table if not exists volcker_compliance_maker_checkers(
volcker_compliance_code Integer not null,
group_code Integer null,
sequence_id Integer null,
role_id varchar(255) null,
group_name varchar(255) null,
maker_checker_type_code Integer null,
maker_checker_type varchar(255) null,
maker_checker_type_desc varchar(255) null,
creation_date varchar(255) null,
modfied_date varchar(255) null,
entity_state varchar(255) null,
constraint volcker_compliance_maker_checkers_pk primary key(volcker_compliance_code));
