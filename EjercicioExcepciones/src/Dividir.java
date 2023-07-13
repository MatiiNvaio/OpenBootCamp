public class Dividir {

    public int dividir(Integer divisor, Integer dividendo) throws ExceptionDivision {
        if(dividendo == 0){
            throw new ExceptionDivision(dividendo.toString());
        }else{
            return divisor / dividendo;
        }
    }
}
