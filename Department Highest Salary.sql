					Department Highest Salary


select Department.name  as Department, Employee.name as Employee, Employee.salary as Salary
from Employee
join  Department
on Employee.departmentId = Department.id

where Employee.salary = (
    select max(Employee.salary)
    from Employee
    where Employee.departmentId = Department.id
)


