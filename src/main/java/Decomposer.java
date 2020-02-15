public interface  Decomposer {
    public void setNextDecomposer(Decomposer decomposer);
    public void decompose(Number number);
}
