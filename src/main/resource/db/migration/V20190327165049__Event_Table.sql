create table Event
(
  Report_ID int not null
    constraint Event_ReportDate_Report_ID_fk
      references ReportDate,
  Order_No int not null
    constraint Event_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Event_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Event_ID int identity
    constraint Event_pk
      primary key nonclustered,
  Event_Type varchar(255) not null,
  Num_Guest int not null,
  Venue varchar(255) not null,
  Food_Arrival time not null,
  Cocktail_Starts time not null,
  Dinner_Status varchar(255) not null,
  Dinner_Ends time not null,
  Clean_Up varchar(255) not null
)
go