var day= "Saturday"
switch (day) {
  case 'Monday':
    console.log("start of the week");
    break;
  case 'Tuesday':
  case 'wednesday':
  case 'Thursday':
    console.log("mid of the week");
    break;
  case 'Friday':
    console.log("last working day of the week");
    break;
  case 'Saturday':
    console.log("Weekend - Saturday");
    break;
    case 'Sunday':
    console.log("Weekend- sunday");
    break;
  
  default : console.log("invalid input");
  
