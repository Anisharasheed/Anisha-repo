const a =9;
var c =1;
var count =0;

while(c<=a)
{
  if(a% c === 0)
  {
    count++;
  }
  c++;
}
if(count === 2)
{
   console.log("the number is prime");
}
else{
  console.log("the number is not a prime number");
}
