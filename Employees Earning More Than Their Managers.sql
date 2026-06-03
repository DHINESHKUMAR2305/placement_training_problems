					Employees Earning More Than Their Managers



select E.name as Employee
from Employee E
join Employee X
on E.managerId = X.id
where E.salary > X.salary;
