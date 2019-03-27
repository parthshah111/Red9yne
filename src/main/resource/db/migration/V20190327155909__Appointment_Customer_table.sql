create table Appointment_Customer
(
  Appointment_ID int identity
    constraint Appointment_Customer_pk
      primary key nonclustered,
  Customer_ID int not null
    constraint Appointment_Customer_fk
      references [Customer] (Customer_ID)
)
go