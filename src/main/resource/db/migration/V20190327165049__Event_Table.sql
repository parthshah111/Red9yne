create table Event_Table
(
  EVENT_ID int identity
    constraint Event_Table_pk
      primary key nonclustered,
  EVENT_TYPE VARCHAR(255) references EventStatus(EVENT_TYPE),
  NUM_GUEST integer not null,
  VENUE VARCHAR(255) not null,
  FOOD_ARRIVAL VARCHAR(255) not null,
  COCKTAIL_STARTS SMALLDATETIME not null,
  DINNER_STATUS SMALLDATETIME not null,
  DINNER_ENDS SMALLDATETIME not null,
  CLEAN_UP VARCHAR(255) not null,
  constraint Event_Table_Customer_CUSTOMER_ID_fk
    foreign key (CUSTOMER_ID) references Customer (CUSTOMER_ID),
  constraint Event_Table_Order_ORDER_NO_fk
    foreign key (ORDER_NO) references [Order] (ORDER_NO),
  constraint [Event_Table_Report Date_REPORT_ID_fk]
    foreign key (REPORT_ID) references [Report Date] (REPORT_ID),

)
go