create table Menu_Total
(
  Report_ID int not null
    constraint Menu_Total_ReportDate_Report_ID_fk
      references ReportDate,
  FoodMenu_ID int identity
    constraint Menu_Total_pk
      primary key nonclustered,
  	Order_No int not null
  		constraint Menu_Total_Order_Order_No_fk
  			references [Order] (Order_No),
  Customer_ID int not null
    constraint Menu_Total_Customer_CUSTOMER_ID_fk
      references Customer,
  Food_ID int not null
    constraint Menu_Total_Food_Food_ID_fk
      references Food (Food_ID),
  Food_Qty int not null,
  Food_Total int not null
)
go
