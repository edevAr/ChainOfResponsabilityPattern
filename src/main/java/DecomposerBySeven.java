public class DecomposerBySeven implements Decomposer {
    private Decomposer decomposer;
    public void setNextDecomposer(Decomposer decomposer) {
        this.decomposer = decomposer;
    }

    public void decompose(Number number) {
        if(number.getNumber() != 0){
            int num = number.getNumber() / 7;
            int remain = number.getNumber() % 7;
            if(remain != 0){
                if(null != decomposer)
                decomposer.decompose(number);
                else
                    System.out.println(number.getNumber()+ " No se puede descomponer mas");
            }else{
                System.out.println(number.getNumber()+" Septimas "+num);
                if(num!=1)
                decompose(new Number(num));
            }
        }
    }
}
