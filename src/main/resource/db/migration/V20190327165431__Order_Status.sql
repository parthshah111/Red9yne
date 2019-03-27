create table Order_Status
(
	Order_Status int identity
		constraint Order_Status_pk
			primary key nonclustered,
	Order_Desc int not null
)
go