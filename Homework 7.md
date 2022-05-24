
# واجب اليوم الثالث



## Create Theme parks management  software   ,

Park Class :
rideID , rideName  , rideType , tickets, price

Validation :
rideID : 

1. Cannot be null 
2. Length more than 2

rideName :

1. Cannot be null
2. Length more than 4

rideType :

1. Cannot be null
2. can only have these values (rollercoaster|thriller|water)

tickets :

1. Cannot be null
2. must be a number

price:

1. Cannot be null
2. must be a number




Use project lombok 

Endpoints :
Get all the rides
Add new ride
Update ride
Delete ride


Create end point that takes the ride ID and the amount and return (ticket purchased) and reduce ticket number by 1 (check for available tickets if its >0 , check if amount >= ride price)
Create end point that takes ride ID and refils its tickets (check if the tickets are 0 then you can refil)

## Create Employees management software

Employees class:
ID , name  , age , onLeave, employmentYear ,annualLeave

Validation :
ID : 

1. Cannot be null 
2. Length more than 2

name :

1. Cannot be null
2. Length more than 4

age :

1. Cannot be null
2. It has to be number
3. It must be more than 25

onLeave :

1. must be false 

employmentYear :

1. Cannot be null
2. it has to be number
3. must be a valid year

annualLeave:

1. Cannot be null
2. it has to be number




Use project lombok 

Endpoints :
Get all the Employees
Add new Employee
Update Employee
Delete Employee


Employees apply for an annual leave and and turn their onLeave status to true and reduce annualLeave by 1(Check if employee is on leave return bad request,  if employee applies for leave and has 0 days return bad request)


