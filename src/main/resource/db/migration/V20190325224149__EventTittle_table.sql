create table EventStatus
(
  EVENT_TYPE int identity
    constraint EventStatus_pk
      primary key nonclustered,
  EVENT_STATUS_DESC VARCHAR(100) not null
)
go