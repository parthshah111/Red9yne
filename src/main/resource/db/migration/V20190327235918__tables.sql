create table [Order]
(
  Order_no int identity
    constraint Order_pk
      primary key nonclustered,
  Report_ID int not null,
  Customer_ID int not null,
  Rental_ID int not null,
  Delivery_ID int not null,
  Staff_ID int not null,
  Order_Status int not null,
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

create table Payment_Information
(
  Report_ID int not null
    constraint Payment_Information_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
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
  Billing_Country int not null
)
go

create table Manager_Note
(
  Report_ID int not null
    constraint Manager_Note_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
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

create table Order_Drinks
(
  Drink_ID int not null
    constraint Order_Drinks_Drink_Drink_ID_fk
      references Drink (Drink_ID),
  Order_No int not null
    constraint Order_Drinks_Order_Order_No_fk
      references [Order] (Order_No),
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

create table Order_Dessert
(
  Dessert_ID int not null
    constraint Order_Dessert_Dessert_Dessert_ID_fk
      references Dessert (Dessert_ID),
  Order_No int not null
    constraint Order_Dessert_Order_Order_No_fk
      references [Order] (Order_No),
  Dessert_Qty int not null,
  Dessert_Total int not null
)
go

create table FoodType
(
  Food_Type int identity
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
  Food_Type int not null
    constraint Food_FoodType_Food_Type_fk
      references FoodType (Food_Type),
  Food_Name varchar(255) not null,
  Food_Price double precision not null
)
go

create table Order_Food
(
  Order_No int primary key
      references [Order] (Order_No),
  Food_ID int not null
    constraint Order_Food_Food_Food_ID_fk
      references Food (Food_ID),
  Food_Qty int not null,
  Food_Total int not null
)
go

create table Appointment
(
  Appointment_ID int identity
    constraint Appointment_pk
      primary key nonclustered,
  Appointment_Type int not null,
  Appointment_Date varchar(255) not null,
  Appointment_Status varchar(255) not null
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
  Tax_Type int identity
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
  Tax_ID int identity
    constraint Tax_pk
      primary key nonclustered,
  Tax_Type int not null
    constraint Tax_Tax_Type_Tax_Type_fk
      references Tax_Type (Tax_Type),
  Tax_Total double precision not null
)
go

create table Gratuity_Type
(
  Gratuity_Type int identity
    constraint Gratuity_Type_pk
      primary key nonclustered,
  Gratuity_Percentage int not null
)
go

create table Gratuity
(
  Report_ID int not null
    constraint Gratuity_ReportDate_Report_ID_fk
      references ReportDate (Report_ID),
  Order_No int not null
    constraint Gratuity_Order_Order_No_fk
      references [Order] (Order_No),
  GratuityOrder_ID int identity
    constraint Gratuity_pk
      primary key nonclustered,
  Gratuity_Type int not null
    constraint Gratuity_Gratuity_Type_Gratuity_Type_fk
      references Gratuity_Type (Gratuity_Type),
  Gratuity_Total double precision not null
)
go

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
  Event_Type int not null,
  Num_Guest int not null,
  Venue varchar(255) not null,
  Food_Arrival varchar(24) not null,
  Cocktail_Starts varchar(24) not null,
  Dinner_Status varchar(255) not null,
  Dinner_Ends varchar(24) not null,
  Event_status int not null
)
go

create table Supply_Status
(
  SUPPLY_ID int identity
    constraint Supply_Status_pk
      primary key nonclustered,
  SUPPLY_NAME int not null,
  SUPPLY_STATUS int not null
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
  Rental_Exp int not null,
  Rental_Return int not null,
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
  Rental_ID int not null
    constraint Supply_Late_Fee_Rental_ID_fk
      references Late_Fee (Rental_ID),
  Supply_ID int identity
    constraint [Supply_Total_pk]
      primary key nonclustered,
  Supply_Qty int not null,
  Supply_Fee double precision not null,
  Supply_Total double precision not null
)
go

create table Supply_Order
(
  Order_No int not null
    constraint Supply_Order_Order_Order_No_fk
      references [Order] (Order_No),
  Supply_ID int not null
    constraint Supply_Order_Supply_Total_Supply_ID_fk
      references Supply_Total (Supply_ID),
  Supply_Total double precision not null,
  Supply_Qty int not null
)
go

create table Order_Status
(
  Order_Status int identity
    constraint Order_Status_pk
      primary key nonclustered,
  Order_Desc int not null
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
  add constraint Order_Late_Fee_Rental_ID_fk
    foreign key (Rental_ID) references Late_fee (RENTAL_ID);
alter table [Order]
  add constraint Order_Delivery_DELIVERY_ID_fk
    foreign key (Delivery_ID) references Delivery (Delivery_ID);
alter table [Order]
  add constraint Order_Staff_Staff_ID_fk
    foreign key (Staff_ID) references Staff (Staff_ID);
alter table [Order]
  add constraint Order_Order_Status_Order_Status_fk
    foreign key (Order_Status) references Order_Status (Order_Status);

