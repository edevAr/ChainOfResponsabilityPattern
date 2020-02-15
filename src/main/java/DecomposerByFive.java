public class DecomposerByFive implements Decomposer {
    private Decomposer decomposer;
    public void setNextDecomposer(Decomposer decomposer) {
        this.decomposer = decomposer;
    }

    public void decompose(Number number) {
        if(number.getNumber() != 0){
            int num = number.getNumber() / 5;
            int remain = number.getNumber() % 5;
            if(remain != 0){
                decomposer.decompose(number);
            }else{
                System.out.println(number.getNumber()+" Quintas "+num);
                if(num!=1)
                decompose(new Number(num));
            }
        }
    }
}
