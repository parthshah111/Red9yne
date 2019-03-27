create table Tax
(
	TaxOrder_ID int identity
		constraint Tax_pk
			primary key nonclustered,
	Tax_Type int not null,
	Tax_Total int not null,
	Report_ID int not null
		constraint Tax
			references [Report_Date] (Report_ID),
	Order_No int not null
		constraint Tax
			references [Order] (Order_No),
	Customer_ID int not null
		constraint Tax
			references [Customer] (Customer_ID)
)
go