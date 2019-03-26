create table ManagerNote
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  REPORT_DATE DATETIME not null,
  Order_number int not null,
  customer_id int not null,
  manager_id int not null,
  note_id int not null,
  note_desc varchar(100),
  note_date DATETIME
)
go