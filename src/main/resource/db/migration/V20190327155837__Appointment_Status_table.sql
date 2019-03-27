create table Appointment_Status
(
    Appointment_Type int identity
        constraint Appointment_Status_pk
            primary key nonclustered,
    Appointment_Status int not null
)
go