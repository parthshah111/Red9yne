create table Drink
(
  DRINK_ID int identity
    constraint Drink_pk
      primary key nonclustered,
  DRINK_NAME VARCHAR(24) not null,
  DRINK_DESC VARCHAR(24) not null
)
GO