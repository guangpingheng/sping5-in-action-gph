delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;
delete from Users;
delete from User_Authorities;

delete from Ingredient;
insert into Ingredient (id, name, type)
values ('FLTO', 'Flour Tortilla', 'WRAP');
insert into Ingredient (id, name, type)
values ('COTO', 'Corn Tortilla', 'WRAP');
insert into Ingredient (id, name, type)
values ('GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingredient (id, name, type)
values ('CARN', 'Carnitas', 'PROTEIN');
insert into Ingredient (id, name, type)
values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into Ingredient (id, name, type)
values ('LETC', 'Lettuce', 'VEGGIES');
insert into Ingredient (id, name, type)
values ('CHED', 'Cheddar', 'CHEESE');
insert into Ingredient (id, name, type)
values ('JACK', 'Monterrey Jack', 'CHEESE');
insert into Ingredient (id, name, type)
values ('SLSA', 'Salsa', 'SAUCE');
insert into Ingredient (id, name, type)
values ('SRCR', 'Sour Cream', 'SAUCE');

insert into Users (username, password,enabled)
values ('testa', '$2a$10$za7lPS0UhMHqrJT9fatrJuqY7c.nhT5pS.1Vx2bhj2OOUZKZSPNqK', '1');
insert into Users (username, password,enabled)
values ('testb', '$2a$10$MSCodxpB1xlP.qPv1xGXB.TJDl4d7BieeZgRE5HYA3BLfetYh335C', '0');
insert into Users (username, password,enabled)
values ('testc', '$2a$10$oroUQdr/Woh3neWqW02JuuijHE0MTRuRTbi3arsIrNAlvs1iRRwAm', '1');

insert into User_Authorities (username, authority)
values ('testa','role');
insert into User_Authorities (username, authority)
values ('testb','role');
insert into User_Authorities (username, authority)
values ('testc','role');

insert into user_test (user_id,user_name, user_addr)
values ('111','testc1','sh1');
insert into user_test (user_id,user_name, user_addr)
values ('122','testc2','sh2');
insert into user_test (user_id,user_name, user_addr)
values ('333','testc3','sh3');

