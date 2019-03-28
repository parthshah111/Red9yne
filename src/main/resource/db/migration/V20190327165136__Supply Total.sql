create table Supply_Total
(
  Report_ID int not null
    constraint Supply_Total_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Supply_Total_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Supply_Total_Customer_Customer_ID_fk
      references Customer (Customer_ID),
  Rental_ID int not null
    constraint Supply_Total_Late_Fee_RENTAL_ID_fk
      references Late_Fee (RENTAL_ID),
  SupplyOrder_ID int identity
    constraint Supply_Total_pk
      primary key nonclustered,
  Supply_ID int not null
    constraint Supply_Total_Supply_Supply_ID_fk
      references Supply_Status (SUPPLY_ID),
  Supply_Qty int not null,
  Supply_Fee double precision not null,
  Supply_Total double precision not null
)
go

