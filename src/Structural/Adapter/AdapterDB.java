package Structural.Adapter;

public class AdapterDB implements IConnectionSQL {

    private IConnectionNoSQL noSQL;

    public AdapterDB(IConnectionNoSQL noSQL) {
        this.noSQL = noSQL;
    }

    @Override
    public void connection() {
        this.noSQL.connection();
    }

    @Override
    public String runQuery() {
        return this.noSQL.executeQuery();
    }
}
