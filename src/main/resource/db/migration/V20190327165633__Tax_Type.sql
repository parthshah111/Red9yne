create table Tax_Type
(
	Tax_Type int identity
		constraint Tax_Type_pk
			primary key nonclustered,
	Tax_Percentage int not null
)
go