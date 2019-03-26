create table Delivery
(
  DELIVERY_ID int identity
    constraint Delivery_pk
      primary key nonclustered,
  DELIVERY_FEE money not null
)
go