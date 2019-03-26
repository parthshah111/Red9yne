create table BillingAddress
(
  PAYMENT_ID int identity
    constraint BillingAddress_pk
      primary key nonclustered,
  BILLING_ADDRESS VARCHAR(50) not null,
  BILLING_CITY VARCHAR(24) not null,
  BILLING_STATE VARCHAR(24) not null,
  BILLING_ZIP int,
  [BILLING COUNTRY] VARCHAR(24) not null
)
go

