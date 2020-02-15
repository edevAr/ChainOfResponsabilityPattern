public class DecomposerByTwo implements Decomposer {

    private Decomposer decomposer;

    public void setNextDecomposer(Decomposer decomposer) {
        this.decomposer = decomposer;
    }

    public void decompose(Number number) {
        if(number.getNumber() != 0){
            int num = number.getNumber() / 2;
            int remain = number.getNumber() % 2;
            if(remain != 0){
                decomposer.decompose(number);
            }else{
                if(num!=1)
                System.out.println(number.getNumber()+" Mitades "+num);
                if(num!=1)
                decompose(new Number(num));
            }
        }
    }
}
