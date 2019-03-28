create table Event_Status
(
  Event_Type int identity
    constraint Event_Status_pk
      primary key nonclustered,
  Event_Desc varchar(100) not null
)
go