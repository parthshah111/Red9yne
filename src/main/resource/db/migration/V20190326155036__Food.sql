create table Food
(
	Food_ID int identity
		constraint Food_pk
			primary key nonclustered,
	Food_Type varchar(255) not null,
	Food_Name varchar(255) not null,
	Food_Price money not null
)
go
