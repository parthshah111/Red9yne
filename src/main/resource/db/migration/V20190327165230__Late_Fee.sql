create table Late_Fee
(
  RENTAL_ID int identity
    constraint Late_Fee_pk
      primary key nonclustered,
  RENTAL_EXP SMALLDATETIME not null,
  RENTAL_RETURN SMALLDATETIME not null,
  LATE_DAY DATETIME not null,
  LATE_FEE DOUBLE PRECISION not null,
  LATE_TOTAL DOUBLE PRECISION not null,
  constraint Late_Fee_Customer_CUSTOMER_ID_fk
    foreign key (CUSTOMER_ID) references Customer (CUSTOMER_ID),
  constraint Late_Fee_Order_ORDER_NO_fk
    foreign key (ORDER_NO) references [Order] (ORDER_NO),
  constraint [Late_Fee_Report Date_REPORT_ID_fk]
    foreign key (REPORT_ID) references [Report Date] (REPORT_ID),
  constraint [Late_Fee_Supply Status_SUPPLY ID_fk]
    foreign key ([SUPPLY ID]) references [Supply Status] ([SUPPLY ID])
)
go