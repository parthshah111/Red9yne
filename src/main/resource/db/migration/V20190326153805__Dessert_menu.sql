create table DessertMenu
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  order_no int not null,
  customer_id int not null,
  dessert_menu  int not null,
  dessert_id int not null,
  dessert_qty int not null,
  dessert_total money not null
)
go