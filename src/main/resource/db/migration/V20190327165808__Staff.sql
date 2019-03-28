create table Staff
(
  Report_ID int not null
    constraint Staff_ReportDate_Report_ID_fk
      references ReportDate,
  Order_No int not null
    constraint Staff_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Staff_Customer_CUSTOMER_ID_fk
      references Customer,
  Staff_ID int identity
    constraint Staff_pk
      primary key nonclustered,
  Title_ID int not null
    constraint Staff_StaffTitle_Tittle_ID_fk
      references StaffTitle,
  Staff_Qty int not null,
  Staff_Fee double precision not null,
  Staff_Total double precision not null
)
go