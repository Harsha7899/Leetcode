# Write your MySQL query statement below
select x, y, z, if(x+y>z AND y+z>x AND x+z>y, "Yes", "No") as triangle
from Triangle;