create table Order
(
  Report_ID int not null
    constraint [Order]
      references [Report_Date] (Report_ID),
  Order_No int identity
    constraint Order_pk
      primary key nonclustered,
  Customer_ID int not null
    constraint [Order]
      references [Customer] (Customer_ID),
  FoodMenu_ID int not null
    constraint [Order]
      references [Food] (Food_ID),
  Dessert_MenuID int not null
    constraint [Order]
      references [Dessert] (Dessert_ID),
  TaxOrder_ID int not null
    constraint [Order]
      references [Tax] (TaxOrder_ID),
  Rental_ID int not null
    constraint [Order]
      references [Late_Fee_Total] (Rental_ID),
  SupplyOrder_ID int not null
    constraint [Order]
      references [Supply_Total] (SupplyOrder_ID),
  Delivery_ID int not null
    constraint [Order]
      references [Delivery] (Delivery_ID),
  Staff_ID int not null
    constraint [Order]
      references [Staff] (Staff_ID),
  GratuityOrder_ID int not null
    constraint [Order]
      references [Gratuity] (GratuityOrder_ID),
  Drink_MenuID int not null
    constraint [Order]
      references [Drink] (Drink_ID),
  Order_Status int not null,
  Order_Total int not null
)
go