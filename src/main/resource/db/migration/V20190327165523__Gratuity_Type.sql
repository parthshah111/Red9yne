create table Gratuity_Type
(
	Gratuity_Type int identity
		constraint Gratuity_Type_pk
			primary key nonclustered,
	Gratuity_Percentage int not null
)
go
