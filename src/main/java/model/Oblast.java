package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 16.1.17..
 */
@DatabaseTable (tableName = "oblast")
public class Oblast {
    public static final String POLJE_NAZIV = "naziv";
    public static final String POLJE_POCETNA_STRANA = "pocetna strana";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NAZIV)
    private String naziv;

    @DatabaseField(columnName = POLJE_POCETNA_STRANA)
    private int pocetnaStrana;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Knjiga knjiga;

    public Oblast() {

    }

    public Oblast(int id, String naziv, int pocetnaStrana, ForeignCollection<Oblast> oblasti) {
        this.id = id;
        this.naziv = naziv;
        this.pocetnaStrana = pocetnaStrana;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getPocetnaStrana() {
        return pocetnaStrana;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setPocetnaStrana(int pocetnaStrana) {
        this.pocetnaStrana = pocetnaStrana;
    }

    @Override
    public String toString() {
        return "Oblast{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", pocetnaStrana=" + pocetnaStrana +
                ", knjiga=" + knjiga +
                '}';
    }
}
