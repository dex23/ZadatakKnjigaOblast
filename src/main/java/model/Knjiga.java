package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 * Created by androiddevelopment on 16.1.17..
 */
//@DatabaseField(tableName = "knjiga")
public class Knjiga {
    public static final String POLJE_NASLOV = "naslov";
    public static final String POLJE_BROJ_STRANA = "broj strana";
    public static final String POLJE_DATUM = "datum";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_BROJ_STRANA)
    private int brojStrana;

    @DatabaseField(columnName = POLJE_NASLOV)
    private String naslov;
    @DatabaseField(columnName = POLJE_DATUM)
    private Date datumIzdanja;

    private boolean prisutna;

    public Knjiga(int id, int brojStrana, String naslov, Date datumIzdanja, boolean prisutna) {
        this.id = id;
        this.brojStrana = brojStrana;
        this.naslov = naslov;
        this.datumIzdanja = datumIzdanja;
        this.prisutna = prisutna;
    }

    public Knjiga() {
    }

    public static String getPoljeNaslov() {
        return POLJE_NASLOV;
    }

    public static String getPoljeBrojStrana() {
        return POLJE_BROJ_STRANA;
    }

    public static String getPoljeDatum() {
        return POLJE_DATUM;
    }

    public int getId() {
        return id;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public String getNaslov() {
        return naslov;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public boolean isPrisutna() {
        return prisutna;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public void setPrisutna(boolean prisutna) {
        this.prisutna = prisutna;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", brojStrana=" + brojStrana +
                ", naslov='" + naslov + '\'' +
                ", datumIzdanja=" + datumIzdanja +
                ", prisutna=" + prisutna +
                '}';
    }




}
