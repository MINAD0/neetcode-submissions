-- Write your query below
SELECT name FROM customers where id not in (SELECT customer_id FROM orders) order by id;