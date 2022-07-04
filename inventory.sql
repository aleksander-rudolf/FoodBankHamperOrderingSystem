/* ENSF 409 W22 Project Example Database
 2022 Barcomb and Marasco
 
 Each time this file is executed, it will reset the database to the original state defined below.
 
 */

DROP DATABASE IF EXISTS FOOD_INVENTORY;
CREATE DATABASE FOOD_INVENTORY; 
USE FOOD_INVENTORY;


DROP TABLE IF EXISTS DAILY_CLIENT_NEEDS;
CREATE TABLE DAILY_CLIENT_NEEDS (
	ClientID		int not null AUTO_INCREMENT,
	Client			varchar(25),
	WholeGrains		int,
	FruitVeggies	int,
	Protein			int,
	Other			int,
	Calories		int,
	primary key (ClientID)
);

INSERT INTO DAILY_CLIENT_NEEDS (Client, WholeGrains, FruitVeggies, Protein, Other, Calories)
VALUES
('Adult Male',	25,	25,	25,	25,	100),
('Adult Female', 20, 40, 10, 30, 150),
('Child over 8', 40, 40, 5, 15, 200),
('Child under 8', 30, 30, 15, 15, 100);

DROP TABLE IF EXISTS AVAILABLE_FOOD;
CREATE TABLE AVAILABLE_FOOD (
	ItemID			int not null AUTO_INCREMENT,
	Name			varchar(50),
	GrainContent	int,
	FVContent		int,
	ProContent		int,
	Other			int,
	Calories		int,
	primary key (ItemID)
);

INSERT INTO AVAILABLE_FOOD (Name, GrainContent, FVContent, ProContent, Other, Calories)
VALUES
('Tomato Sauce, jar', 0, 100, 0, 0, 175), 
('Apple, dozen', 0, 100, 0, 0, 624), 
('Granola Bar, box', 71, 0, 6, 23, 936), 
('Chicken broth, can', 0, 0, 0, 100, 175), 
('Baby carrots, pound', 0, 100, 0, 0, 159), 
('Broccoli, 3 bunches', 0, 92, 8, 0, 621), 
('Wheat bread, loaf', 100, 0, 0, 0, 175), 
('Orange, dozen', 0, 100, 0, 0, 864), 
('Eggs, dozen', 0, 0, 9, 91, 864), 
('Chicken breast, pound', 0, 0, 100, 0, 175), 
('Pasta, dry, pound', 75, 0, 13, 12, 1683);