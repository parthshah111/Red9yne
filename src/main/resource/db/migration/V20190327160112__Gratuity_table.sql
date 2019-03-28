create table Gratuity
(
  Report_ID int not null
    constraint Gratuity_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Gratuity_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Gratuity_Customer_Customer_ID_fk
      references Customer (Customer_ID),
  GratuityOrder_ID int identity
    constraint Gratuity_pk
      primary key nonclustered,
  Gratuity_Type varchar(255) not null,
  Gratuity_Total double precision not null
)
go