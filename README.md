# java-oop-bmi
Practice peer-reviewed task: Class for BMI calculation.

### The given Instructions for the activity. 

Implement in Eclipse a class called Patient that has a constructor that receives its weight in kilos and its height in meters, both using double. 
Create a method called calculateIMC() that calculates the Body Mass Index according to the formula BMI = weight (kilos) / (height * height (meters)). 
Also create a method called diagnosis() that uses the IMC() method and returns a String according to the following value variations:

- Very severe underweight = BMI below 16 kg / m²
- Severe low weight = BMI between 16 and 16.99 kg / m²
- Low weight = BMI between 17 and 18.49 kg / m²
- Normal weight = BMI between 18.50 and 24.99 kg / m²
- Overweight = BMI between 25 and 29.99 kg / m²
- Grade I obesity = BMI between 30 and 34.99 kg / m²
- Grade II obesity = BMI between 35 and 39.99 kg / m²
- Grade III obesity (morbid obesity) = BMI equal to or greater than 40 kg / m²

The goal is to create a Main class where are create 3 instances of the class Patient with 
different values and print the results in the console of the methods created. 
