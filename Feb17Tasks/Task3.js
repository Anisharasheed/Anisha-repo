function Seperate(a){
var first;
  var last;
  last=a%10;
  first=Math.floor(a/10);
  var sum =first+last
  console.log(a);
  console.log(first);
  console.log(last);
  console.log(sum)
  if(sum%2==0){
    console.log("The sum of the given number is Even");
  }
  else{
    console.log("The sum of the given number is odd")
  }
  
  
}
Seperate(98);
