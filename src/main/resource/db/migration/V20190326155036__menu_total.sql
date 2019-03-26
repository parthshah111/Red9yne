create table MenuTotal
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  foodmenu_id int not null,
  order_no int not null,
  customer_id int not null,
  food_id int not null,
  food_qty int not null,
  food_total money not null
)
go