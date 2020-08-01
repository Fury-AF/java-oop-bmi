public class BMI  extends Athlete{
    public BMI(String name, double weight, double height) {
        super(name, height, weight);
    }

    public String diagnostic(){
        double bmiRAW = calculateBMI();
        String Result = name+" has ";
        String strBMI = String.format("%.02f", bmiRAW);

        if (bmiRAW <= 16) {
            Result += "Very severe unweight";
        } else if (bmiRAW >= 16 && bmiRAW <= 16.99) {
            Result += "Severe low weight";
        } else if (bmiRAW >= 17 && bmiRAW <= 18.49) {
            Result += "Low weight";
        } else if (bmiRAW >= 18.50 && bmiRAW <= 24.99) {
            Result += "Normal weight";
        } else if (bmiRAW >= 25 && bmiRAW <= 29.99) {
            Result += "Overweight";
        } else if (bmiRAW >= 30 && bmiRAW <= 34.99) {
            Result += "Grade I obesity";
        } else if (bmiRAW >= 35 && bmiRAW <= 39.99) {
            Result += "Grade II obesity";
        } else if (bmiRAW >= 40) {
            Result += "Grade III obesity(morbid obesity)";
        }

        Result += " BMI: "+strBMI+"kg/m²";
        return Result;
    }

    public double calculateBMI(){
       return weight / (height*height);
    }

}
