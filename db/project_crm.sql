create table tbl_suppliers(id int primary key auto_increment,
name varchar(100),
address varchar(100),
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
deleted_date timestamp null,
status boolean default true);

create table tbl_units(id int primary key auto_increment,
unit_name varchar(100),
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
status boolean default true
);

create table tbl_item_type(id int primary key auto_increment,
type_name varchar(100),
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
deleted_date timestamp null,
status boolean default true
);

create table tbl_items(id int primary key auto_increment,
item_name varchar(255),
item_description text,
item_image varchar(255),
quantity int,
price int,
unit_id int,
item_type_id int,
reorder_level int,
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
deleted_date timestamp null,
status boolean default true
);

alter table tbl_items add foreign key(unit_id) references tbl_units(id);
alter table tbl_items add foreign key(item_type_id) references tbl_item_type(id);

create table tbl_users(id int primary key auto_increment,
username varchar(255),
password varchar(255),
email varchar(255),
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
deleted_date timestamp null,
active boolean default true);

create table tbl_supplier_contacts(id int primary key auto_increment,
supplier_id int,
contact_name varchar(200),
email varchar(200),
phone_no varchar(255),
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
deleted_date timestamp null,
status boolean default true
);

alter table tbl_supplier_contacts add foreign key (supplier_id) references tbl_suppliers(id);

create table tbl_item_suppliers(id int primary key auto_increment,
supplier_id int,
item_id int,
created_date timestamp default current_timestamp,
modified_date timestamp null,
is_deleted boolean default false,
deleted_date timestamp null,
status boolean default true
);
