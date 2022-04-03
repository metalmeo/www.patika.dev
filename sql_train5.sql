select * from film where title like'%n' order by length desc limit 5;
select * from film where title like '%n' order by length asc offset 5 limit 10;
select * from customer where store_id=1 order bylast_name desc limit 4;
