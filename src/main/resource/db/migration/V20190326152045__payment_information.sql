create table PaymentInformation
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  order_no int not null,
  customer_id int not null,
  payment_id int not null,
  payment_history datetime not null,
  order_deposit money not null,
  amount_due money not null,
  payment_fname varchar(24) not null,
  payment_lname varchar(24) not null,
)
go