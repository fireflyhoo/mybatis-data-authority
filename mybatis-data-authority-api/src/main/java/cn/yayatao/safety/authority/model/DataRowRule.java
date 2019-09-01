package cn.yayatao.safety.authority.model;

public interface DataRowRule {
    DataRowRule getLeft();
    Operator getOperator();
    DataRowRule getRight();
}
