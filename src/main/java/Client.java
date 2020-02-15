public class Client {
    Decomposer decomposerByTwo;
    public Client(){
        decomposerByTwo = new DecomposerByTwo();
        Decomposer decomposerByThree = new DecomposerByThree();
        Decomposer decomposerByFive = new DecomposerByFive();
        Decomposer decomposerBySeven = new DecomposerBySeven();

        decomposerByTwo.setNextDecomposer(decomposerByThree);
        decomposerByThree.setNextDecomposer(decomposerByFive);
        decomposerByFive.setNextDecomposer(decomposerBySeven);
    }
    public static void main(String[]args){
        Client client = new Client();

        // Como dato curioso que encontre... todos los numeros capicuas son primos, pero no todos los primos son capicuas
        client.decomposerByTwo.decompose(new Number(777));
    }
}
