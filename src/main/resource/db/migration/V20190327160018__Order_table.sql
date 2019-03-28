create table [Order]
(
  Order_no int identity
    constraint Order_pk
      primary key nonclustered,
  Report_ID int not null
    constraint Order_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Customer_ID int not null
    constraint Order_Customer_CUSTOMER_ID_fk
      references Customer (Customer_ID),
  FoodMenu_ID int not null
    constraint Order_Menu_Total_FoodMenu_ID_fk
      references Menu_Total (FoodMenu_ID),
  Dessert_MenuID int not null
    constraint Order_Dessert_Menu_Dessert_Menu_fk
      references Dessert_Menu (Dessert_Menu),
  TaxOrder_ID int not null
    constraint Order_Tax_TaxOrder_ID_fk
      references Tax (GratuityOrder_ID),
  Rental_ID int not null
    constraint Order_Late_Fee_Rental_ID_fk
      references Late_fee (RENTAL_ID),
  SupplyOrder_ID int not null
    constraint Order_Supply_Total_SupplyOrder_ID_fk
      references Supply_Total (SupplyOrder_ID),
  Delivery_ID int not null
    constraint Order_Delivery_DELIVERY_ID_fk
      references Delivery,
  Staff_ID int not null
    constraint Order_Staff_Staff_ID_fk
      references Staff (Staff_ID),
  GratuityOrder_ID int not null
    constraint Order_Gratuity_GratuityOrder_ID_fk
      references Gratuity (GratuityOrder_ID),
  Drink_MenuID int not null
    constraint Order_Drink_Menu_Drink_MenuID_fk
      references Drink_Menu (Drink_MenuID),
  Order_Status int not null
    constraint Order_Order_Status_Order_Status_fk
    references Order_Status (Order_Status),
  Order_Total money not null
)
go