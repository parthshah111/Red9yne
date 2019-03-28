create table [Late_Fee]
(
  Rental_ID int identity
    constraint [Late_Fee_pk]
      primary key nonclustered,
  Report_ID int not null
    constraint [Late_Fee_ReportDate_Report_ID_fk]
      references ReportDate (Report_ID),
  Order_No int not null
    constraint [Late_Fee_Order_Order_No_fk]
      references [Order] (Order_No),
  Customer_ID int not null
    constraint [Late_Fee_Customer_CUSTOMER_ID_fk]
      references Customer (Customer_ID),
  Supply_ID int not null
    constraint [Late_Fee_Supply_Status_Supply_ID_fk]
      references Supply_Status (SUPPLY_ID),
  Rental_Exp int not null,
  Rental_Return int not null,
  Late_Day DATETIME not null,
  Late_Fee DOUBLE PRECISION not null,
  Late_Total DOUBLE PRECISION not null
)
go