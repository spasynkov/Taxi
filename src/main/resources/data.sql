INSERT INTO refill (date, liters, price) VALUES ({ts '2023-11-24 00:00:00.00'}, 20, 1099.80);
INSERT INTO refill (date, liters, price) VALUES ({ts '2023-11-26 00:00:00.00'}, 15, 744.45);

INSERT INTO ride (date, distance, type) VALUES ({ts '2023-11-25 00:00:00.00'}, 69, 1);
INSERT INTO ride (date, distance, type) VALUES ({ts '2023-11-26 00:00:00.00'}, 79, 1);
INSERT INTO ride (date, distance, type) VALUES ({ts '2023-11-27 00:00:00.00'}, 45, 1);

INSERT INTO income (date, sum, type)
VALUES ({ts '2023-11-25 00:00:00.00'}, 710.78, 0);
INSERT INTO income (date, sum, type)
VALUES ({ts '2023-11-26 00:00:00.00'}, 925.97, 0);
INSERT INTO income (date, sum, type)
VALUES ({ts '2023-11-27 00:00:00.00'}, 564.05, 0);