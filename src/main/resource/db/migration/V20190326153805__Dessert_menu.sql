create table Dessert_Menu
(
  Report_ID int not null
    constraint Dessert_Menu_ReportDate_Report_ID_fk
      references ReportDate,
  Order_No int not null
    constraint Dessert_Menu_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Dessert_Menu_Customer_CUSTOMER_ID_fk
      references Customer,
  Dessert_Menu int identity
    constraint Dessert_Menu_pk
      primary key nonclustered,
  Dessert_ID int not null
    constraint Dessert_Menu_Dessert_Dessert_ID_fk
      references Dessert (Dessert_ID),
  Dessert_Qty int not null,
  Dessert_Total int not null
)
go
