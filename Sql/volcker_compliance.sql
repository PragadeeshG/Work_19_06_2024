create table if not exists volcker_compliance(
volcker_compliance_code Integer not null,
linked_group_effective Integer null,
linked_group_effective_date varchar(255) null,
linked_group_volcker_compliance_desc varchar(255) null,
linked_group_volcker_compliance_short_desc varchar(255) null,
linked_group_decimal_positions Integer null,
linked_group_volcker_compliance_symbol varchar(255) null,
linked_group_volcker_compliance_scale varchar(255) null,
creation_date varchar(255) null,
modfied_date varchar(255) null,
entity_state varchar(255) null,
constraint volcker_compliance_pk primary key(volcker_compliance_code));