create table customer
(
  ID int identity
    constraint customer_pk
      primary key nonclustered,
  FirstName VARCHAR(24) not null,
  LastName VARCHAR(24) not null
)