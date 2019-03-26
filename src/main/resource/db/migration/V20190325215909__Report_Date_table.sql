create table ReportDate
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  REPORT_DATE DATETIME not null,
  GRAND_TOTAL MONEY not null
)
go

