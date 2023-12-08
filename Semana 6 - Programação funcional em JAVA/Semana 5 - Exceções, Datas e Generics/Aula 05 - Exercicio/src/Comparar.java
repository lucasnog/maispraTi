public class Comparar {
    public <T extends Number> T compararNumeros(T num1, T num2){

        if(num1.doubleValue() > num2.doubleValue()){
            return num1;
        }else return num2;

    }
}
