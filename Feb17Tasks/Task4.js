const chooseoperation =() => {
  var operation ='multiply'
  num1 =78;
  num2 = 67;

switch (operation) {
  case 'add':
   console.log(num1 + num2);
    break;
case 'subtract':
   console.log(num1 - num2);
    break;
  case 'multiply':
   console.log(num1 * num2);
    break;
  case 'division':
   console.log(num1 / num2);
    break;
  
  default:
    console.log("no operation is not performed");
}
}
chooseoperation();
