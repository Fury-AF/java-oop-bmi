public class BMI {
    private double height, weight;
    public BMI(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    private String interpretationIMC(double bmiRAW) {
        String Result = "";
        String strBMI = String.format("%.02f", bmiRAW);

        if (bmiRAW == 16) {
            Result = "Very severe unweight" + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 16 && bmiRAW <= 16.99) {
            Result = "Severe low weight" + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 17 && bmiRAW <= 18.49) {
            Result = "Low weight" + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 18.50 && bmiRAW <= 24.99) {
            Result = "Normal weight " + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 25 && bmiRAW <= 29.99) {
            Result = "Overweight " + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 30 && bmiRAW <= 34.99) {
            Result = "Grade I obesity " + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 35 && bmiRAW <= 39.99) {
            Result = "Grade II obesity " + "BMI: " + strBMI+"kg/m²";
        } else if (bmiRAW >= 40) {
            Result = "Grade III obesity(morbid obesity) " + "BMI: " + strBMI+"kg/m²";
        }

        return Result;
    }

    public String calculateBMI(){
        double bmiRAW = weight / (height*height);
        return interpretationIMC(bmiRAW);
    }

}
