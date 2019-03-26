create table Manager
(
  MANAGER_ID int identity
    constraint Manager_pk
      primary key nonclustered,
  MANAGER_FNAME VARCHAR(24) not null,
  MANAGER_LNAME VARCHAR(24) not null,
  MANAGER_EMAIL VARCHAR(24) not null,
  MANAGER_PHONE VARCHAR(24) not null
)
go
