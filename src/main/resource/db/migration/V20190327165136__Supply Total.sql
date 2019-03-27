create table [Supply Total]
(
  SUPPLYORDER_ID int identity
    constraint [Supply Total_pk]
      primary key nonclustered,
  SUPPLY_QTY int not null,
  SUPPLY_FEE DOUBLE PRECISION not null,
  SUPPLY_TOTAL DOUBLE PRECISION not null,
  constraint [Supply Total_Customer_CUSTOMER_ID_fk]
    foreign key (CUSTOMER_ID) references Customer (CUSTOMER_ID),
  constraint [Supply Total_Late Fee Total_RENTAL_ID_fk]
    foreign key (RENTAL_ID) references [Late Fee Total] (RENTAL_ID),
  constraint [Supply Total_Order_ORDER_NO_fk]
    foreign key (ORDER_NO) references [Order] (ORDER_NO),
  constraint [Supply Total_Report Date_REPORT_ID_fk]
    foreign key (REPORT_ID) references [Report Date] (REPORT_ID),
  constraint [Supply Total_Supply Status_SUPPLY_ID_fk]
    foreign key (SUPPLY_ID) references [Supply Status] (SUPPLY_ID)
)
go