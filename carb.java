
public class carb {
    public static double carbonFromPower(String state, double powerBill) {
        String appreviation = state.toUpperCase();
         String[] states = {"Alaska",
                "Alabama",
                "Arkansas",
                "Arizona",
                "California",
                "Colorado",
                "Connecticut",
                "District of Columbia",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Iowa",
                "Idaho",
                "Illinois",
                "Indiana",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Massachusetts",
                "Maryland",
                "Maine",
                "Michigan",
                "Minnesota",
                "Missouri",
                "Mississippi",
                "Montana",
                "North Carolina",
                "North Dakota",
                "Nebraska",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "Nevada",
                "New York",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Virginia",
                "Vermont",
                "Washington",
                 "West Virginia",
                 "Wisconsin",
                "Wyoming"};
        Double[] prices = {11.27, 18.72, 10.25, 8.63, 14.83, 9.64, 17.13, 12.35, 10.09, 10.05,
                9.38, 28.70, 7.93, 8.51, 10.32, 9.33, 10.37, 9.86, 8.95, 13.12, 11.08, 17.67, 11.50,
                10.01, 10.9, 8.48, 9.96, 8.41, 8.15, 16.96, 12.49, 9.65, 13.58, 9.14, 8.59, 10.32,
                7.69, 8.76, 9.42, 17.68, 8.22, 9.32, 10.39, 8.53, 8.24, 15.05, 8.48, 8.84, 9.96, 10.95, 9.50};
        int i=0;
        while (states[i].compareTo(appreviation)<0){
            i++;
        }
        double price=prices[i]/100;
        double kwh = 12*powerBill/price;
        double pounds = 1.4*kwh;
        return pounds*.0005;
    }
}
