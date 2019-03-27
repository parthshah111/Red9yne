create table Staff
(
	Staff_ID int identity
		constraint Staff_pk
			primary key nonclustered,
	Report_ID int not null
		constraint Staff
			references Report_Date (Report_ID),
	Order_No int not null
		constraint Staff
			references [Order] (Order_No),
	Customer_ID int not null
		constraint Staff
			references Customer (Customer_ID),
	Title_ID int not null
		constraint Staff
			references [Staff Title] (Title_ID),
	Staff_Qty int not null,
	Staff_Fee int not null,
	Staff_Total int not null
)
go