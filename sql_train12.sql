select count(*) from film where length > (select avg(length) from film);
select count(*) from film where rental_rate = (select max(rental_rate) from film);
select * from film where id = ANY (select min(rental_rate),min(replacement_cost) from film );
select * from payment where id = ALL (select max(customer) from payment);
