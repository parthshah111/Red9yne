create table Appointment
(
	Appointment_ID int identity
		constraint Appointment_pk
			primary key nonclustered,
	Appointment_Type int not null
	  references Appointment_Status (Appointment_Type),
	Appointment_Date int not null
)
go