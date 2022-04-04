select city.city, country.country from city left join country on city.country_id=country.id;
select payment.payment_id , customer.first_name, customer.last_name from payment right join customer on payment.payment_id = customer.payment_id;
select rental.rental_id, customer.first_name,customer.last_name from rental full join customer on rental.rental_id = customer.rental_id;
