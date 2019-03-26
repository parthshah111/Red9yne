create table Customer
(
  CUSTOMER_ID int identity
    constraint Customer_pk
      primary key nonclustered,
  CUSTOMER_FNAME VARCHAR(24) not null,
  CUSTOMER_LNAME VARCHAR(24) not null,
  CUSTOMER_ADDRESS VARCHAR(50) not null,
  CUSTOMER_CITY VARCHAR(24) not null,
  CUSTOMER_STATE VARCHAR(24) not null,
  CUSTOMER_COUNTRY VARCHAR(24) not null,
  CUSTOMER_PHONE VARCHAR(24) not null,
  CUSTOMER_ALTCONTACT VARCHAR(24),
  CUSTOMER_EMAIL varchar(24) not null
)
go