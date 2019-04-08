create table [Order]
(
  Order_no int identity
    constraint Order_pk
      primary key nonclustered,
  Report_ID int not null,
  Customer_ID int not null,
  FoodMenu_ID int not null,
  Dessert_MenuID int not null,
  TaxOrder_ID int not null,
  Rental_ID int not null,
  SupplyOrder_ID int not null,
  Delivery_ID int not null,
  Staff_ID int not null,
  --   GratuityOrder_ID int not null,
  Drink_MenuID int not null,
  Order_StatusID int not null,
  Order_Total double precision not null
)
go
create table ReportDate
(
  Report_ID int identity
    constraint ReportDate_pk
      primary key nonclustered,
  REPORT_DATE DATETIME not null,
  GRAND_TOTAL double precision not null
)
go

create table Delivery
(
  DELIVERY_ID int identity
    constraint Delivery_pk
      primary key nonclustered,
  DELIVERY_FEE double precision not null
)
go

create table Drink
(
  DRINK_ID int identity
    constraint Drink_pk
      primary key nonclustered,
  DRINK_NAME VARCHAR(24) not null,
  DRINK_DESC VARCHAR(24) not null
)
GO

create table Manager
(
  MANAGER_ID int identity
    constraint Manager_pk
      primary key nonclustered,
  MANAGER_FNAME VARCHAR(24) not null,
  MANAGER_LNAME VARCHAR(24) not null,
  MANAGER_EMAIL VARCHAR(24) not null,
  MANAGER_PHONE VARCHAR(24) not null
)
go

create table Customer
(
  CUSTOMER_ID int identity
    constraint Customer_pk
      primary key nonclustered,
  CUSTOMER_FNAME VARCHAR(24) not null,
  CUSTOMER_LNAME VARCHAR(24) not null,
  CUSTOMER_ADDRESS VARCHAR(50) not null,
  CUSTOMER_CITY VARCHAR(24) not null,
  CUSTOMER_STATE VARCHAR(24) not null,
  CUSTOMER_COUNTRY VARCHAR(24) not null,
  CUSTOMER_PHONE VARCHAR(24) not null,
  CUSTOMER_ALTCONTACT VARCHAR(24),
  CUSTOMER_EMAIL varchar(24) not null
)
go

create table StaffTitle
(
  Tittle_ID int identity
    constraint StaffTittle_pk
      primary key nonclustered,
  Tittle_Desc varchar(100) not null
)
go

create table Event_Status
(
  Event_Type int identity
    constraint Event_Status_pk
      primary key nonclustered,
  Event_Desc varchar(100) not null
)
go

create table Payment_Information
(
  Report_ID int not null
    constraint Payment_Information_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Payment_Information_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Payment_Information_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Payment_ID int identity
    constraint Payment_Information_pk
      primary key nonclustered,
  Payment_History varchar(255) not null,
  Order_Deposit double precision not null,
  Amount_Due double precision not null,
  Payment_FName varchar(255) not null,
  Payment_LName varchar(255) not null
)
go

create table Billing_ID
(
  Billing_ID int identity
    constraint Billing_ID_pk
      primary key nonclustered,
  Payment_ID int not null
    constraint Billing_ID_Payment_Information_Payment_ID_fk
      references Payment_Information (Payment_ID),
  Billing_Address varchar(255) not null,
  Billing_City varchar(255) not null,
  Billing_State varchar(2) not null,
  Billing_Zip int not null,
  Billing_Country varchar(24) not null
)
go

create table Manager_Note
(
  Report_ID int not null
    constraint Manager_Note_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Manager_Note_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Manager_Note_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Manager_ID int not null
    constraint Manager_Note_Manager_MANAGER_ID_fk
      references Manager (MANAGER_ID),
  Note_ID int identity
    constraint Manager_Note_pk
      primary key nonclustered,
  Note_Desc varchar(100) not null,
  Note_Date date not null
)
go

create table Drink_Menu
(
  Report_ID int not null
    constraint Drink_Menu_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Drink_Menu_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Drink_Menu_Customer_CUSTOMER_ID_fk
    references Customer (CUSTOMER_ID),
  Drink_MenuID int identity
    constraint Drink_Menu_pk
      primary key nonclustered,
  Drink_ID int not null
    constraint Drink_Menu_Drink_DRINK_ID_fk
      references Drink (DRINK_ID),
  Drink_Qty int not null,
  Drink_Total double precision not null
)
go

create table Dessert
(
  Dessert_ID int identity
    constraint Dessert_pk
      primary key nonclustered,
  Dessert_name varchar(50) not null,
  Dessert_desc varchar(100) not null,
  Dessert_price double precision not null
)
go

create table Dessert_Menu
(
  Report_ID int not null
    constraint Dessert_Menu_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Dessert_Menu_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Dessert_Menu_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Dessert_MenuID int identity
    constraint Dessert_Menu_pk
      primary key nonclustered,
  Dessert_ID int not null
    constraint Dessert_Menu_Dessert_Dessert_ID_fk
      references Dessert (Dessert_ID),
  Dessert_Qty int not null,
  Dessert_Total double precision not null
)
go

create table FoodType
(
  Food_TypeID int identity
    constraint FoodType_pk
      primary key nonclustered,
  Food_Desc varchar(255) not null
)
go

create table Food
(
  Food_ID int identity
    constraint Food_pk
      primary key nonclustered,
  Food_TypeID int not null
    constraint Food_FoodType_Food_TypeID_fk
      references FoodType (Food_TypeID),
  Food_Name varchar(255) not null,
  Food_Price double precision not null
)
go

create table Menu_Total
(
  Report_ID int not null
    constraint Menu_Total_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  FoodMenu_ID int identity
    constraint Menu_Total_pk
      primary key nonclustered,
  Order_No int not null
    constraint Menu_Total_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Menu_Total_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Food_ID int not null
    constraint Menu_Total_Food_Food_ID_fk
      references Food (Food_ID),
  Food_Qty int not null,
  Food_Total double precision not null
)
go

create table Appointment_Status
(
  Appointment_TypeID int identity
    constraint Appointment_Status_pk
      primary key nonclustered,
  Appointment_Status varchar(24) not null
)
go

create table Appointment
(
  Appointment_ID int identity
    constraint Appointment_pk
      primary key nonclustered,
  Appointment_TypeID int not null
    references Appointment_Status (Appointment_TypeID),
  Appointment_Date date not null
)
go

create table Appointment_Customer
(
  Appointment_ID int not null
    constraint Appointment_Customer_Appointment_Appointment_ID_fk
      references Appointment (Appointment_ID),
  App_Cus_ID int identity
    constraint Appointment_Customer_pk
      primary key nonclustered,
  Customer_ID int not null
    constraint Appointment_Customer_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID)
)
go

create table Tax_Type
(
  Tax_TypeID int identity
    constraint Tax_Type_pk
      primary key nonclustered,
  Tax_Percentage int not null
)
go

create table Tax
(
  Report_ID int not null
    constraint Tax_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Tax_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Tax_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Tax_ID int identity
    constraint Tax_pk
      primary key nonclustered,
  Tax_TypeID int not null
    constraint Tax_Tax_Type_Tax_TypeID_fk
      references Tax_Type (Tax_TypeID),
  Tax_Total double precision not null
)
go

-- create table Gratuity_Type
-- (
--   Gratuity_Type int identity
--     constraint Gratuity_Type_pk
--       primary key nonclustered,
--   Gratuity_Percentage int not null
-- )
-- go
--
-- create table Gratuity
-- (
--   Report_ID int not null
--     constraint Gratuity_ReportDate_Report_ID_fk
--       references ReportDate (Report_ID),
--   Order_No int not null
--     constraint Gratuity_Order_Order_No_fk
--       references [Order] (Order_No),
--   Customer_ID int not null
--     constraint Gratuity_Customer_Customer_ID_fk
--       references Customer (Customer_ID),
--   GratuityOrder_ID int identity
--     constraint Gratuity_pk
--       primary key nonclustered,
--   Gratuity_Type int not null
--     constraint Gratuity_Gratuity_Type_Gratuity_Type_fk
--       references Gratuity_Type (Gratuity_Type),
--   Gratuity_Total double precision not null
-- )
-- go

create table Event
(
  Report_ID int not null
    constraint Event_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Event_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Event_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Event_ID int identity
    constraint Event_pk
      primary key nonclustered,
  Event_Type int not null
    constraint Event_Event_Status_Event_Type_fk
      references Event_Status (Event_Type),
  Num_Guest int not null,
  Venue varchar(255) not null,
  Food_Arrival varchar(24) not null,
  Cocktail_Starts varchar(24) not null,
  Dinner_Status varchar(255) not null,
  Dinner_Ends varchar(24) not null,
  Clean_Up varchar(255) not null
)
go

create table Supply_Status
(
  SUPPLY_ID int identity
    constraint Supply_Status_pk
      primary key nonclustered,
  SUPPLY_NAME varchar(24) not null,
  SUPPLY_STATUS varchar(24) not null
)
go

create table [Late_Fee]
(
  Rental_ID int identity
    constraint [Late_Fee_pk]
      primary key nonclustered,
  Report_ID int not null
    constraint [Late_Fee_ReportDate_Report_ID_fk]
      references ReportDate (Report_ID),
  Order_No int not null
    constraint [Late_Fee_Order_Order_No_fk]
      references [Order] (Order_No),
  Customer_ID int not null
    constraint [Late_Fee_Customer_CUSTOMER_ID_fk]
      references Customer (Customer_ID),
  Supply_ID int not null
    constraint [Late_Fee_Supply_Status_Supply_ID_fk]
      references Supply_Status (SUPPLY_ID),
  Rental_Exp datetime not null,
  Rental_Return datetime not null,
  Late_Day DATETIME not null,
  Late_Fee DOUBLE PRECISION not null,
  Late_Total DOUBLE PRECISION not null
)
go

create table Supply_Total
(
  Report_ID int not null
    constraint Supply_Total_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Supply_Total_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Supply_Total_Customer_Customer_ID_fk
      references Customer (Customer_ID),
  Rental_ID int not null
    constraint Supply_Total_Late_Fee_RENTAL_ID_fk
      references Late_Fee (RENTAL_ID),
  SupplyOrder_ID int identity
    constraint Supply_Total_pk
      primary key nonclustered,
  Supply_ID int not null
    constraint Supply_Total_Supply_Supply_ID_fk
      references Supply_Status (SUPPLY_ID),
  Supply_Qty int not null,
  Supply_Fee double precision not null,
  Supply_Total double precision not null
)
go

create table Order_Status
(
  Order_StatusID int identity
    constraint Order_Status_pk
      primary key nonclustered,
  Order_Desc varchar(24) not null
)
go

create table Staff
(
  Report_ID int not null
    constraint Staff_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Staff_Order_Order_No_fk
      references [Order] (Order_No),
  Customer_ID int not null
    constraint Staff_Customer_CUSTOMER_ID_fk
      references Customer (CUSTOMER_ID),
  Staff_ID int identity
    constraint Staff_pk
      primary key nonclustered,
  Title_ID int not null
    constraint Staff_StaffTitle_Tittle_ID_fk
      references StaffTitle (Tittle_ID),
  Staff_Qty int not null,
  Staff_Fee double precision not null,
  Staff_Total double precision not null
)
go

alter table [Order]
  add constraint Order_ReportDate_Report_ID_fk
    foreign key (Report_ID) references ReportDate (Report_ID);
alter table [Order]
  add constraint Order_Customer_CUSTOMER_ID_fk
    foreign key (Customer_ID) references Customer (Customer_ID);
alter table [Order]
  add constraint Order_Menu_Total_FoodMenu_ID_fk
    foreign key (FoodMenu_ID) references Menu_Total (FoodMenu_ID);
alter table [Order]
  add constraint Order_Dessert_Menu_Dessert_Menu_fk
    foreign key (Dessert_MenuID) references Dessert_Menu (Dessert_MenuID);
alter table [Order]
  add constraint Order_Tax_TaxOrder_ID_fk
    foreign key (TaxOrder_ID) references Tax (Tax_ID);
alter table [Order]
  add constraint Order_Late_Fee_Rental_ID_fk
    foreign key (Rental_ID) references Late_fee (RENTAL_ID);
alter table [Order]
  add constraint Order_Supply_Total_SupplyOrder_ID_fk
    foreign key (SupplyOrder_ID) references Supply_Total (SupplyOrder_ID);
alter table [Order]
  add constraint Order_Delivery_DELIVERY_ID_fk
    foreign key (Delivery_ID) references Delivery (Delivery_ID);
alter table [Order]
  add constraint Order_Staff_Staff_ID_fk
    foreign key (Staff_ID) references Staff (Staff_ID);
-- alter table [Order]
--   add constraint Order_Gratuity_GratuityOrder_ID_fk
--     foreign key (GratuityOrder_ID) references Gratuity (GratuityOrder_ID);
alter table [Order]
  add constraint Order_Drink_Menu_Drink_MenuID_fk
    foreign key (Drink_MenuID) references Drink_Menu (Drink_MenuID);
alter table [Order]
  add constraint Order_Order_Status_Order_StatusID_fk
    foreign key (Order_StatusID) references Order_Status (Order_StatusID);