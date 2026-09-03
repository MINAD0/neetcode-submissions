-- Write your query below
SELECT c.customer_id FROM customers c where c.revenue > 0 and c.year = 2020 order by c.revenue desc;