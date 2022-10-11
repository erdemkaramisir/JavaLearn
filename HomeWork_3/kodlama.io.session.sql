
-- SELECT * from products p inner join order_details od
-- on p.product_id= od.product_id
-- inner join orders O
-- on o.order_id = od.order_id


--select * from products p  left join order_details od

--on p.product_id=od.product_id

-- inner join SADECE iki tabloda da eşleşenleri bir araya getirir. eşleşmeyen data varsa onu getirmez

--SELECT products.product_id, products.product_name, products.unit_price, categories.category_name
-- from Products inner join categories
-- on products.category_id= categories.category_id where products.unit_price>10



-- ilk önce where bloğu çalışır. bana unitPrice ı 20 den fazla, stok adedi 10 dan az olna kategorileri ver

--select  category_id, count(*) from products where unit_price>20 group by category_id having count(*)<10 order by count

-- yönetim: bana stoğunda 10 dan az ürün olan kategorileri ver derse;

--SELECT category_id, count(*) from products GROUP BY category_id having count(*)<10 order by category_id


-- her kategoride kaç ürün olduğunu gösteriyor

--select category_id, count(*) from products GROUP BY category_id ORDER BY category_id



--SELECT count(*) Adet  from products where category_id=2




--select category_id,count(*) from products group by category_id

-- group by kullanırsan * ile seçim yapamazsın.
--select category_id from products group by category_id

--select count(*) from products where category_id=2


-- products içerisindeki tüm satırları say
--select count(*) from products

--select * from products where category_id=1 order by unit_price DESC

-- descending (düşen)  azalan demek  
--select * from products order by unit_price DESC


-- ascending artan demek default olarak geliyor
--select * from products order by unit_price asc 



-- buradaki sıralama öncelikle categoryid yi sonrasında product name i sıralıyor

--select * from products order by category_id, product_name


--  -buradaki sıralama isme göre

--select * from products order by product_name

 --SELECT * FROM products

--select contact_name, company_name, city from customers

--select contact_name adi , company_name şirket, city şehir from customers

-- select * from Customers where contact_name='Yang Wang'

--select * from products where product_name='Gravad lax'

--case insensitive
--select *from products where category_id=1 or category_id=3

--select * from products where category_id=1 and unit_price>10

--select den sonra seçilen kısım colonlardır.

--select contact_name, company_name, city from customers