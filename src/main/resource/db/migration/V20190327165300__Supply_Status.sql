create table Supply_Status
(
  SUPPLY_ID int identity
    constraint Supply_Status_pk
      primary key nonclustered,
  SUPPLY_NAME int not null,
  SUPPLY_STATUS int not null
)
go