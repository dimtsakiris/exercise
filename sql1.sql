SELECT sum(OrderDetails.Quantity) FROM [Products]
INNER JOIN OrderDetails ON Products.ProductID = OrderDetails.ProductID
INNER JOIN Orders ON Orders.OrderID = OrderDetails.OrderID
INNER JOIN Customers ON Customers.CustomerID = Orders.CustomerID
WHERE City = 'Madrid'



SELECT * FROM [Products]
INNER JOIN OrderDetails ON Products.ProductID = OrderDetails.ProductID
INNER JOIN Orders ON Orders.OrderID = OrderDetails.OrderID
INNER JOIN Customers ON Customers.CustomerID = Orders.CustomerID
WHERE City = 'Madrid'
