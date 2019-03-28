create table Manager_Note
(
  Report_ID int not null
    constraint Manager_Note_ReportDate_Report_ID_fk
      references ReportDate,
  Order_No int not null
    constraint Manager_Note_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Manager_Note_Customer_CUSTOMER_ID_fk
      references Customer,
  Manager_ID int not null
    constraint Manager_Note_Manager_MANAGER_ID_fk
      references Manager,
  Note_ID int identity
    constraint Manager_Note_pk
      primary key nonclustered,
  Note_Desc varchar(100) not null,
  Note_Date date not null
)
go