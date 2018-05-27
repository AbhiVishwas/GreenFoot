var a = 0;
var b = 0;
var c = 0;

function CalcFood() {
      var foodEnergyUsage = 0;
      var corn = 2;
      var milk = 3;
      var apples = 2.5;
      var eggs = 5;
      var chicken = 5;
      var cheese = 7.5;
      var pork = 12.5;
      var beef = 30.5;
      
      
      var food = document.getElementById('foodInput').value
      var amt = document.getElementById('foodAmnt').value
      debugger;
        if(food == "corn"){
            foodEnergyUsage += (corn*amt)/907.18;
        }
        if(food == "milk"){
            foodEnergyUsage += (milk*amt)/907.18;
        }
        if(food == "apples"){
            foodEnergyUsage += (apples*amt)/907.18;
        }
        if(food == "eggs"){
            foodEnergyUsage += (eggs*amt)/907.18; 
        }
        if(food == "chicken"){
            foodEnergyUsage += (chicken*amt)/907.18;
        }
        if(food == "cheese"){
            foodEnergyUsage += (cheese*amt)/907.18;
        }
        if(food == "pork"){
            foodEnergyUsage += (pork*amt)/907.18;
        }
        if(food == "beef"){
            foodEnergyUsage += (beef*amt)/907.18;
        }
    a = foodEnergyUsage;
    window.alert("Food energy in tons/yr: " + foodEnergyUsage);
   
}

console.log(CalcFood())

function CalcCar(){
  var caremission = 0;
  var carType = document.getElementById('carType').value
  var mpg = document.getElementById('mpg').value
  var daily = document.getElementById('daily').value
  if(carType == "G"){
    var co2pkm = 6760/mpg;
    var co2pm = co2pkm/1.609;
    caremission = co2pm * daily * 365;
  }
  if(carType == "D"){
    var co2pkm = 7440/mpg;
    var co2pm = co2pkm/1.609;
    caremission = co2pm * daily * 365;
    
  }
  if(carType == "E"){
    caremission = 0;
  }
  b  = caremission/90718;
  window.alert("Car emissions in tons/yr: "+ caremission/90718);
  
}
function CalcEnergy  (){
        var total = 0;
        var state = document.getElementById('state').value;
        var powerBill = document.getElementById('powerBill').value
        var states = ["Alaska", "Alabama", "Arkansas", "Arizona", "California", "Colorado", "Connecticut", "District of Columbia", "Delaware", "Florida", "Georgia", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana", "Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", "North Dakota", "Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Vermont", "Washington", "West Virginia", "Wisconsin", "Wyoming"];
        var prices = [11.27, 18.72, 10.25, 8.63, 14.83, 9.64, 17.13, 12.35, 10.09, 10.05, 9.38, 28.7, 7.93, 8.51, 10.32, 9.33, 10.37, 9.86, 8.95, 13.12, 11.08, 17.67, 11.5, 10.01, 10.9, 8.48, 9.96, 8.41, 8.15, 16.96, 12.49, 9.65, 13.58, 9.14, 8.59, 10.32, 7.69, 8.76, 9.42, 17.68, 8.22, 9.32, 10.39, 8.53, 8.24, 15.05, 8.48, 8.84, 9.96, 10.95, 9.5];
        var i = 0;
        debugger;
        while ((states[i].localeCompare(state) < 0)) {
            i++;
        }
        var price = prices[i] / 100;
        var kwh = 12 * powerBill / price;
        var pounds = 1.4 * kwh;
        total = pounds * 5.0E-4;
        c = total;
        window.alert("Energy in tons/yr: " + total);
        
}
var totalCarbon = 0;
  function calculateCarbon(){
        var temp1 = 0;
        var temp2 = 0;
        var temp3 = 0;
        temp1 += a
        
        temp2 += b
        
        temp3 += c
        
        totalCarbon = (a + b + c);
        window.alert("Your total carbon footprint is " + totalCarbon + " tons per year");
   
    }
  function avg(){
        var rank = 0;
        rank = (totalCarbon*28)/2;
        if(rank>=0 && rank<=800)
        {
          window.alert("Your carbon footprint rank out of 800 is: " + rank );
        }
        else
        {
          window.alert("You're off the scale...Try reducing some of your energy values.");
        }
  
    }
  