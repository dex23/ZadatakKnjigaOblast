package model;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by androiddevelopment on 16.1.17..
 */
public class Oblast {
    public static final String POLJE_NAZIV = "naziv";
    public static final String POLJE_POCETNA_STRANA = "pocetna strana";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NAZIV)
    private String naziv;

    @DatabaseField(columnName = POLJE_POCETNA_STRANA)
    private int pocetnaStrana;







}
