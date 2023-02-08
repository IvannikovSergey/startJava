--select all
SELECT * FROM Jaegers;

--select no destroyed robots
SELECT * FROM Jaegers WHERE status = 'not destroyed';

--select robots with mark Mark-1 and Mark-4
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

--select robots exept Mark-1 and Mark-4 
SELECT * FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

--sorting robots by desc
SELECT * FROM Jaegers ORDER BY mark DESC;

--select min launch date
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

--select max killKaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

--select avg weigth all robots
SELECT AVG(weight) from Jaegers;

-- select robots which not destroyed and inc kaijuKill
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'not destroyed';

--delete destroyed robots from db
DELETE FROM Jaegers WHERE status = 'not destroyed';