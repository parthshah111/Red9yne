create table StaffTitle
(
  Tittle_ID int identity
    constraint StaffTittle_pk
      primary key nonclustered,
  Tittle_Desc varchar(100) not null
)
go