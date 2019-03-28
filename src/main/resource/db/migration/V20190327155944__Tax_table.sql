create table Tax
(
  Report_ID int not null
    constraint Tax_ReportDate_Report_ID_fk
      references ReportDate,
  Order_No int not null
    constraint Tax_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Tax_Customer_CUSTOMER_ID_fk
      references Customer,
  GratuityOrder_ID int identity
    constraint Tax_pk
      primary key nonclustered,
  Gratuity_Type int not null,
  Gratuity_Total double precision not null
)
go
