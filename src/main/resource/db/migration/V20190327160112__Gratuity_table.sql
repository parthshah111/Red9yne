create table Gratuity
(
  GratuityOrder_ID int identity
    constraint Gratuity_pk
      primary key nonclustered,
  Gratuity_Type int not null,
  Gratuity_Total int not null,
  Report_ID int not null
    constraint Gratuity
      references Report_Date (Report_ID),
  Customer_ID int not null
    constraint Gratuity
      references Customer (Customer_ID),
  Order_No int not null
    constraint Gratuity
      references [Order] (Order_No)
)
go