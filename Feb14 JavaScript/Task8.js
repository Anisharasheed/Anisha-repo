var price = [20,30,40,50,60,70];
var sum=0;
for(i=0;i<price.length;i++){
  sum += price[i];
}
if(sum/price.length>50){
  console.log("The tomato has given good profit");
  
}
else{
  console.log("No profit");
}
