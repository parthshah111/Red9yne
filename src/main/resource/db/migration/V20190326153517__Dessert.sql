create table Dessert
(
  Dessert_ID int identity
    constraint Dessert_pk
      primary key nonclustered,
  Dessert_name varchar(50) not null,
  Dessert_desc varchar(100) not null,
  Dessert_price money not null
)
go

