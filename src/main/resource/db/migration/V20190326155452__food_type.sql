create table FoodType
(
  Food_Type int identity
    constraint FoodType_pk
      primary key nonclustered,
  Food_Desc varchar(255) not null
)
go