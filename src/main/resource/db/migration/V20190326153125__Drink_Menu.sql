create table DinkMenu
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  order_no int not null,
  customer_id int not null,
  drink_menuid int not null,
  drink_id int not null,
  drink_qty int not null,
  drink_total int not null
)
go