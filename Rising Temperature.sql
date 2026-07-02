					Rising Temperature



select W1.id as ID from 
Weather W1
join Weather W2
on DATEDIFF(W1.recordDate , W2.recordDate) = 1
where W1.temperature > W2.temperature
