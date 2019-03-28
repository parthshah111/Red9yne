create table Payment_Information
(
  Report_ID int not null
    constraint Payment_Information_ReportDate_Report_ID_fk
      references ReportDate,
  Order_No int not null
    constraint Payment_Information_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Payment_Information_Customer_CUSTOMER_ID_fk
      references Customer,
  Payment_ID int identity
    constraint Payment_Information_pk
      primary key nonclustered,
  Payment_History varchar(255) not null,
  Order_Deposit double precision not null,
  Amount_Due double precision not null,
  Payment_FName varchar(255) not null,
  Payment_LName varchar(255) not null
)
go