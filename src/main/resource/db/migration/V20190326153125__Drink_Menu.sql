create table Drink_Menu
(
	Report_ID int not null
		constraint Drink_Menu_ReportDate_Report_ID_fk
			references ReportDate,
	Order_No int not null
		constraint Drink_Menu_Order_Order_No_fk
			references [Order] (Order_No),
	Customer_ID int not null
		constraint Drink_Menu_Customer_CUSTOMER_ID_fk
			references Customer,
	Drink_MenuID int identity
		constraint Drink_Menu_pk
			primary key nonclustered,
	Drink_ID int not null
		constraint Drink_Menu_Drink_DRINK_ID_fk
			references Drink,
	Drink_Qty int not null,
	Drink_Total double precision not null
)
go