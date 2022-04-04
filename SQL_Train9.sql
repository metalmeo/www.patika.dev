select city.city, country.country from city inner join country on city.country_id = country.id;
select payment.payment_id, customer.first_name, customer.last_name from payment inner join customer on customer.payment_id = payment.id;
select rental.rental_id, customer.first_name, customer.last_name from rental inner join customer customer.rental_id= rental.rental_id;
