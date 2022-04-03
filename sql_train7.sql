select * from film group by rental_rate;
select replacement_cost, count(*) from film group by replacement_cost having count(*)>50;
select store_id, count(*) from customer group_by store_id;
select count(*) from city group by country_id having count (*) limit 1 desc;
